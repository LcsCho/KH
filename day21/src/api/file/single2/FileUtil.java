package api.file.single2;

import java.io.File;

public class FileUtil {
	// 파일 & 디렉터리 삭제 메서드
	// - 파일일 경우는 그냥 삭제하면 된다.
	// - 디렉터리일 경우는 내부에 있는 모든 요소를 삭제한 뒤 삭제해야 한다.
	//		- 내부에 있는 있는 요소는 파일인지 디렉터리인지 알 수 없다.
	//		- 다시 검사해서 삭제하도록 요청해야 한다.(재귀, recursive)
	public static void delete(File target) {
		if(target.isFile()) {
			target.delete();
		}
		else if (target.isDirectory()) {
			File[] list = target.listFiles();
			for (File file : list) {
				delete(file); // 재귀 호출(같은 기능을 재호출)
			}
			target.delete();
		}
	}
}
