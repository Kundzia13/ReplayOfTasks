//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.


public class TheSmallestNumber {
    public int solution(int[] A) {
        int a = 1;
        if (A.length > 0 && A.length <= 100_000) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] >= -1_000_000 && A[i] <= 1_000_000) {

                    for (int k = 0; k < A.length; k++) {
                        for (int j = 0; j < A.length; j++) {
                            if (A[j] >= 1) {
                                if (A[j] == a) {
                                    a++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        TheSmallestNumber solution = new TheSmallestNumber();
        System.out.println(solution.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}
