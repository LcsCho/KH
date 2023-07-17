package api.file.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File target = new File("sample/player.kh");

		if (target.exists()) {
			FileInputStream inStream = new FileInputStream(target);
			BufferedInputStream inBuffer = new BufferedInputStream(inStream);
			ObjectInputStream inObj = new ObjectInputStream(inBuffer);
			Player player = (Player) inObj.readObject();
			inObj.close();
			player.show();
		}

		else {
			System.out.println("게임 시작!");

			Scanner sc = new Scanner(System.in);
			System.out.print("아이디를 설정하세요: ");
			String id = sc.next();

			
			System.out.print("소지금을 입력하세요: ");
			int money = sc.nextInt();
			
			Player p;
			if (money > 0) p = new Player(id, money);
			else p = new Player(id);
			
			FileOutputStream outStream = new FileOutputStream(target);
			BufferedOutputStream outBuffer = new BufferedOutputStream(outStream);
			ObjectOutputStream outObj = new ObjectOutputStream(outBuffer);

			while (true) {
				System.out.print("입력(1-정보출력/2-레벨업/3-Gold 획득/4-종료)");
				int num = sc.nextInt();
				if (num == 4) {
					sc.close();
					break;
				} else if (num == 1) {
					p.show();
				} else if (num == 2) {
					p.setLvUp();
				} else if (num == 3) {
					p.setMoneyPlus();
				}
			}
			outObj.writeObject(p);
			outObj.close();
		}

	}
}
