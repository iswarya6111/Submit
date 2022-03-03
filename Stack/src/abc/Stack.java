package abc;

public class Stack 
{ 
    	static final int MAX = 1000; 
    	int top; 
    	int a[] = new int[MAX];  
  	boolean isEmpty() 
    	{ 
        		return (top < 0); 
    	} 
    	Stack() 
    	{ 
        		top = -1; 
    	} 
  	boolean push(int x) 
    	{ 
        		if (top >= (MAX-1)) 
        		{ 
            			System.out.println("Started"); 
            			return false; 
        		} 
        		else
        		{ 
            			a[++top] = x; 
            			System.out.println(x + " value to push"); 
            			return true; 
        		} 
    	} 
int pop() 
    	{ 
        		if (top < 0) 
        		{ 
            			System.out.println("flow"); 
            			return 0; 
        		} 
        		else
        		{ 
            			int x = a[top--]; 
            			return x; 
        		} 
    	} 
    
    	public static void main(String args[])
{
        		Stack s = new Stack(); 
        		s.push(5); 
        		s.push(7); 
        		s.push(38); 
        		System.out.println(s.pop() + " pop"); 
    	}
} 	
