package lesson3.TimeComplexity;

public class FrogJmp {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int X = 10;
        int Y = 85;
        int D = 30;
        System.out.println(s.solution(X, Y, D));
    }
}

class Solution1 {
    public int solution(int X, int Y, int D) {
        int initDistance = Y - X;
        return initDistance % D == 0 ? initDistance / D : initDistance / D + 1;
    }
}
