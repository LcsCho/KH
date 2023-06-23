package input;

public class Test03 {
	public static void main(String[] args) {
		
		//입력
		int kor = 80;
		int eng = 70;
		int mat = 61;
		
		//계산
		int tot = kor + eng + mat;
		//float avg = tot / 3f;
		float avg = (float)tot / 3;
		
		//출력
		System.out.println("총점 = " + tot);
		System.out.println("평균 = " + avg);
		
	}
}



