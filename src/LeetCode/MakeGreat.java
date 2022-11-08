package LeetCode;

import java.util.Stack;

public class MakeGreat {
    public static String makeGood(String s) {
        Stack<Character> stack = new  Stack<>();
        for(int i = 0; i<s.length(); i++) {
            char current = s.charAt(i);
            if(!stack.isEmpty()
                    && stack.peek().toString().equalsIgnoreCase(String.valueOf(current))
                    && stack.peek() != current
            ) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char current : stack) {
            sb.append(current);
        }
        return sb.toString();
    }
}
