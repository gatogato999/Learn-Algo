package test;

public class DS_LinkedList
{
    /*
    @var head [points to the first info in the list].
    @var contentIndex [points to next info(content)].
     @var content [the info].
     @var maxSize [the max size of (the chane)column array].
     */
    private int[][] chane;
    private int maxSize;
    private int head;

    DS_LinkedList(int chaneLength)
    {
        chane = new int[chaneLength][2];
        maxSize = chaneLength;
        head = -1;
    }
    void insert_at_begin(int element)
    {
        if (isFull() == true)
        {
            System.err.println("sorry the list is full... ");
        }
        else
        {
            head = 0;
            chane[head][1] = element;
            chane[head][2]++;
        }
    }

    void insert_at_end(int element)
    {
        if (isFull() == true)
        {
            System.err.println("sorry the list is full... ");
        }
        else
        {
            head = 0;
            chane[maxSize - 1][1] = element;
            chane[maxSize - 1][2]++;
        }
    }

    void insert_this_before_element(int newElement, int nextIndex)
    {
    }

    void insert_this_after_element(int newElement, int previousIndex)
    {
    }
    int getFree()
    {
        return 0;
    }

    boolean isEmpty()
    {
        return ( ( head == -1 && chane[maxSize - 1][2] == -1 ) == true );
    }

    boolean isFull()
    {
        return ( ( head == 0 && maxSize == chane[maxSize][2] ) == true );
    }

    void display()
    {
    }


    void delete_at_begin()
    {
    }

    void delete_at_end()
    {
    }

    void delete_before_element(int info)
    {
    }

    void delete_after_element(int info)
    {
    }

    void search(int i)
    {
    }

}
