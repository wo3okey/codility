package lesson4.CountingElements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String args[]) {
        Solution1 s = new Solution1();

        int[] A = {1,3,1,3,2,1,3};
        int X = 3;
        System.out.print(s.solution(X, A));
    }
}

class Solution1 {
    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1 ; i <= X; i++) {
            set.add(i);
        }

        int result = -1;
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            }

            if (set.isEmpty()) {
                result = i;
                break;
            }
        }
        return result;
    }
}
