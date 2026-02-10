package exam05;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		//입력 : 이름,주민번호,나이,성별
		Scanner sc = new Scanner(System.in);
		
		String info = "";
		
		System.out.print("이름 : ");
		info += sc.nextLine(); //홍길동
		
		System.out.print("주민번호 : ");
		info += "/" + sc.nextLine(); // 홍길동/123456-1234567
		
		System.out.print("나이 : ");
		info += "/" + sc.nextLine(); // 홍길동/123456-1234567/19
		
		System.out.print("성별 : ");
		info += "/" + sc.nextLine(); // 홍길동/123456-1234567/19/남자

		sc.close();
		
		String[] infos = info.split("/"); // {"홍길동", "123456-1234567", "19", "남자}
		
		System.out.printf("%s    %s    %s    %s", infos[0], infos[1], infos[2], infos[3]);
		
		
		
		
		
		
		
	}
}
