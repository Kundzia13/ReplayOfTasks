import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ile liczb należy wylosować?");
        int x = in.nextInt();

        System.out.println("Jaka jest największa liczba jaką można wylosować?");
        int z = in.nextInt();

        //Tworzymy tablicę liczb do losowania
        int[] numbers = new int[z];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        //Tworzymy tablice dla wylosowanych liczb
        int[] result = new int[x];
        for (int i = 0; i < result.length; i++) {

            // lodowanie liczny od 0 do z-1
            Random random = new Random();
            // random losuje liczby z zakresu od 0 do z-1
            int r = random.nextInt(z);
            result[i] = numbers[r];

            // Przesunięcie ostatniego elementu do losowej lokalizacji
            numbers[r] = numbers[z - 1];
            z--; //zmniejszenie wielkości tablicy
        }
        Arrays.sort(result);
        System.out.println("Wylosowane liczby to:");
        for (int r : result)
            System.out.println(r);
    }
}


