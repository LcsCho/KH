package data;

public class Test11 {
	public static void main(String[] args) {
		//입력
		int startHour = 9 , startMin = 40;
		int endHour = 12 , endMin = 25;
		
		//계산
		int startTime = startHour * 60 + startMin;
		int endTime = endHour * 60 + endMin;
		
		int useTime = endTime - startTime;
		//System.out.println(useTime);
		
		int useHour = useTime / 60;
		int useMin = useTime % 60;
		
		//출력
		System.out.println(useHour);
		System.out.println(useMin);
	}
}




