package at.fhj.swd;

/**
 *  Represents a simple symetric cipher for en/decrypting texts. 
 * @author Seuch
 *
 */
public interface Cipher {
	
	/**
	 * Encrypts the given text with the key and returns the encrypting string
	 * @param plainText The unencrypted text(passphrase) that should be encrypted
	 * @param key the used for encryption
	 * @return the encrypted cipher text
	 */
	String encrypt(String plainText, String key);
	/**
	 * Decrypts an encrypted cipher text and returns the resulting plain text
	 * @param cipherText the encrypted text that should be decrypted
	 * @param key the key (passphrase) used for encryption
	 * @return the decrypted plain text 
	 */
	String decrypt(String cipherText, String key);
	
	/**
	 * 
	 * @return A human readable name of the cipher
	 */
	String getCipherName();
	
	
	/**
	 * Checks if the current cipher can use the supplied key for encryption
	 * @param key key which is checked for validity
	 * @return if the key can be used with this kind of cipher <code>true</code> returned, if 
	 * the key is unsuitable for this cipher <code>false</code> is returned.
	 */
	boolean isValidKey(String key);
	
	
}
