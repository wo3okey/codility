package lesson2.Arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        Solution2 s = new Solution2();

        int[] A = {9, 3, 9, 3, 9, 7, 9};
        s.solution(A);
    }
}

class Solution2 {
    public int solution(int[] A) {
        Map<Integer, Integer> pairMap = new HashMap<>();
        for (int a : A) {
            if (pairMap.containsKey(a)) {
                int count = pairMap.get(a);
                pairMap.put(a, ++count);
                continue;
            }
            pairMap.put(a, 1);
        }

        // find unpair
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : pairMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
