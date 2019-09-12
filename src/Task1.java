public class Task1 {
    public int solution(int[] A) {
        int result = 0;
        int number = 0;
        while (number >= 0) {
            number = A[number];
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.solution(new int[]{-1, 1, 4, -1, 3, 2}));
    }
}
