package exam05;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		//입력 : 3명분의 이름,나이,성별
		Scanner sc = new Scanner(System.in);
		String info = "";
		for (int i=0; i<3; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			String age = sc.nextLine();
			System.out.print("성별 : ");
			String gender = sc.nextLine();
			
			info = info + "," + name + "/" + age + "/" + gender;
		}		
		sc.close();
		// ,홍길동/19/남자,이성순/21/남자,장천용/23/남자
		info = info.substring(1);
		// 홍길동/19/남자,이성순/21/남자,장천용/23/남자
		System.out.println(info);
	}
}
