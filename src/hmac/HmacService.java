package hmac;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HmacService {
    private static final String HMAC_SHA512 = "HmacSHA512";

    public static void main(String[] args) {
        Mac sha512Hmac;
        String result = "";
        final String key = "thisistheapisecret12345678901234567890";
        final String data = "ref_no=1234567890&status=1";

        try {
            final byte[] byteKey = key.getBytes(StandardCharsets.UTF_8);
            sha512Hmac = Mac.getInstance(HMAC_SHA512);
            SecretKeySpec keySpec = new SecretKeySpec(byteKey, HMAC_SHA512);
            sha512Hmac.init(keySpec);
            byte[] macData = sha512Hmac.doFinal(data.getBytes(StandardCharsets.UTF_8));

            // Can either base64 encode or put it right into hex
//            result = Base64.getEncoder().encodeToString(macData);
            result = bytesToHex(macData);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
            // Put any cleanup here
            var b = "77F35875075B0F098D36C70BC9B22B60198BF017B5510BCF116595ED5DB577639BAA4A8CF5B782316A59341394006F8760459E133FF2EAEFB9BC22A2CC2B1DAB";
            System.out.println("Done");
            System.out.println(result);
            System.out.println(b.equalsIgnoreCase(result));
        }
    }

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
