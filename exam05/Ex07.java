package exam05;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 입력 : 국어, 영어, 수학, 과학, 역사
		// 출력 : 국어  영어  수학  과학  역사  총점  평균
		int[] jumsus = new int[5]; // {0, 0, 0, 0, 0}
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<jumsus.length; i++) {
			System.out.print("점수 : ");
			String temp_ = sc.nextLine();
			int temp = Integer.parseInt(temp_);
			jumsus[i] = temp;
		}
		sc.close();
		
		//int total = jumsus[0] + jumsus[1] + jumsus[2] + jumsus[3] + jumsus[4];
		//double aver = total / 5.0;
		
		int total = 0;
		for (int i=0; i<jumsus.length; i++) {
			total = total + jumsus[i];
		}
		
		double aver = total / 5.0;
		
		System.out.println(total + " / " + aver);
	}
}
