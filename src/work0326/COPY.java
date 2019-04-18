package work0326;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class COPY {
	public static void main(String[] args) {
		File file=new File("E:\\file.txt");
		System.out.println("是否存这个文件"+file.exists());
		if(file.exists()){
			File file2=new File("E:\\copy_file.txt");
			try {
				FileInputStream fis=new FileInputStream(file);
				FileOutputStream fos=new FileOutputStream(file2);
				byte[] buffer = new byte[1024];
				try {
					while (fis.read(buffer, 0, 1024) != -1) {
					    fos.write(buffer,0,1024);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("复制成功");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" ");
		}
	}
}
