package exam07.ex05;

public class TestExample {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.imsi_1();     // 메소드 호출하는 부분.
		t1.imsi_2(10, 20); // 메소드 호출하는 부분.
		
		System.out.println("------------");
		
		Test t2 = new Test();
		t2.imsi_1();
	}
}
