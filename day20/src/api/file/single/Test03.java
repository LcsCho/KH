package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		File target = new File("C:/Temp/origin.txt");
		FileInputStream input = new FileInputStream(target);
		File copy = new File("./sample/copy.txt");
		FileOutputStream output = new FileOutputStream(copy);
		
		while (true) {
			int a = input.read();
			if (a == -1) break; // EOF(End Of File) 처리
			output.write(a);
		}
		input.close();
		output.close();
	}
}
