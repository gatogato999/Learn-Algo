package test;

import java.util.Stack;
import javax.swing.JOptionPane;

/* 
 * Algorithm :
 * 1. Scan the infix expression from left to right.
 * 2. If the scanned character is an operand, output it.
 * 3. Else,
 * 1 If the precedence of the scanned operator is
 * greater than the precedence of the operator in the stack
 * (or the stack is empty or the stack contains a ‘(‘ ), push it.
 * 2 Else, Pop all the operators from the stack which are
 * greater than or equal to in precedence than that of the scanned operator.
 * After doing that Push the scanned operator to the stack.
 * (If you encounter parenthesis while
 * popping then stop there and push the scanned operator in the stack.)
 * 4. If the scanned character is an ‘(‘, push it to the stack.
 * 5. If the scanned character is an ‘)’, pop the stack and output it until a
 * ‘(‘ is encountered, and discard both the parenthesis.
 * 6. Repeat steps 2-6 until infix expression is scanned.
 * 7. Print the output
 * 8. Pop and output from the stack until it is not empty.
 */
public class InfixToPostfix
{

    static int Prec(char ch)
    {
        //Higher returned value means higher precedence.
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String exp)
    {
        // initializing empty String for result.
        String result = new String("");

        // initializing empty stack.
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c)) {
                result = result + c;
            }

            // If the scanned character is an '(',  push it to the stack.
            else {
                if (c == '(') {
                    stack.push(c);
                }

                else {
                    //  If the scanned character is an ')', 
                    if (c == ')') {
                        //pop and output from the stack until an '(' is encountered.
                        while (!stack.isEmpty()&& stack.peek() != '(')
                        {
                            result = result + stack.pop();
                        }
                        try {
                            stack.pop();
                        }
                        catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error", "some thing went wrong", 0);
                            System.err.println("something went wrong ...");
                        }
                        
                    }
                    else // an operator is encountered
                    {
                        
                        while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) 
                        {

                            result += stack.pop();
                        }
                        stack.push(c);
                    }
                }
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression";
            }
            result = result + stack.pop();
        }
        return result;
    }

    
    public static void main(String[] args)
    {
        String exp = ( JOptionPane.showInputDialog("inter the infix expertion..."));
        JOptionPane.showMessageDialog(null,infixToPostfix(exp));
       
    }

}
