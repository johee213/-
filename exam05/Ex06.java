package exam05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//정수 5개를 입력받아서 그 합을 출력.
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5]; // {0, 0, 0, 0, 0}
		
		for (int i=0; i<nums.length; i++) {
			System.out.print("숫자 : ");
			String num_= sc.nextLine();
			int num = Integer.parseInt(num_);
			nums[i] = num;
		}		
		// {90, 80, 70, 60, 50}
		sc.close();
		
		int hab = 0; // 누적 : 누적할 변수
		for (int i=0; i<nums.length; i++) {
			hab = hab + nums[i];
		}
		System.out.println("합 : " + hab);		
	}
}
