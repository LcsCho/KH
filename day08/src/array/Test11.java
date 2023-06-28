package array;

public class Test11 {
	public static void main(String[] args) {
		double[] keyList = new double[] {150.8, 180.2, 175.9, 162.7, 170.3};
		int minLoc = 0, maxLoc = 0;;
		double min = keyList[minLoc];
		double max = keyList[maxLoc];
		
		for (int i = 0; i < keyList.length; i++) {
			if (min > keyList[i]) {
				min = keyList[i];
				minLoc = i;
			}
			
			if (max < keyList[i]) {
				max = keyList[i];
				maxLoc = i;
			}
		}
		
		System.out.println("가장 키가 작은 사람의 키: " + min);
		System.out.println("가장 키가 작은 사람의 위치: " + (minLoc + 1) + "번 째");
		
		System.out.println("가장 키가 큰 사람의 키: " + max);
		System.out.println("가장 키가 큰 사람의 위치: " + (maxLoc + 1) + "번 째");
	}
}
