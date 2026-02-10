package exam01;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("안녕" + "하세요");
		System.out.println("오늘은 " + "춥네요."); // 문자열 더하기 문자열 = 문자열 결합(나열)
		
		//출력문 : System.out.print(""); , System.out.printf("");
		//서식이 없는 출력문 : System.out.print("");
		//서식이 있는 출력문 : System.out.printf("");  %s  %d  %f
		
		// 안녕하세요 홍길동님의 나이는 19세입니다.
		// 안녕하세요 이성순님의 나이는 21세입니다.
		// 안녕하세요 장천용님의 나이는 23세입니다.
		
		System.out.println("안녕하세요 홍길동님의 나이는 19세입니다.");
		System.out.println("안녕하세요 이성순님의 나이는 21세입니다.");
		System.out.println("안녕하세요 장천용님의 나이는 23세입니다.");
		System.out.println("-------------");
		
		System.out.printf("안녕하세요 %s님의 나이는 %s세입니다.\n", "홍길동", "19");
		System.out.printf("안녕하세요 %s님의 나이는 %s세입니다.\n", "이성순", "21");
		System.out.printf("안녕하세요 %s님의 나이는 %d세, 신장은 %f입니다.\n", "장천용", 23, 189.5);

		System.out.println();
	}
	
}