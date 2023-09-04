import java.util.Scanner;

public class Encrypter {
    public static void main(String[] args) {

        //variables
        Scanner scanner = new Scanner(System.in);
        String pureText;
        int key;
        int numberEncrypted;
        String encryptedText = "";

        //receiving text to be encrypted
        System.out.print("Insira o texto que será criptografado: ");
        pureText = scanner.nextLine();
        //System.out.println("Texto recebido: " + pureText);

        //asking the key to be used
        System.out.print("Insira a chave de criptografia de César: ");
        key = scanner.nextInt();
        //System.out.println("Chave recebida: " + key);

        //receiving the key and encrypting the text
        //System.out.print(pureText.charAt(0));
        for (int i = 0; i < pureText.length(); i++) {
            numberEncrypted = (int)pureText.charAt(i) + key;
            encryptedText = encryptedText + (char)numberEncrypted;
        }

        //showing the result of encrypted text
        System.out.print(encryptedText);

    }
}