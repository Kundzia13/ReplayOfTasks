import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipherTXT {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner text = new Scanner(file);
        String messageFromTxt = text.nextLine();
        int shift = 3;

        String cipherText = CaesarCipher.encrypt(messageFromTxt, shift);
        System.out.println(CaesarCipher.encrypt(messageFromTxt, shift));

        PrintWriter save = new PrintWriter("cipherText.txt");
        save.println(cipherText);
        save.close();
    }
}
