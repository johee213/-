package exam04;

public class Ex10 {
	public static void main(String[] args) {
		//반복문 : while - 반드시 빠져나갈 조건부터 만들어라.
		int i = 0;
		
		while (i <= 5) { // i : 0 1 2 3 4 5 6
			System.out.println("현재 값: " + i);
			i++;
		}
		
		System.out.println("i의 값 : " + i);
	}
}
/*
현재 값: 0
현재 값: 1
현재 값: 2
현재 값: 3
현재 값: 4
현재 값: 5

*/