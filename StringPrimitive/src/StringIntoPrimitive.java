



public class StringIntoPrimitive {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				String var1= "23";
				String var2 ="2245.8976";
				String var3 = "897654210";
				String var4 = "121.765";
				  // convert string into int 
				int i = Integer.parseInt(var1);
				 System.out.println("String as int "+i);
				   //convert String into double
				double d = Double.parseDouble(var2);
						System.out.println("String as double" +d);
			    //convert String into float
				float f = Float.parseFloat(var4);
				       System.out.println("String as float "+f);
				       //convert String into boolean
				boolean y = Boolean.parseBoolean(var1);
				  System.out.println("String as boolean "+y);
				  //convert String into long
				 long e = Long.parseLong(var3);
				 System.out.println("String as long "+e);
				  //convert String into short
				 short q =Short.parseShort(var1);
				 System.out.println("String as short "+q);
				  //convert String into byte
				 byte m = Byte.parseByte(var1);
				 System.out.println("String as byte "+m);
				 
				

			}

		

	}



