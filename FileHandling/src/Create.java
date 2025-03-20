import java.io.File;
import java.io.IOException;
public class Create {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\sahuc\\Desktop\\Topic_Backlog\\b.mp4");
//		System.out.println(f.mkdir());
//		System.out.println(f.createNewFile());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getAbsolutePath());
		File f1 = new File("C:\\Users\\sahuc\\Desktop\\Topic_Backlog\\rename.mp4");
		System.out.println(f.renameTo(f1));
	}
}
