package com;

public class Polymorphism {
            int w;
            int r;
            int g;
            int f;
            int q;
          public int Polymorphism(int w,int f) 
          {
        	  return(w*f);
          }
            public int Polymorphism(int f,int q,int w,int r)
            {
            	return(f+q+w+r);
            }
            public float Polymorphism(float f,float r)
            {
            	return(f + r);
            }
	public static void main(String[] args) {
		Polymorphism pw = new Polymorphism();
				System.out.println(pw.Polymorphism(5,9));
				System.out.println(pw.Polymorphism(2,3,4,7));
				System.out.println(pw.Polymorphism(7,8));
		
		

	}

}
