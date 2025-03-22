package BufferReader_BufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataByUsingBufferWriter {
public static void main(String[] args) throws IOException {
	FileWriter f = new FileWriter("C:\\Users\\sahuc\\Desktop\\File Handling\\File\\textfile.txt");
	try(BufferedWriter bf = new BufferedWriter(f)){
		bf.write("CJD-E3");
		bf.newLine();
		bf.write("CJD-M22");
		bf.newLine();
		bf.write("cjd-M21");
	}
}
}
