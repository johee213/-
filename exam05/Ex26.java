package exam05;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String info = "";
		int total = 0;
		while(true) {
			System.out.print("상품이름 : ");
			String productName = sc.nextLine();
			if (productName.toLowerCase().equals("q")) { break; }	
			System.out.print("상품가격 : ");
			String productPrice_ = sc.nextLine();
			System.out.print("구매수량 : ");
			String buyCounter_ = sc.nextLine();
			
			int productPrice = Integer.parseInt(productPrice_);
			int buyCounter = Integer.parseInt(buyCounter_);
			int tot = productPrice * buyCounter;
			
			total = total + tot;
			
			String temp = productName;
			temp += "," + productPrice;
			temp += "," + buyCounter;
			temp += "," + tot;

			//info = info + "/" + temp; // substring 필요.
			if (info.equals("")) {  // substring 불필요.
				info = temp;
			} else {
				info = info + "/" + temp;
			}
		}		
		sc.close();
		
		String[] array1 = info.split("/");
		for (int i=0; i<array1.length; i++) {
			System.out.println(array1[i].replace(",", " ..... "));
		}
		
		System.out.println("============================");
		System.out.println("합계 : " + total + "원");
		
		System.out.println("-- 프로그램 종료 --");
	}
}
