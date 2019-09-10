//A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
//
//        For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
//
//        Write a function:
//
//class Solution { public int solution(int N); }
//
//that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
//
//        For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
//
//        Write an efficient algorithm for the following assumptions:
//        N is an integer within the range [1..2,147,483,647].

public class LiczbyBinarne {
    public int solution(int N) {
        String word = "";
        if (N >= 0 && N <= 2_147_483_647) {
            int b;
            int a = N;
            while (a >= 1) {
                b = a % 2;
                a /= 2;
                word += b;
            }
        }
        int result = 0;
        if (word.contains("0")) {
            StringBuilder reverseWord = new StringBuilder();
            reverseWord.append(word);
            reverseWord = reverseWord.reverse();
            System.out.println(reverseWord);
            String splited = new String(reverseWord);
            String[] splitedArray = splited.split("1");
            int y=splitedArray.length-1;
            if (reverseWord.charAt(reverseWord.length() - 1) == 0) {
            y--;
            }
            int[] a = new int[y];
            if (y > 0) {
                for (int i = 1; i < y; i++) {
                    a[i] = splitedArray[i].length();
                    for (int j = 0; j < a.length; j++) {
                        if (a[i] > result) {
                            result = a[i];
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LiczbyBinarne solution = new LiczbyBinarne();
        System.out.println(solution.solution(1041));
        System.out.println(solution.solution(15));
        System.out.println(solution.solution(32));
    }
}

