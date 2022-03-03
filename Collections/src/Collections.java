
import java.util.Stack;
import java.util.Vector;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collections { 
	 public static void printa(List<Integer> ar) {
		 Iterator<Integer>g=ar.iterator();
		 while(g.hasNext()) {
			 System.out.println("values are" +g.next());
		 }
	 }
		 public static void printa(PriorityQueue<Integer>az) {
			 Iterator<Integer>g=az.iterator();
			 while(g.hasNext()) {
				 System.out.println("values are" +g.next());
		 }
		 }
	public static void main(String[] args) {
		//Array list
		List<Integer> ar = new ArrayList<Integer>();
		{
		  for( int i=1;i<5;i++) 
			  ar.add(i);	
		  System.out.println("ArrayList");
		  System.out.println("Adding Integer" +ar); 
		     ar.remove(3);
		  System.out.println("removing Integer" +ar);
		  
	}
		  
		  //linked list
		  List<Integer> aq = new LinkedList<Integer>();
		  {
		  for(int j=10;j<=22;j++)
			 aq.add(j);
		    
		     System.out.println("Linked list");
		  System.out.println(aq); 
		     aq.remove(0);
		  System.out.println("removing Integer" +aq);
		   
		   }
		  
		  //vector
		  Vector<Integer> an =new Vector<Integer>();
		  {
		  for(int z=1;z<=6;z++)
			  an.add(z);
		  System.out.println("vector list");
		  an.remove(0);
		  System.out.println("removing Integer");
		  }
		  // Stack
		  Stack<String>aw = new Stack<String>();
		  aw.push("100");
		  aw.push("99");
		  aw.push("98");
		  aw.push("97");
		  aw.push("96");		  
		  System.out.println("Stack list");
		  System.out.println(aw);
		  aw.remove(3);
		  System.out.println("removing list" +aw);
		  
		  //priority queue
		  PriorityQueue<Integer>az = new PriorityQueue<Integer>();
		  az.add(89);
		  az.add(90);
		  az.add(98);
		  az.add(100);
		  az.add(95);
		  az.add(84);
		 System.out.println("priority list");
		 System.out.println(az);
		 az.poll();
		 System.out.println("removing integer" +az);
		 
		  }
}

	
		  
	    
		  
	


