package lesson3.TimeComplexity;

import java.util.HashMap;
import java.util.Map;

public class TapeEquilibrium {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(s.solution(A));
    }
}

class Solution3 {
    public int solution(int[] A) {
        long sum = 0;
        Map<Integer, Long> sumMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            sumMap.put(i, sum);
        }

        long min = Integer.MAX_VALUE;
        for (int p = 1; p <= A.length - 1; p++) {
            min = Math.abs(sum - 2 * sumMap.get(p - 1)) < min ? Math.abs(sum - 2 * sumMap.get(p - 1)) : min;
        }

        return (int) min;
    }
//
//    p = 1 // (A[0]                     ) - (A[1] + A[2] + A[3] + A[4])
//    p = 2 // (A[0] + A[1]              ) - (A[2] + A[3] + A[4])
//    p = 3 // (A[0] + A[1] + A[2]       ) - (A[3] + A[4])
//    p = 4 // (A[0] + A[1] + A[2] + A[3]) - (A[4])
//
}
