package exam04;

public class Ex02 {
	public static void main(String[] args) {
		//지하철요금 : 자녀가 3명이상이거나 또는 나이가 65세이상이면 무료, 아니면 1550원.
		int 자녀수 = 4;
		int 나이 = 60;
		
		if (자녀수 >= 3 || 나이 >= 65) {
			System.out.println("요금 : 무료");
		} else {
			System.out.println("요금 : 1,550원");
		}		
	}
}
