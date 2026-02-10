package exam04;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		//숫자 1개를 입력받아서 이후 숫자 10개를 찍는 프로그램.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		String num_ = sc.nextLine();
		sc.close();
		
		int sijak = Integer.parseInt(num_); // 99
		int endValue = sijak + 10; // 109
		
		//for문
		for (int i=sijak; i<endValue; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
				
		while (sijak < endValue) {
			System.out.println(sijak);
			sijak++;
		}
		
		
		
		
		
		
		
	}
}
