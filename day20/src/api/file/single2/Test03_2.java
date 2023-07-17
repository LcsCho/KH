package api.file.single2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03_2 {
	public static void main(String[] args) throws IOException {
		// 파일 복사 프로그램(바이트 배열 - 버퍼 사용)
		
		
		// 대상 준비(운영체제가 거부하는 위치인 경우)
		String home = System.getProperty("user.home");
		File readTarget = new File(home, "sample/origin.zip");
		File writeTarget = new File(home, "sample/copy.zip");
		
		// 스트림 준비
		FileInputStream readStream = new FileInputStream(readTarget);
		BufferedInputStream readBuffer = new BufferedInputStream(readStream);
		
		FileOutputStream writeStream = new FileOutputStream(writeTarget);
		BufferedOutputStream writeBuffer = new BufferedOutputStream(writeStream);
		
		// I/O 처리
		
		// 파일 통로 정리
		writeBuffer.close();
		readBuffer.close();
	}
}
