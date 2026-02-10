package exam04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//입력 : Scanner 클래스를 이용.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine(); // 문자열
		System.out.print("국어점수를 입력하세요 : ");
		String kor_ = sc.nextLine();
		System.out.print("영어점수를 입력하세요 : ");
		String eng_ = sc.nextLine();
		System.out.print("수학점수를 입력하세요 : ");
		String mat_ = sc.nextLine();
		sc.close();

		int kor = Integer.parseInt(kor_); // Double.parseDouble(kor_);
		int eng = Integer.parseInt(eng_);
		int mat = Integer.parseInt(mat_);		
		//int tot = kor + eng + mat;
		
		int tot = 0; // 0
		tot += kor; // tot = tot + kor; // 90
		tot += eng; // tot = tot + eng; // 90 + 80 = 170
		tot += mat; // tot = tot + mat; // 170 + 70 = 240
		
		double avg = (double)tot / 3;
		
		//문자열에 모든 자료형을 더하면, 문자열 결합(나열)이 된다.
		String message = "";
		message += name; // message = "홍길동"
		message += "님의 평균은 "; // message = "홍길동님의 평균은 "
		message += avg + "점 입니다."; // message = "홍길동님의 평균은 80.0점 입니다.";  
		
		if (avg >= 60) {
			message += " - 합격";
			System.out.println(message);
		} else {
			//message += " - 불합격";
			System.out.println(message + " - 불합격");
		}
		
		System.out.println("-- 프로그램 종료 --");

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
