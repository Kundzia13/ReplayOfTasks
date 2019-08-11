import java.util.Arrays;
import java.util.Collections;

//There are N coins, each showing either heads or tails.
//We would like all the coind show the same face.
//What is the minimum number of coins that must be reversed?
public class Coin {
    public int solution(int[] A) {
        int numberTails = 0;
        int numberHeads = 0;

        // 0 represent heads and 1 represent tails

        for (int a : A) {
            if (a == 1)
                numberTails++;
            else
                numberHeads++;
        }
        //Returns the smaller of two values
        return Math.min(numberHeads, numberTails);
    }

    public int solution2(int[] A) {
        return Math.min(Collections.frequency(Arrays.asList(A), 1),
                Collections.frequency(Arrays.asList(A), 0));
    }

    public int solution3(int[] A) {
        return Math.min(
                (int) Arrays.stream(A).filter(a -> a == 1).count(),
                (int) Arrays.stream(A).filter(a -> a == 0).count());
    }
    public static void main(String[] args) {
        Coin solution = new Coin();
        System.out.println(solution.solution(new int[]{1, 0, 0, 1, 0, 0}));
    }
}
