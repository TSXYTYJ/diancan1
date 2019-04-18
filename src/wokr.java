import java.io.File;
import java.io.IOException;

public class wokr {
	public static void main(String[] args) throws IOException {
		/*File f=new File("E:file.txt");
		System.out.println("文件是否存在"+f.exists());
		System.out.println("是否是文件"+f.isFile());
		System.out.println("是否是目录"+f.isDirectory());
		System.out.println("f的相对路径"+f.getPath());
		System.out.println("f的相对路径"+f.getAbsolutePath());
		f.createNewFile();*/
		File f=new File("E:\\QMDownload\\SoftMgr\\GamePatch\\1\\1125904201940998:\\QMDownload\\SoftMgr");
		String[] names=f.list();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
