
import java.util.HashMap;
import java.util.Map;
 class Maps {
	 

	public static void main(String[] args) {
		Map<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(1 , "apple");
		mp.put(2,"orange");
		mp.put(3,"pomegranate");
		for(Map.Entry<Integer,String>entry:mp.entrySet()){
			System.out.println("roll no:" +entry.getKey()+" , fruits: "+entry.getValue());
		}

	

      Map<String,String> am =new HashMap<String,String>();
      am.put("Padma" ,"iswariya");
      am.put("hari","krishanan");
      am.put("deepika","padukone");
      for(String name:am.keySet())
      {
    	  String lastname=am.get(name);   
  		System.out.println("Firstname: " + name + ",lastname: " + lastname);   
      }
        


	}
 }

