package api.file.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File target = new File("sample/lotto.kh");
		
		FileInputStream stream = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		ObjectInputStream obj = new ObjectInputStream(buffer); // 직렬화 + 분해
		
		@SuppressWarnings("unchecked")
		Set<Integer> lotto = (Set<Integer>) obj.readObject();
		obj.close();
		System.out.println("lotto = " + lotto);
	}
}
