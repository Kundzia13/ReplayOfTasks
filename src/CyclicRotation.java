import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int N = A.length;
        if (K >= 0 && K <= 100 && N >= 0 && N <= 100) {
            for (int i = 0; i < N; i++) {
                if (A[i] >= -1_000_000 && A[i] <= 1_000_000) {
                    for (int k = 0; k < K; k++) {
                        int a = A[N - 1];
                        for (int j = N - 1; j > 0; j--) {
                            A[j] = A[j - 1];
                        }
                        A[0] = a;
                    }
                }
                return A;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] result = cyclicRotation.solution(new int[]{6, 7, 9, 5, 4, 3}, 3);
        Arrays.stream(result).forEach(System.out::print);

    }
}
