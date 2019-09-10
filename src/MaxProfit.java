public class MaxProfit {
    public int solution(int[] A) {
        int N = A.length;
        int result = 0;
        int ok = 0;

        if (N > 0 && N <= 400_000) {
            for (int i = 0; i < N; i++) {
                if (A[i] >= 0 && A[i] <= 200_000) {
                    ok++;
                }
            }
        }
        if (ok == N) {
            for (int k = 0; k < N; k++) {
                for (int j = 1; j < N; j++) {
                    if (j > k) {
                        int y = A[j] - A[k];
                        if (y > result) {
                            result = y;

                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.solution
                (new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }

}
