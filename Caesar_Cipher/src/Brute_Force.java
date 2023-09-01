import java.util.Scanner;

public class Brute_Force {

    public static void main(String[] args) {

        // Variables
        Scanner scanner = new Scanner(System.in);
        String openText = "";

        // Get the encrypted text
        System.out.print("Insert the encrypted text: ");
        String encryptedText = scanner.nextLine();

        // //iterate through the alphabet
        for (int i=0; i<26; i++){

            // Iterate through the encrypted text
            for (int i2=0; i2<encryptedText.length(); i2++){

                // Add the letter to the open text using i key
                openText += (char) ((int) encryptedText.charAt(i2) - i);

            }

            // Show open text using i key and the key
            System.out.print("Open text: " + openText + "\n");
            System.out.print("Key: " + i + "\n\n");

            // Reset the open text
            openText = "";

        }
    }
}
