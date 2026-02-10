package exam04;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//입력 : Scanner 클래스를 이용.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine(); // 문자열
		System.out.print("국어점수를 입력하세요 : ");
		String kor_ = sc.nextLine(); //
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
		

		if (avg >= 60) {
			System.out.println("합격");
		} else {

		}
		
		
		System.out.println("-- 프로그램 종료 --");

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
