package lesson7.StacksAndQueues;

import java.util.Stack;

public class Nesting {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
//        String S = "(()(())())";
        String S = "())";
        System.out.println(s.solution(S));
    }
}

class Solution3 {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return 0;
            }

            char open = stack.pop();
            char close = c;
            if ((open == '(' && close != ')')) {
                return 0;
            }
        }

        if (!stack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
