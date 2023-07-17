package api.file.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		// 준비물
		File read = new File("sample/multi.kh");
		FileInputStream stream = new FileInputStream(read);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		DataInputStream data = new DataInputStream(buffer);
		
	}
}
