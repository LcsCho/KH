package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		File target = new File("C:/Temp/origin.txt");
		File copy = new File("./sample/copy.txt");
		
		
		FileUtil.copy(target, copy);
	}
}
