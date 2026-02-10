package exam05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//입력 : 5명의 친구 이름
		//출력 : 5명의 친구 이름
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[5]; // {null, null, null, null, null}
		
		for (int i=0; i<names.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine(); // 정원겸
			names[i] = name;
		}
				
		sc.close();
		
		System.out.println(names); //주소
		System.out.println(names.length); //배열의 크기(길이)
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}


		
		
		
		
		
		
		
		
		
		
		
	}
}
