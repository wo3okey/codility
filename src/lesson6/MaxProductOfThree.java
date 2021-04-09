package lesson6;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] A = {10, 4, -3, -5, 7, 0};
        System.out.println(s.solution(A));
    }
}

class Solution2 {
    public int solution(int[] A) {
        int N = A.length - 1;
        Arrays.sort(A);

        // 끝이 마이너스
        if (A[N] <= 0) {
            return A[N] * A[N - 1] * A[N - 2];
        }

        // 마이너스 플러스 혼합
        int left = A[0] * A[1] * A[N];
        int right = A[N] * A[N - 1] * A[N - 2];

        return left < right ? right : left;
    }
}
