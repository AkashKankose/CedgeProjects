package com.PanCard.ema.Util;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.Reference;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
@Component
public class XmlValidatior {

    private static final Logger logger = Logger.getLogger(XmlValidatior.class);

    public boolean validateRequestDoc(String mandateRequestDoc, String path) {
        boolean status = true;
        try (FileInputStream fin = new FileInputStream(path)) {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            Document doc = dbf.newDocumentBuilder().parse(new InputSource(new StringReader(mandateRequestDoc)));
            NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");
            if (nl.getLength() == 0) {
                logger.info("No signature element found");
            }
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509Certificate certificate = (X509Certificate) cf.generateCertificate(fin);
            PublicKey publicKey = certificate.getPublicKey();

            DOMValidateContext valContext = new DOMValidateContext(publicKey, nl.item(0));
            XMLSignature signature = fac.unmarshalXMLSignature(valContext);
            boolean coreValidity = signature.validate(valContext);
            logger.info("Core validity: " + coreValidity);
            if (!coreValidity) {
                boolean sv = signature.getSignatureValue().validate(valContext);
                Iterator<?> i = signature.getSignedInfo().getReferences().iterator();
                while (i.hasNext()) {
                    boolean refValid = ((Reference) i.next()).validate(valContext);
                }
                status = false;
            }

        } catch (IOException | SAXException | javax.xml.parsers.ParserConfigurationException e) {
            logger.error("Exception occurred while parsing XML: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Unexpected exception occurred: " + e.getMessage());
        }
        return status;
    }

//    public static void main(String[] args) {
//    	XmlValidatior validator = new XmlValidatior();
//        String mandateRequestDoc = "<Signature>...</Signature>"; // Example XML signature
//        String path = "/path/to/certificate.crt"; // Example path to certificate
//        boolean isValid = validator.validateRequestDoc(mandateRequestDoc, path);
//        System.out.println("Document validation result: " + isValid);
//    }
}

