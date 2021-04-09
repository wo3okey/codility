package lesson5.PrefixSums;

import java.util.Arrays;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        Solution2 s = new Solution2();

        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};

        int[] results = s.solution(S, P, Q);
        Arrays.stream(results).boxed().forEach(a -> {
            System.out.print(a + " ");
        });
        System.out.print(s.solution(S, P, Q));
    }
}

class Solution2 {
    public int[] solution(String S, int[] P, int[] Q) {
        final int SIZE = 4;
        int[][] changes = new int[S.length() + 1][SIZE];

        // init
        int[] change = {0,0,0,0};
        int count = 0;
        changes[count] = change;

        // set change
        for (int i = 0; i < S.length(); i++) {
            change = getChange(change, S.charAt(i));
            changes[++count] = change;
        }

        // sub result
        int[] result = new int[P.length];
        for (int i = 0;  i < P.length; i++) {
            int[] beginChange = changes[P[i]];
            int[] endChange = changes[Q[i] + 1];

            int[] sub = {endChange[0] - beginChange[0], endChange[1] - beginChange[1], endChange[2] - beginChange[2], endChange[3] - beginChange[3]};
            for (int j = 0; j < sub.length; j++) {
                if (0 < sub[j]) {
                    result[i] = (j + 1);
                    break;
                }
            }
        }
        return result;
    }

    public int[] getChange(int[] arr, char chr) {
        int[] change = Arrays.copyOf(arr, arr.length);

        switch (chr) {
            case 'A' : change[0] += 1; break;
            case 'C' : change[1] += 1; break;
            case 'G' : change[2] += 1; break;
            case 'T' : change[3] += 1; break;
            default: break;
        }
        return change;
    }
}


