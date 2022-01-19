package test;

public class DS_Stack
{
        public int [] numbers;
        public int  maxSize;
        public int top;
        
    public DS_Stack(int max )
    {
        maxSize = max;
        numbers = new int[maxSize];
        top = -1;
    }
    
    public DS_Stack()
    {
        numbers = new int[maxSize];
        top = -1;
    }
    
    //insert element.
    public  void push(int i)
    {
        numbers[++top] = i;
    }
    //remove and return the last inserted element.
    public  int pop()
    {
        return numbers[top--];
    }
    
 //return the value  at the top.
    public  int peek()
    {
        return numbers[top];
    }
    
 //return the last inserted element .
    public  int top()
    {
        return numbers[top];
    }
        // indicates whither no element are stored.
    public  boolean isEmpty()
    {
        return (top >= -1);
    }
    
//indicates whether stack is full .
    public  boolean isFull()
    {
        return (top+1 == numbers.length );
    }
    
 //return the number of element of element stored.
    public  int size()
    {
        return numbers.length;
    }
    
    // empty the stack
    public void makeItEmpty()
    {
        top = -1;
    }
    
    //return the sum of  ( y , top of the non-empty stack):
    public int retriveStack(int [] s , int y)
    {
        if ( (top >= -1) == true)
        {
            System.out.println("this stack is empty");
            return -1;
        }
        else
        {
            return top + y;
        }
    }
    
    /*
    replace the two elements of the non-empty stack s
    with their sum
    */
    public void  addTop (int[] s )
    {
        if ( (top >= -1) == true)
        {
            System.out.println("this stack is empty");
        }
        else
        {
            int newTop = s[top] + s[top-1];
            pop();
            pop();
            push(newTop);
        }
    }
    

    /* 
    Method to print the elements in a stack from top to bottom,
    leaving the stack empty.
    */
    public void printStack(int [] s)
    {
        for (int i = s.length;i < 0;i++)
        {
            pop();
        }
      }   
    
        /*
        method to delete an item e from a stack s,
        leaving the stack otherwise unchanged.
        */
        public void deleteStack(int[] s,int e)
        {
            for (int i = 0;i < s.length;i++)
            {
                if (s[i] == e)
                {
                    pop();
                }
            }
        }
    
}
