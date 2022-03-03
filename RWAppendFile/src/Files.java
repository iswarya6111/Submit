
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.IOException;
public class Files {

	public static void main(String[] args) {
		try {
				File ff = new File("createfile.txt");
				FileWriter writer = new FileWriter("createfile.txt");
				
		BufferedWriter bf = new BufferedWriter(writer);
		bf.write("choco");
		bf.newLine();
		bf.write("choco world ");
		bf.newLine();
		bf.write(" Some files are created");
		bf.close();
		BufferedWriter bw = new BufferedWriter (new FileWriter("File.txt",true));
		bw.write("append ");
		bw.newLine();
		bw.write("files should be in txt ");
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


