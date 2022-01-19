package test;
public class DS_ADT_Queue
{
    private int [] numbers;
    private int maxSize;
    private int head;
    private int rear;
    DS_ADT_Queue()
    {
        head = -1 ;
        rear = -1;
    }

    public DS_ADT_Queue(int max)
    {
        if(max <= 0)
        {
            System.err.println("sorry the size you enter is not valid");
            System.exit(0);
        }
        numbers = new int[max];
        maxSize = max;
        head = -1 ;
        rear = -1;
    }
    
    /* show the H(head) and the (rear) of the queue 
     then it's elements */
    public void display()
    {
        if (isEmpty())
        {
            System.err.println("the queue is empty ...");
        }
        else
        {
            head = 0;
           System.out.println(" (H : " + numbers[head]+")"+
                   "(  R : " + numbers[rear]+")");
           
            System.out.print("the queue :  ");
            for (int i = 0;i <= rear ;i++)
            {
                System.out.print(numbers[i] + " , ");
            }
        }
        
    }
    
    // return true if the queue is empty :
    public boolean isEmpty()
    {
        return ((head<=-1)&&(rear<=-1) == true);
    }
    // return true if the queue is full :
    public boolean isFull()
    {
        return ((rear == maxSize-1) == true);
    }
    // add an element :
    public void enQueue(int newElement)
    {
        if (rear == maxSize-1)
        {
            System.err.println("sorry the queue is full ...");
        }
        else
        {
            rear++;
            numbers[rear] = newElement;
            head = 0;
        }
    }
    // remove an element :
   public void deQueue()
        {
            for (int i = head ;i < rear ;i++)
            {
                numbers[i] = numbers[i+1];
            }
            rear--;
        }
        
   
    
}
