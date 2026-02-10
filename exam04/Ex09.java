package exam04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		String dan_ = sc.nextLine();
		
		int dan = Integer.parseInt(dan_);
		
		for (int i=1; i < 10; i=i+1) {
			if (i % 3 != 0) {
				
			} else {
				String result = dan + " * " + i + " = " + (dan * i);
				System.out.println(result);
			}
		}

	}
}
