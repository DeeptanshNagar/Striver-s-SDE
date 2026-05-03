import java.util.Stack;

class Solution {

    public static int getPriority(char C) {
        if (C == '^')
            return 3;
        else if (C == '*' || C == '/')
            return 2;
        else if (C == '+' || C == '-')
            return 1;
        return 0;
    }

    public static String infixToPostfix(String infix) {
        infix = '(' + infix + ')';
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if (c == '(') {
                stack.push(c);
            } 
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop();
            } 
            else {
                while (!stack.isEmpty() && getPriority(c) <= getPriority(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
		
        return result.toString();
    }

    public static String infixToPrefix(String infix) {
        StringBuilder sb = new StringBuilder(infix);

        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }

        String postfix = infixToPostfix(sb.toString());

        return new StringBuilder(postfix).reverse().toString();
    }
}

public class infix2prefix {

    public static void main(String[] args) {
        String exp = "(p+q)*(c-d)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix Expression: " + Solution.infixToPrefix(exp));
    }
}