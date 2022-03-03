import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			
				FileInputStream ff = new FileInputStream("File1.txt");
		BufferedInputStream bf = new BufferedInputStream(ff);
		FileOutputStream fs = new FileOutputStream("file2.txt");
		BufferedOutputStream bs = new BufferedOutputStream(fs);
		int create;
		     while((create=ff.read())!=-1) {
		    	 bs.write(create);
		     }
           bs.flush();
           ff.close();
           fs.close();
		}catch(IOException e) {
			
		}
		
		
}
		}
