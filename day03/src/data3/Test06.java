package data3;

public class Test06 {
	public static void main(String[] args) {
		//369 판정
		
		//입력
		int number = 95;
		
		//계산
		
		//boolean clap = 십의자리에 369 또는 일의자리에 369;
		
		//boolean tenClap = 십의자리에 3 또는 6 또는 9;
		//boolean oneClap = 일의자리에 3 또는 6 또는 9;
		//boolean clap = tenClap || oneClap;
		
		int ten = number / 10;
		int one = number % 10;
		
		boolean tenClap = ten == 3 || ten == 6 || ten == 9;
		boolean oneClap = one == 3 || one == 6 || one == 9;
		boolean clap = tenClap || oneClap;
		
		//출력
		System.out.println(clap);
	}
}





