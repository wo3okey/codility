package lesson5.PrefixSums;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        Solution3 s = new Solution3();

//        int[] A = {4,2,2,5,1,5,8};
//        int[] A = {10000,-10000};
        int[] A = {-10, 4, -3, -5, 7, 0};
        System.out.println(s.solution(A));
    }
}

class Solution3 {
    public int solution(int[] A) {
        int[] sumArr = new int[A.length];

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            sumArr[i] = sum;
        }

//        -10 -6 -9 -14 -7 0

        float min = Float.MAX_VALUE;
        int result = -1;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (i == j) { continue; }

//                System.out.print("i:" + i + " / j:" + j + " = ");
                float partSum;
                if (i == 0) {
                    partSum = (float)sumArr[j] / (j - i + 1);
                } else {
                    partSum = (float)(sumArr[j] - sumArr[i - 1]) / (j - i + 1);
                }
//                System.out.print(partSum + "                ");
                if (partSum < min) {
                    min = partSum;
                    result = i;
                }
            }
//            System.out.println();
        }
        return result;
    }
}
