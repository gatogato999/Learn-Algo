package test;

public class DS_LinkedList1
{
    private int[] elements;
    private int maxSize;
    private int head;
    private int elementIndex;
    private int nextElementIndex;
    private int previousElementIndex;
    DS_LinkedList1(int numberOfElements)
    {
        elements = new int[numberOfElements];
        maxSize = numberOfElements;
        head = -1;
        elementIndex = -1;
        nextElementIndex = -1;
        previousElementIndex = -1;
    }
    boolean isEmpty()
    {
        return ( ( head == -1
            && elementIndex == -1
            && nextElementIndex == -1
            && previousElementIndex == -1 ) == true );
    }

    boolean isFull()
    {
        return false;
    }
}
