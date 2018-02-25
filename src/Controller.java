import encrypt.IEncryptor;

public class Controller {
    private IEncryptor encryptor;

    public Controller(IEncryptor encryptor) {
        this.encryptor = encryptor;
    }

    public String onCode(String incomingText, Integer key) {
        return encryptor.onCode(incomingText, key);
    }

    public String onDecode(String incomingText, Integer key) {
        return encryptor.onDecode(incomingText, key);
    }
}
