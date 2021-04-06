package lesson4.CountingElements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {
        Solution4 s = new Solution4();

        int[] A = {1, 2};
        System.out.print(s.solution(A));
    }
}

class Solution4 {
    public int solution(int[] A) {
        int n = A.length;
        int sum = (n * (n + 1)) / 2;

        int aSum = 0;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            aSum += a;
            set.add(a);
        }

        return sum == aSum && n == set.size() ? 1 : 0;
    }
}
