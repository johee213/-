package exam05;

import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) {
		//입력: 이름, 주소
		Scanner sc = new Scanner(System.in);
		String info = "";
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			if (name.toLowerCase().equals("q")) { break; }			
			System.out.print("주소 : ");
			String addr = sc.nextLine();
			
			String temp = name + "," + addr;
			info = info + "/" + temp;
		}
		sc.close();
		info = info.substring(1);
		
		String[] array1 = info.split("/");
		for (int i=0; i<array1.length; i++) {
			//System.out.println(array1[i].replace(",", " ... ")); // 홍길동,대전
			
			String[] array2 = array1[i].split(",");
			System.out.println(array2[0] + " ... " + array2[1]);
		}
		
//		홍길동,대전/이성순,서울/장천용,경기
//		
//		홍길동 ... 대전
//		이성순 ... 서울
//		장천용 ... 경기
		
		
	}
}
