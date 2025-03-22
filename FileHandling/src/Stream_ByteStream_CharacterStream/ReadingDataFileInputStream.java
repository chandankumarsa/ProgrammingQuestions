//Reading the Data By using File Input STream

package Stream_ByteStream_CharacterStream;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDataFileInputStream {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\sahuc\\Desktop\\File Handling\\File\\textfile.txt");
	FileInputStream f = new FileInputStream(file);
	if(file.canRead()) {
		int n = f.read();
		while(n!=-1) {
			System.out.println((char)n);
			n = f.read();
		}
	}
	else System.out.print("We can't read the dat");
}
}
