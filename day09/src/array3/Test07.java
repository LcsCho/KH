package array3;

import java.util.Random;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("지뢰찾기 배열 입력(홀수): ");
		int size = sc.nextInt();
		sc.close();
		int bomb = size + 1;
		int[][] map = new int[size][size];
		
		Random r = new Random();
		
		//폭탄 배치
		for(int i=0; i < bomb; i++) {
			int x = r.nextInt(size);
			int y = r.nextInt(size);
			if(map[x][y] == 0) {
				map[x][y] = 9;
			}
			else {
				i--;
			}
		}
		
		//계산
		for(int i=0; i < size; i++) {
			for(int k=0; k < size; k++) {//전체 칸을 반복하며
				if(map[i][k] == 9) continue;//폭탄이면 패스
				
				//탐색 범위 설정(왼쪽상단 - 오른쪽하단 위치)
				int xmin = i - 1;
				int xmax = i + 1;
				int ymin = k - 1;
				int ymax = k + 1;
				
				//모서리일 경우 추가 계산
				if(xmin < 0) xmin = 0;
				if(xmax > size - 1) xmax = size - 1;
				if(ymin < 0) ymin = 0;
				if(ymax > size - 1) ymax = size - 1;
				
				//확인용 멘트
				System.out.println("("+i+", "+k+") 위치 검사중");
				System.out.println("--> 범위 : ("+xmin+", "+ymin+") 부터 ("+xmax+", "+ymax+") 까지");
				
				//미리 지정한 범위에서 폭탄 찾기
				int count = 0;
				for(int p = xmin; p <= xmax; p++) {
					for(int q = ymin; q <= ymax; q++) {
						if(map[p][q] == 9) {//폭탄을 발견하면
							count++;
						}
					}
				}
				map[i][k] = count;//개수를 설정
			}
		}
		
		//지도 출력
		for(int i=0; i < size; i++) {
			for(int k=0; k < size; k++) {
				switch(map[i][k]) {
				case 0: System.out.print(0); break;
				case 9: System.out.print("◈"); break;
				default: System.out.print(map[i][k]); break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}