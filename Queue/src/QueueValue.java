
import java.util.*;
public class QueueValue 
{
public static void main(String[] args) 
{
        		Queue <String> lq = new LinkedList<>();
                lq.add("vanilla");
        		lq.add("berry");
        		lq.add("chocolate");
        		lq.add("blackcurrent");
        		lq.add("candy");
                System.out.println("Queue is : " + lq);
        		System.out.println(" main queue : " + lq.peek());
        		lq.remove();
        		System.out.println("After remove tha main Queue : " + lq);
        		System.out.println("Size of Queue : " + lq.size());
    	}
}
