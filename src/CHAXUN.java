import java.io.File;

public class CHAXUN {
	public static void main(String[] args) {
		File f=new File("G:/");
		getname(f);
	}
	public static void getname(File file){
		if(file.isFile()){
			System.out.println(file.getAbsolutePath());
		}else if(file.isDirectory()){
			System.out.println("Ä¿Â¼£º"+file.getAbsolutePath());
			File[]files=file.listFiles();
			if(files!=null){
				for(File f:files){
					getname(f);
				}
			}
		}
	}
}
