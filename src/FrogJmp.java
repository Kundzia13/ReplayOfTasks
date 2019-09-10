public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int result = 0;
        if (X >= 0 && Y >= 0 && D >= 0 && X <= 1_000_000_000 && Y <= 1_000_000_000
                && D <= 1_000_000_000 && X <= Y) {
            int a = (Y - X) / D;
            int b = (Y - X) % D;
            if (b == 0) {
                result = a;
            } else {
                result = a + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FrogJmp frogJmp = new FrogJmp();
        System.out.println(frogJmp.solution(10, 85, 30));
    }
}
