package Stream_ByteStream_CharacterStream;

import java.io.FileWriter;
import java.io.IOException;

public class WritingDataByUsingCharacterStream {
public static void main(String[] args) throws IOException {
	FileWriter f = new FileWriter("C:\\Users\\sahuc\\Desktop\\File Handling\\File\\texfile.txt",true);
	f.write("Jspider\n");
	f.write("Qspider\n");
	f.write("ProSpider\n");
	f.write("Gspider\n");
	f.close();
}
}
