package gov.ohio.jfs.cots.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.security.GeneralSecurityException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gov.ohio.jfs.cots.cpi.CPILog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = gov.ohio.jfs.cots.util.UtilsConfig.class)

public class CryptoUtilsTest {

    String plainString = "plainString";
    String encryptedString = "";
    String decryptedString = "";

    @Test
    public void testEncryption() throws GeneralSecurityException {
	encryptedString = plainString;
	assertEquals(plainString, encryptedString);
	encryptedString = CryptoUtils.encrypt(plainString);
	assertNotEquals(plainString, encryptedString);
    }

    @Test
    public void testDecryption() throws GeneralSecurityException {
	assertNotEquals(plainString, decryptedString);
	encryptedString = CryptoUtils.encrypt(plainString);
	decryptedString = CryptoUtils.decrypt(encryptedString);
	assertEquals(plainString, decryptedString);
    }
}
