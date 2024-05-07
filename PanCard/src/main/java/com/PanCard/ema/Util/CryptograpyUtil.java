package com.PanCard.ema.Util;


import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Enumeration;
import javax.crypto.Cipher;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
//import com.cedge.adhaarcardapi.model.CertificateValidation;

@Component
public class CryptograpyUtil {

	private final static Logger logger = Logger.getLogger(CryptograpyUtil.class);

	public String decryptText(String data, String path, String pass) {
		PrivateKey pri = null;
		Cipher cipher = null;
		String dcr = null;
		try {
			pri = getPrivate(path, pass);
			if (pri != null) {
				cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", "SunJCE");
				cipher.init(Cipher.DECRYPT_MODE, pri);
				byte[] decodedData = Base64.getDecoder().decode(data.getBytes("UTF-8"));
				dcr = new String(cipher.doFinal(decodedData), "UTF-8");
			} else {
				logger.info("Private key is null. Check the getPrivate method.");
			}
		} catch (Exception e) {
			logger.info("Exception occured while decrypting data: "+e.getMessage());
			return dcr="N";
		}
        logger.info("dcr value"+dcr);
		return dcr;
	}

	public String encryptText(String plainText, String certPathNP) {
		FileInputStream fin;
		String encodedData = "";
		Cipher cipher;
		try {
			fin = new FileInputStream(certPathNP);
			CertificateFactory f = CertificateFactory.getInstance("X.509");
			X509Certificate certificate = (X509Certificate) f.generateCertificate(fin);
			PublicKey pk = certificate.getPublicKey();
			cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
			cipher.init(Cipher.ENCRYPT_MODE, pk);
			byte[] cipherData = cipher.doFinal(plainText.getBytes());
			encodedData = Base64.getEncoder().encodeToString(cipherData);
		} catch (Exception e) {
			logger.debug("Exception occued while encrypting data: " + e.getMessage());
		}

		return encodedData;
	}

	public static PrivateKey getPrivate(String path, String password) throws Exception {
		PrivateKey key = null;
//		CertificateValidation certval=null;
		try {
			KeyStore clientStore = KeyStore.getInstance("PKCS12");
			clientStore.load(new FileInputStream(path), password.toCharArray());

			Enumeration<String> aliases = clientStore.aliases();
			String aliaz = "";
			while (aliases.hasMoreElements()) {
				aliaz = aliases.nextElement();
				if (clientStore.isKeyEntry(aliaz)) {
					break;
				}
			}
			char[] pass = password.toCharArray();
			key = (PrivateKey) clientStore.getKey(aliaz, pass);

		} catch (Exception e) {
			logger.debug("Exception occued while getting private key: " + e.getMessage());
//			certval.getPri_key()
		}
//		logger.info("key:"+key);
		return key;
	}

}

