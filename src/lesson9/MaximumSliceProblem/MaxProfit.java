package lesson9.MaximumSliceProblem;

public class MaxProfit {
    public static void main(String[] args) {
//        int[] A = {8, 9, 3, 6, 1, 2};
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};

        Solution s = new Solution();
        System.out.println(s.solution(A));
    }
}

class Solution {
    public int solution(int[] A) {
        int min = Integer.MAX_VALUE; int minIndex = 0;
        int max = Integer.MIN_VALUE; int maxIndex = 0;
        int maxLoss = Integer.MIN_VALUE;

        if (A.length == 0) {
            return 0;
        }

        for (int i = 0; i < A.length; i++) {
            int a = A[i];

            if (a < min) {
                min = a; minIndex = i;
            }

            if (max < a) {
                max = a; maxIndex = i;
            }

            if (maxIndex < minIndex) {
                max = 0;
            }
            int loss = max - min < 0 ? 0 : max - min;
            maxLoss = maxLoss < loss ? loss : maxLoss;
        }
        return maxLoss;
    }
}
