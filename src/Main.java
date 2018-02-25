import encrypt.CaesarEncryptor;

public class Main {
    public static void main(String[] args) {
        CaesarEncryptor encryptor = new CaesarEncryptor();
        Controller controller = new Controller(encryptor);
        MyForm form = new MyForm(controller);
        form.pack();
        form.setVisible(true);
        System.exit(0);
    }
}
