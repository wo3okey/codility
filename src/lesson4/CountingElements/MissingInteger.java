package lesson4.CountingElements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static void main(String[] args) {
        Solution3 s = new Solution3();

//        int[] A = {1, 3, 6, 4, 1, 2};
//        int[] A = {1,2,3};
//        int[] A = {-1, -3};
//        int[] A = {0};
//        int[] A = {4,5,6,2};
        int[] A = new int[40000];
        for (int i = 0; i < 40000; i++) {
            A[i] = i + 1;
        }
        A[2482] = -1;
        System.out.print(s.solution(A));
    }
}

class Solution3 {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
