import java.util.Stack;

class Solution {
    public static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    } 

    public static void infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }
		
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        System.out.println("Postfix expression: " + result.toString());
    }
}

public class infixToPosFix {

    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression: " + exp);
        Solution.infixToPostfix(exp);
    }
}