
public class Returntype {

	public static void main(String args[]) {
		returnInt(4);
		returnString("ishu");
		returnFloat((float)4.3199);
		returnDouble(1.2345677900);
		returnBoolean(true);
		returnByte((byte)43);
	    returnVoid();	
	
		}
	   //int
	     public static  int returnInt(int a) {
		 System.out.println(" int value is"+a);
		   return a;
	     }
		// string
		public static  String returnString(String a) {
			System.out.println(" String value is"+a);
			return a;
		}
		//float
			public static  float returnFloat(Float a) {
				System.out.println(" float value is"+a);
				return a;
			}
		//double
				public static  double returnDouble(Double a) {
					System.out.println(" double value is"+a);
					return a;
				}
		//boolean
					public static  boolean returnBoolean(Boolean a) {
						System.out.println("boolean value is"+a);
						return a;
					}
		//byte
						public static  Byte returnByte(Byte a) {
							System.out.println("byte value is"+a);
							return a;
						}
		//return void
							public static void returnVoid() {
						
	}

}
