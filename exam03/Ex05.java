package exam03;

public class Ex05 {
	public static void main(String[] args) {
		//삼항연산자 : 자료형 변수 = (조건) ? 참일때 값 : 거짓일때 값;
//		int k = 5;

//		double a = (k > 13) ? 100 : 200.0;
//		System.out.println(a);
		
		int value3 = 3;
		String result = ((value3 % 2) == 0) ? "짝수" : "홀수";
		System.out.println(result);
	}
}
