package exam05;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		//입력 : 이름,주민번호,나이,성별
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("주민번호 : ");
		String ssn = sc.nextLine();
		
		System.out.print("나이 : ");
		String age = sc.nextLine();
		
		System.out.print("성별 : ");
		String gender = sc.nextLine();

		sc.close();
		
		System.out.print(name + "    " + ssn + "    " + age + "    " + gender);
		System.out.printf("%s    %s    %s    %s", name, ssn, age, gender);
	}
}
