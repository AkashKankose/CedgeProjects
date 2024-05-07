package com.PanCard.ema.Util;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.lang.JoseException;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;

@Component
public class JWSTokenGenerator {
	
	 private static PrivateKey loadPrivateKeyFromPFX(String pfxFilePath, String password) throws Exception {
	        KeyStore clientStore = KeyStore.getInstance("PKCS12");
	        clientStore.load(new FileInputStream(pfxFilePath), password.toCharArray());

	        // Assuming there is only one private key entry in the keystore
	        String alias = clientStore.aliases().nextElement();
	        return (PrivateKey) clientStore.getKey(alias, password.toCharArray());
	    }
	 
	  private static String signPayload(String payload, PrivateKey privateKey) throws JoseException {
	        JsonWebSignature jws = new JsonWebSignature();
	        jws.setPayload(payload);
	        jws.setKey(privateKey);
	        jws.setAlgorithmHeaderValue(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA512);

	        return jws.getCompactSerialization();
	    }
	  
	public String genrateToken(Object jsonObj,String bankcert,String bankPass) throws Exception 
	{

            String pfxFilePath = bankcert;
            String password =bankPass;
	        String jwsCompactSerialization = null;
	        
	        PrivateKey privateKey = loadPrivateKeyFromPFX(pfxFilePath, password);
    	    Gson gson = new Gson();
    	    String payload = gson.toJson(jsonObj);
    	    
    	    try {
				jwsCompactSerialization = signPayload(payload, privateKey);
			} catch (JoseException e) {
				e.printStackTrace();
			}
    	    return jwsCompactSerialization;
		}

}