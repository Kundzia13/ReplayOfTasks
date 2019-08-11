import java.util.Scanner;

public class CaesarCipher {
    public static String inputTextMessage() {
        Scanner text = new Scanner(System.in);
        System.out.println("Podaj text do zaszyfrowania");
        String textMessage = text.nextLine();
        return textMessage;
    }

    public static int inputShift() {
        Scanner number = new Scanner(System.in);
        System.out.println("Podaj wielkość przesunięcia");
        int shift = number.nextInt();
        return shift;
    }

    public static String encrypt(String plainText, int key) {
       String ALPHABET ="";
        for (char x = 'A'; x <= 'Z'; x++) {
            ALPHABET+=x;
        }
        plainText = plainText.toUpperCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (key + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static void main(String[] args) {
        String inputMessage = CaesarCipher.inputTextMessage();
        int inputShift = CaesarCipher.inputShift();
        System.out.println(encrypt(inputMessage, inputShift));
    }
}
