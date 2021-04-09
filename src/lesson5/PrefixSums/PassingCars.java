package lesson5.PrefixSums;

import java.util.Arrays;

public class PassingCars {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int[] A = {1, 5, 2, 1, 4, 0};
        System.out.println(s.solution(A));

    }
}

class Solution4 {
    public int solution(int[] A) {
        int maxFront = Integer.MIN_VALUE;
        int minEnd = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            maxFront = maxFront < i + A[i] ? i + A[i] : maxFront;
            minEnd = i - A[i] < minEnd ? i - A[i] : minEnd;
        }
        int length = Math.abs(maxFront) + Math.abs(minEnd);

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int centerIndex = i + Math.abs(minEnd);
            int distance = A[i];

            System.out.print("center : " + centerIndex + " / ");
            System.out.print("distance : " + distance);

            for (int j = centerIndex - distance; j < centerIndex + distance; j++) {
                if (0 < arr[j]) {
                    result++;
                }
                arr[j] += 1;
            }
//            arr[centerIndex - distance]++; // left
//            arr[centerIndex + distance]++; // right
            System.out.println();
        }

        Arrays.stream(arr).boxed().forEach(a -> {
            System.out.print(a + " ");
        });
        System.out.println();

        return result;
    }
}
