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

public class Test07_1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File target = new File("sample/player.kh");
		Player player = null;
		Scanner sc = new Scanner(System.in);
		if (target.exists()) {
			System.out.println("캐릭터를 불러옵니다.");
			FileInputStream inStream = new FileInputStream(target);
			BufferedInputStream inBuffer = new BufferedInputStream(inStream);
			ObjectInputStream inObj = new ObjectInputStream(inBuffer);

			player = (Player) inObj.readObject();
			inObj.close();
			player.show();
		} else {
			System.out.println("게임 시작!");
			System.out.print("아이디를 설정하세요: ");
			String id = sc.next();

			int money = 0;
			while (true) {
				try {
					System.out.print("소지금을 입력하세요: ");
					money = sc.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("형식에 맞게 정수를 입력하세요");
					sc.next();
				}
			}
			if (money >= 0) player = new Player(id, money);
			else player = new Player(id);
		}
		FileOutputStream outStream = new FileOutputStream(target);
		BufferedOutputStream outBuffer = new BufferedOutputStream(outStream);
		ObjectOutputStream outObj = new ObjectOutputStream(outBuffer);

		while (true) {
			System.out.println("<메뉴>");
			System.out.print("입력(1-정보출력/2-레벨업/3-Gold 획득/4-종료): ");
			int num = sc.nextInt();

			if (num == 4) {
				sc.close();
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (num == 1) {
				player.show();
			} else if (num == 2) {
				player.setLvUp();
			} else if (num == 3) {
				player.setMoneyPlus();
			}
		}
		outObj.writeObject(player);
		outObj.close();
	}
}