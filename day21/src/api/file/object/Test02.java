package api.file.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) throws IOException {
		Set<Integer> lotto = new TreeSet<>();

		File target = new File("sample/lotto.kh");
		
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream obj = new ObjectOutputStream(buffer); // 직렬화 + 분해
		
		Random r = new Random();
		while (lotto.size() < 6) {
			int random = r.nextInt(45) + 1;
			lotto.add(random);
		}
		obj.writeObject(lotto);
		
		obj.close();
	}
}
