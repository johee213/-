package exam05;

import java.util.Scanner;

public class Ex22_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String msg = "";		
		for (int i=0; i<3; i++) { // i : 0 1 2 3
			System.out.print("메모 : ");
			String memo = sc.nextLine(); // ccc
			
			if (msg.equals("")) {
				msg = memo;
			} else {
				msg = msg + "," + memo;
			}
		}			
		sc.close();
		
		//msg = msg.substring(1, msg.length()); // aaa,bbb,ccc
		System.out.println("msg : " + msg); 
	}
}











