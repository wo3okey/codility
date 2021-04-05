package lesson3.TimeComplexity;

public class TapeEquilibrium {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(s.solution(A));
    }
}

class Solution3 {
    public int solution(int[] A) {
        int[] P = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            P[i] = (i + 1);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < P.length; i++) {
            int elementP = P[i];

            int frontSum = 0;
            for (int j = 0; j < elementP; j++) {
                frontSum += A[j];
            }

            int endSum = 0;
            for (int j = elementP; j < A.length; j++) {
                endSum += A[j];
            }

            min = Math.abs(frontSum - endSum) < min ? Math.abs(frontSum - endSum) : min;
        }
        return min;
    }
}
