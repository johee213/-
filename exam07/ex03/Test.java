package exam07.ex03;

class A {
	boolean m1;
	int m2;
	double m3;
	String m4;
}

public class Test {
	public static void main(String[] args) {
		A a = new A();//
		System.out.println(a.m1 + ", " + a.m2 + ", " + a.m3 + ", " + a.m4);
		a.m1 = true;
		a.m2 = 99;
		//a1.m3 = 9.7;
		//a1.m4 = "아무거나";
		System.out.println(a.m1 + ", " + a.m2 + ", " + a.m3 + ", " + a.m4);
		
		A a2 = new A();
		
		A a3 = new A();
	}
}
