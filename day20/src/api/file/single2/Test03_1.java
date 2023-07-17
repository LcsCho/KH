package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
		File readTarget = new File("C:/Temp/origin.txt");
		FileInputStream readStream = new FileInputStream(readTarget);

		File writeTarget = new File("./sample/test3.txt");
		FileOutputStream writeStream = new FileOutputStream(writeTarget);

		for (int i = 1; i <= 128 * 1024; i *= 2) {
			long start = System.currentTimeMillis();
			byte[] buffer = new byte[i];

			readStream.getChannel().position(0); // 파일 포인터를 처음으로 되돌림

			while (true) {
				int size = readStream.read(buffer);
				if (size == -1)
					break;
				writeStream.write(buffer, 0, size);
			}

			long end = System.currentTimeMillis();
			System.out.println("버퍼 크기: " + i + " bytes, 실행 시간: " + (end - start) + "ms");
		}

		readStream.close();
		writeStream.close();
	}
}
