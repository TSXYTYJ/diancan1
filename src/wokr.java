import java.io.File;
import java.io.IOException;

public class wokr {
	public static void main(String[] args) throws IOException {
		/*File f=new File("E:file.txt");
		System.out.println("�ļ��Ƿ����"+f.exists());
		System.out.println("�Ƿ����ļ�"+f.isFile());
		System.out.println("�Ƿ���Ŀ¼"+f.isDirectory());
		System.out.println("f�����·��"+f.getPath());
		System.out.println("f�����·��"+f.getAbsolutePath());
		f.createNewFile();*/
		File f=new File("E:\\QMDownload\\SoftMgr\\GamePatch\\1\\1125904201940998:\\QMDownload\\SoftMgr");
		String[] names=f.list();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
