package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	// 파일 복사 메서드
	public static void copy(File readTarget, File writeTarget) throws IOException {
		FileInputStream input = new FileInputStream(readTarget);
		FileOutputStream output = new FileOutputStream(writeTarget);
		
		while (true) {
			int a = input.read();
			if (a == -1) break; // EOF(End Of File) 처리
			output.write(a);
		}
		input.close();
		output.close();
	}
}
