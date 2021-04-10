package lesson7.StacksAndQueues;

import java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
//        int[] A = {0,1};
//        int[] B = {1,1};

        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        System.out.println(s.solution(A, B));
    }
}

class Solution2 {
    public int solution(int[] A, int[] B) {
        int n = A.length;
        int aliveFish = 0;
        int eatFishSize;

        Stack<Integer> eatFishStack = new Stack<>();
        for (int curFishIndex = 0; curFishIndex < n; curFishIndex++) {
            if (B[curFishIndex] == 1) {
                eatFishStack.push(curFishIndex);
                continue;
            }

            while (!eatFishStack.isEmpty()) {
                eatFishSize = A[eatFishStack.peek()];
                if (A[curFishIndex] < eatFishSize) {
                    break;
                }
                eatFishStack.pop();
            }

            if (eatFishStack.isEmpty()) {
                aliveFish++;
                continue;
            }
        }
        return aliveFish + eatFishStack.size();
    }
}
