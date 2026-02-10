package exam07.ex04;

import java.util.Scanner;

public class AddressBookExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();		
		sc.close();
		
		AddressBook addressBook1 = new AddressBook();
		addressBook1.name = name;
		addressBook1.phone = phone;
		addressBook1.address = address;
		addressBook1.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
