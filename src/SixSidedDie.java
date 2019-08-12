import java.util.*;

public class SixSidedDie {

//    There are N die lying on a table, each showing the pips on its top face.
//    In one move you can take one die and rotate it to an adjacent face.
//    For example you can rotate die that shows 1 so that it shows 2,3,4,5.
//    However, it cannot show  6 in a singe move, because on the face with one pip and six pips visible are on opposite sides rather  than adjacent.
//    You want to show the same number of pips on the top of faces of all N dice.
//    Count the minimum number of moves needed to get equal faces.

    public int solution(int[] A) {
        int[] number = new int[6];
        // tablica zawierająca ilości powtarzania się każdej kolejnej kropki
        for (int i = 0; i < number.length; i++) {
            int n = i + 1;
            number[i] = (int) Arrays.stream(A).filter(a -> a == n).count();
        }
        // ilość kości
        int sum = Arrays.stream(number).sum();

        // szukamy indeksu najwiekszego elementu tabeli
        int max = 0;
        for (int i = 1; i < number.length; i++) {
            if (number[i] > number[max])
                max = i;
        }
        int x = max + 1;

        int result = sum - number[max] + number[5 - max];
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę kości");
        int dieNumber = in.nextInt();

        Random random = new Random();
        int[] A = new int[dieNumber];
        for (int i = 0; i < A.length; i++) {
            int r = random.nextInt(dieNumber) + 1;
            A[i] = r;
        }

        System.out.println(Arrays.toString(A));

        SixSidedDie sixSidedDie = new SixSidedDie();
        System.out.println("Najmniejsza liczba ruchów to:");
        System.out.println(sixSidedDie.solution(A));
    }
}
