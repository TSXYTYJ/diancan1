package work0326;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OUT {
	public static void main(String[] args) {
		File file =new File("test.txt");
		FileOutputStream fos=null;
		try {
			 fos=new FileOutputStream(file);
			 String s="Hello World";
			 byte[] b = s.getBytes();
			 fos.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fos!=null)
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println("over");
	
		
	}
}
