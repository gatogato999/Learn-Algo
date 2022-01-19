package test;

/**
 *
 * @author MooD
 */
public class Program
{
    public static void main(String[] args)
    {
        long sMax , lMax;
        Queue q = new Queue(7);
        q.insert(150);
        q.insert(25);
        q.insert(85);
        q.insert(45);
        q.insert(908);
        q.insert(0);
        q.insert(100);
        
        lMax = q.remove();
        if(lMax >= q.peekFront()){
            sMax = q.remove();
        }
        else{
            sMax = lMax;
            lMax = q.remove();
        }
        
        while(!(q.isEmpty())){
            if(q.peekFront() >= lMax){
                sMax = lMax;
                lMax = q.remove();
            }
            else if(q.peekFront() > sMax){
                sMax = q.remove();
            }
            else{
                q.remove();
            }
        }
        
        q.insert(lMax + sMax);
    }
}
