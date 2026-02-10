package exam05;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex25 {
	public static void main(String[] args) {
		//입력 : 이름, 주민번호
		//출력 : 이름  주민번호  나이  성별
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("주민번호 : ");
		String ssn = sc.nextLine(); // 993456-1234567
		sc.close();
		
		//성별
		String temp = ssn.substring(7, 8); // 1,3  2,4
		
		String gender = "";
		if (temp.equals("1") || temp.equals("3")) {
			gender = "남자";			
		} else {
			gender = "여자";	
		}
		
		// 993456-1234567
		String temp2 = ssn.substring(0, 2); //99
		
		int birthYear = Integer.parseInt(temp2);
		if (temp.equals("1") || temp.equals("2")) { // 1900
			birthYear = birthYear + 1900;
		} else { // 2000
			birthYear = birthYear + 2000;
		}
		
		int year = LocalDate.now().getYear();
		int age = year - birthYear + 1;
		
		System.out.println(name + "\t" + ssn + "\t" + age + "\t" + gender);
	}
}
