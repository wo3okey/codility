package lesson1.Iterations;

import java.util.Stack;

public class BinaryGap {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1610612737));
    }
}

class Solution {
    public int solution(int N) {
        return getMaxBinaryGap(convertBinary(N));
    }

    public String convertBinary(int N) {
        Stack<String> stack = new Stack<>();
        while (true) {
            if (N == 1) {
                stack.push(String.valueOf(N));
                break;
            }
            stack.push(String.valueOf(N % 2));
            N /= 2;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());

        }

        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public int getMaxBinaryGap(String strBinary) {
        int start = 0;
        int binaryCount = 0;
        int binaryLength = 0;
        int maxBinaryGap = 0;

        for (int i = start; i < strBinary.toCharArray().length; i++) {
            if (strBinary.charAt(i) == '0') {
                binaryLength++;
                continue;
            }
            binaryCount++;

            if (binaryCount != 2) {
                continue;
            }

            // occur binary gap
            maxBinaryGap = maxBinaryGap > binaryLength ? maxBinaryGap : binaryLength;

            // init
            binaryCount = 1;
            binaryLength = 0;
        }
        return maxBinaryGap;
    }
}