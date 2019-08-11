import java.util.Arrays;

public class CountEvenIntegers {
    public int solution(int[] A){
        return Arrays.stream(A).filter(a->a%2==0).sum();
    }
    public int solution2(int[] A) {
        int sum = 0;
        for (int a : A) {
            if (a % 2 == 0) {
                sum += a;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        CountEvenIntegers solution = new CountEvenIntegers();
        System.out.println(solution.solution(new int[]{-6,-91,1011,-100,84,-22,0,1,473}));
        System.out.println(solution.solution2(new int[]{-6,-91,1011,-100,84,-22,0,1,473}));
    }
}
