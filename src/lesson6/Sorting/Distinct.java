package lesson6.Sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.println(s.solution(A));
    }
}

class Solution1 {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);
        }
        return set.size();
    }
}