package BufferReader_BufferWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadingDataByUsingBufferReader {
public static void main(String[] args) throws IOException {
	FileReader f = new FileReader("C:\\Users\\sahuc\\Desktop\\File Handling\\File\\textfile.txt");

	try(BufferedReader bf = new BufferedReader(f)){
		String s = bf.readLine();
		while(s!=null) {
			System.out.println(s);
			s= bf.readLine();
		}
	}
}
}
