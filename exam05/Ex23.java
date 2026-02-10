package exam05;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		//입력 : 이름, 국어, 영어, 수학
		//입력종료 : 이름 - q, Q
		Scanner sc = new Scanner(System.in);
		String info = "";
		while (true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();

			if (name.toLowerCase().equals("q")) { break; }
			
			System.out.print("국어 : ");
			String kor = sc.nextLine();
			
			System.out.print("영어 : ");
			String eng = sc.nextLine();
			
			System.out.print("수학 : ");
			String mat = sc.nextLine();
			
			String temp = name + "," + kor + "," + eng + "," + mat; //1명분
			info += "/" + temp; //info = info + "/" + temp;
		}
		sc.close();
		
		info = info.substring(1); // info.substring(1, info.length());
		// 홍길동,90,80,70/이성순,99,88,77/장천용,100,100,100
		
		String[] array1 = info.split("/"); // {"홍길동,90,80,70", "이성순,99,88,77", "장천용,100,100,100"}
		for (int i=0; i<array1.length; i++) {
			String[] array2 = array1[i].split(",");  // {"홍길동", "90", "80", "70"}
			//총점, 평균
			int tot = Integer.parseInt(array2[1]) + Integer.parseInt(array2[2]) + Integer.parseInt(array2[3]);
			double avg = tot / 3.0;
			System.out.println(array2[0] + "\t" + array2[1] + "\t" + array2[2] + "\t" + array2[3] + "\t" + tot + "\t" + avg);
		}

		System.out.println("-- 프로그램 종료 --");
	}
}








