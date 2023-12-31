package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03 {
	public static void main(String[] args) throws IOException {

		byte[] buffer = new byte[4096];

		File readTarget = new File("C:/Temp/origin.txt");
		FileInputStream readStream = new FileInputStream(readTarget);

		File writeTarget = new File("./sample/test.txt");
		FileOutputStream writeStream = new FileOutputStream(writeTarget);

		long start = System.currentTimeMillis();
		
		while (true) {
			int size = readStream.read(buffer);
			if (size == -1)
				break;
			writeStream.write(buffer, 0, size);
		}

		long end = System.currentTimeMillis();

		System.out.println("실행시간: " + (end - start) + "ms");
		readStream.close();
		writeStream.close();
	}
}