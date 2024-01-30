package stackandqueue;

import java.util.Stack;

public class _150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int operand2 = s.pop();
                int operand1 = s.pop();
                switch(token){
                    case "+":
                        s.push(operand1 + operand2);
                        break;
                    case "-":
                        s.push(operand1 - operand2);
                        break;
                    case "*":
                        s.push(operand1 * operand2);
                        break;
                    case "/":
                        s.push(operand1 / operand2);
                        break;
                    default:
                        break;
                }
            }
            else{
                s.push(Integer.valueOf(token));
            }
        }
        return s.pop();
    }
}
