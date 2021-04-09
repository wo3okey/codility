package lesson5.PrefixSums;

public class CountDiv {
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int A = 11;
        int B = 345;
        int K = 17;
        System.out.print(s.solution(A, B, K));
    }
}

class Solution1 {
    public int solution(int A, int B, int K) {
        int result = 0;

        if (A <= K && K <= B) {
            result = 1;
        }

        if (A % K == 0) {
            result++;
        }

        if (B % K == 0) {
            result++;
        }

        int diff = B - A;

        result += (diff / K);
        return result;
    }
}


