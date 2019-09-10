import java.util.Scanner;

public class Mathematic {
    public static void solution(int t, int a, int b, int n) {

        int sum = a;
        for (int i = 0; i < n; i++) {
            sum += (b * Math.pow(2, i));
            System.out.print(sum + " ");

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0;
        int b = 0;
        int n = 0;

        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            Mathematic.solution(t, a, b, n);
            System.out.println();
        }
        in.close();

    }
}


