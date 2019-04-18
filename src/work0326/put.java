package work0326;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class put {
	public static void main(String[] args) {
		File file=new File("test.txt");
		FileInputStream fos=null;
		try {
			 fos=new FileInputStream(file);
			 try {
				byte[]b=new byte[fos.available()];
				fos.read(b);
				String s=new String(b);
				System.out.println(s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos!=null);try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
