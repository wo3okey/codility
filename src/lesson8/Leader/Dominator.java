package lesson8.Leader;

import java.util.*;
import java.util.stream.Collectors;

public class Dominator {
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int[] A = {};
        System.out.println(s.solution(A));
    }
}

class Solution1 {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int resultIndex = -1;
        int resultData = 0;

        if (A.length == 0) {
            return resultIndex;
        }

        for (int i = 0; i < A.length; i++) {
            int a = A[i];

            if (map.containsKey(a)) {
                int count = map.get(a);
                count++;
                map.put(a, count);

                if (max < count) {
                    resultIndex = i;
                    resultData = a;
                    max = count;
                }
                continue;
            }
            map.put(a, 1);
        }

        if (map.size() == 1) {
            return 0;
        }
        return A.length / 2 < map.get(resultData) ? resultIndex : -1;
    }
}

