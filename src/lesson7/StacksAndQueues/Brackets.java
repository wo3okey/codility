package lesson7.StacksAndQueues;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String S = "{[()()]}";
//        String S = "{{{{";
        System.out.println(s.solution(S));
    }
}

class Solution1 {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return 0;
            }

            char open = stack.pop();
            char close = c;
            if ((open == '(' && close != ')') || (open == '{' && close != '}') || (open == '[' && close != ']')) {
                return 0;
            }
        }

        if (!stack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
