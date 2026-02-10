package exam04;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		String num_ = sc.nextLine();
		int num = Integer.parseInt(num_); //괄호 안에 있는 문자열을 정수로 바꿔라.

		for (int i=0; i<=num; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("------------------");
		
		int k = 0; //시작값	
		while (k <= num) {
			System.out.print(k + " ");
			k++; // k = k + 1;  ++k;   k += 1;
		}
		
	}
}

//0 1 2 3 4 5 6 7 8 9