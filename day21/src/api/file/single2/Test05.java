package api.file.single2;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
		// 파일 복사는 가능하지만 디렉터리는 생성/삭제만 가능
		
		File a = new File("파일1");
		File b = new File("파일2");
	}
}