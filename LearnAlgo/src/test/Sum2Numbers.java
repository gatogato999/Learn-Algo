package test;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Sum2Numbers
{

    public static void main(String[] args)
    {
        LinkedList<Integer> result;
        String num1 = ( JOptionPane.showInputDialog("inter the first long string ..."));
        String num2 = ( JOptionPane.showInputDialog("inter the second long string ..."));
        result = sum(num1, num2);
          JOptionPane.showMessageDialog(null,result.toString());
    }

    public static LinkedList assign(String s)
    {
        LinkedList l = new LinkedList();
        for (int i = s.length() - 1; i >= 0; i--) {
            l.add(Character.getNumericValue(s.charAt(i)));
        }

        return l;
    }

    public static void addZeros(LinkedList l, int margin)
    {
        for (int i = 1; i <= margin; i++) {
            l.addLast(0);
        }
    }

    public static LinkedList sum(String num1, String num2)
    {
        LinkedList<Integer> num, secondNum, result;
        num = new LinkedList();
        secondNum = new LinkedList();
        num = assign(num1);
        secondNum = assign(num2);

        if (num1.length() < num2.length()) {
            addZeros(num, num2.length() - num1.length());
        }
        else {
            if (num2.length() < num1.length()) {
                addZeros(secondNum, num1.length() - num2.length());
            }
        }

        result = new LinkedList();
        int carry = 0;
        for (int i = 0; i < Math.max(num1.length(), num2.length()); i++) {
            num.set(0, num.getFirst() + carry);
            int added = (int) secondNum.pollFirst() + (int) num.pollFirst();
            int sum = added % 10;
            carry = added / 10;

            result.addFirst(sum);
        }

        if (carry != 0) {
            result.addFirst(carry);
        }

        return result;
    }

}
