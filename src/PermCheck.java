import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        int N = A.length;
        int result = 0;
        int check = 1;
        int ok = 0;
        if (N > 0 && N <= 100_000) {
            for (int i = 0; i < N; i++) {
                if (A[i] >= -1_000_000_000 && A[i] <= 1_000_000_000) {
                    ok++;
                }
            }
        }
        if (ok == N) {
//            Arrays.sort(A);
            for (int k = 0; k <N; k++) {
                for (int j = 0; j < N; j++) {
                    if (A[j] == check) {
                        check++;
                    }
                }
            }
        }
        if (check - 1 == N) {
            result = 1;

        }
        return result;
    }

    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(new int[]{1, 4, 2, 5, 3}));
    }
}
