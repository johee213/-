package exam04;

public class Ex07 {
	public static void main(String[] args) {
		/*
		 등급조건(평균기준)
		 1등급 : 90점이상 : avg >= 90
		 2등급 : 80점이상 : avg >= 80
		 3등급 : 70점이상 : avg >= 70
		 4등급 : 60점이상 : avg >= 60
		 5등급 : 60점미만
		 
		 89 / 10 = 8
		 85 / 10 = 8
		 81 / 10 = 8
		 80 / 10 = 8
		*/
		int avg = 85;
		int result = avg / 10;
		System.out.println("result : " + result);
		
		switch(result) {
		case 10:
		case 9:
			System.out.println("1등급"); break;
		case 8:
			System.out.println("2등급"); break;
		case 7:
			System.out.println("3등급"); break;
		case 6:
			System.out.println("4등급"); break;
		default:
			System.out.println("5등급"); break;
		}
		
		System.out.println("-- 프로그램 종료 --");
		
		
	}
}
