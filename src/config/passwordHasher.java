
package config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


public class passwordHasher {

    // Hash password with SHA-256 (not secure for production, better use bcrypt)
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashedBytes = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashedBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    // Compare user input (hashed) with stored hash
    public static boolean verifyPassword(String plainPassword, String storedHash) throws NoSuchAlgorithmException {
        String hashedInput = hashPassword(plainPassword);
        return hashedInput.equals(storedHash);
    }
}
