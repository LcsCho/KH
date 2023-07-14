package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {
	// 파일 복사 메서드
	public static void copy(File readTarget, File writeTarget) {
		FileInputStream input = new FileInputStream(target);
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
