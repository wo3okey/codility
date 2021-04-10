package lesson7.StacksAndQueues;

import java.util.Stack;

public class StoneWall {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};
//        int[] H = {1,1,1};
//        int[] H = {2,3,2,1};
//        int[] H = {1, 2, 3, 3, 2, 1};
        System.out.println(s.solution(H));
    }
}

class Solution4 {
    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int blockCount = 0;

        for (int i = 0; i < H.length; i++) {
            int curWall = H[i];
            while (!stack.isEmpty()) {
                int stackWall = stack.peek();

                // 현재 벽이 전 벽과 높이가 같으면 패스
                if (stackWall == curWall) {
                    break;
                }

                // 현재 벽이 전 벽보다 높이가 높으면 스택에 넣음
                if (stackWall < curWall) {
                    stack.push(curWall);
                    blockCount++;
                    break;
                }

                // 현재 벽이 전 벽보다 높이가 작으면 스택에서 뺌
                stack.pop();
            }

            // 블럭 스택에 넣기
            if (stack.isEmpty()) {
                stack.push(curWall);
                blockCount++;
                continue;
            }
        }
        return blockCount;
    }
}
