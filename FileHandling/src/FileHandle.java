
 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.IOException;
public class FileHandle {

	public static void main(String[] args) {
		try {
				File ff = new File("File.txt");
				FileWriter writer = new FileWriter("File2.txt");
				
		BufferedWriter bf = new BufferedWriter(writer);
		bf.write("Hello");
		bf.newLine();
		bf.write("java course started");
		bf.newLine();
		bf.write("easy to learn");
		bf.close();
		BufferedWriter bw = new BufferedWriter (new FileWriter("File.txt",true));
		bw.write("append to go");
		bw.newLine();
		bw.write("add data");
		bw.close();
		
		
		BufferedReader bs = new BufferedReader(new FileReader(ff));
		String character;
	
		     while((character=bs.readLine()) !=null) {
		    	System.out.println(character);
		     }
               bs.close();
               
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
}
		

	}


