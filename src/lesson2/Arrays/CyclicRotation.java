package lesson2.Arrays;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] A = {0, 0, 0};
        int[] result = s.solution(A, 3);
        System.out.println();
    }
}

class Solution1 {
    public int[] solution(int[] A, int K) {
        int rotateCount = 0;

        while (rotateCount != K) {
            int[] originArr = A;
            int[] copyArr = Arrays.copyOf(A, A.length);
            int lastIdx = A.length - 1;

            for(int i = 0; i < copyArr.length; i++) {
                if (i == lastIdx) {
                    copyArr[0] = originArr[lastIdx];
                } else {
                    copyArr[i + 1] = originArr[i];
                }
            }

            A = copyArr;
            rotateCount++;
        }
        return A;
    }
}