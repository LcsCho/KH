package api.file;

import java.io.File;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("파일 경로를 입력: ");
		String path = sc.nextLine();
		sc.close();
		File file = new File(path);
		if (file.exists()) {
			String fileName = file.getName();
			String extension = fileName.substring(fileName.lastIndexOf(".") + 1);

			if (file.isFile()) {
				System.out.println("파일명: " + fileName);
				System.out.println("파일의 유형: " + extension);
				System.out.println("파일의 크기: " + file.length());

			} else if (file.isDirectory()) {
				File[] files = file.listFiles();

				for (File f : files) {
					if (f.isFile())
						System.out.println(f + " [파일]");
					else if (f.isDirectory())
						System.out.println(f + " [폴더]");
				}
			}
		} else
			System.out.println("존재하지 않는 파일 또는 폴더");
	}
}
