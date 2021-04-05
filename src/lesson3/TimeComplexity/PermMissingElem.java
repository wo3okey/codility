package lesson3.TimeComplexity;

public class PermMissingElem {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] array = {2, 3, 1, 5};
        System.out.println(s.solution(array));
    }
}

class Solution2 {
    public int solution(int[] A) {
        long end = A.length + 1;
        long sum = (end * (end + 1)) / 2;

        for (int i = 0; i < A.length; i++) {
            sum = sum - A[i];
        }
        return (int) sum;
    }
}
