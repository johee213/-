package exam07.ex02;

import java.util.Scanner;

public class SungjukExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 : ");
		String kor_ = sc.nextLine();
		System.out.print("영어 : ");
		String eng_ = sc.nextLine();
		System.out.print("수학 : ");
		String mat_ = sc.nextLine();		
		sc.close();
		
		int kor = Integer.parseInt(kor_); // 문자열 kor_ 을 정수로 바꿔서 kor 변수에 담아라.
		int eng = Integer.parseInt(eng_);
		int mat = Integer.parseInt(mat_);
		
		int tot = kor + eng + mat;
		double avg = tot / 3.0;

		Sungjuk s1 = new Sungjuk(); // s1 : 객체명, 인스턴스명
		s1.name = name;
		s1.kor = kor;
		s1.eng = eng;
		s1.mat = mat;
		s1.tot = tot;
		s1.avg = avg;
		System.out.println(s1.name + "," + s1.kor + "," + s1.eng + "," + s1.mat + "," + s1.tot + "," + s1.avg);
		

		
		
		
		
		
		
	}
}
