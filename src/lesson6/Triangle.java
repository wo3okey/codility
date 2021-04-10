package lesson6;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int[] A = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
//        int[] A = {10,50,5,1};
        System.out.println(s.solution(A));
    }

//    1 5 10 50
}

class Solution4 {
    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A.length <= i + 2) {
                break;
            }

            long sum = (long)A[i] + (long)A[i + 1];
            if (A[i + 2] < sum) {
                return 1;
            }
        }
        return 0;
    }
}
