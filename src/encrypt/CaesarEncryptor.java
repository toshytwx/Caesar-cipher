package encrypt;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CaesarEncryptor implements IEncryptor {
    public static int power = -1;

    @Override
    public String onCode(String incomingText, Integer key) {
        StringBuilder sb = new StringBuilder();
        if (incomingText != null || !incomingText.equals("") || key != null) {
            char[] incomingChars = incomingText.toCharArray();
            for (int i = 0; i < incomingChars.length; i++) {
                char c = (char) (((int) incomingChars[i] + key) % power);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @Override
    public String onDecode(String incomingText, Integer key) {
        StringBuilder sb = new StringBuilder();
        if (incomingText != null || !incomingText.equals("") || key != null) {
            char[] incomingChars = incomingText.toCharArray();
            for (int i = 0; i < incomingChars.length; i++) {
                char c = (char) (((int) incomingChars[i] + power - (key % power)) % power);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
