//Writing the Data By using File Output STream
package Stream_ByteStream_CharacterStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class WritingData_FileOutputSTream {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\sahuc\\Desktop\\File Handling\\File\\texfile.txt");
		FileOutputStream f = new FileOutputStream(file);
		String s = "Jspiders1";
		byte[] b = s.getBytes();
		if (file.canWrite()) {
			f.write(b);
		} else
			System.out.println("We can not Write the Data");
		f.close();
	}
}

//if the path s not correct then it will create a Separate file and with this locations