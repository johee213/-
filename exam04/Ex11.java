package exam04;

public class Ex11 {
	public static void main(String[] args) {
		int k = 10;
		
		while (k <= 50) {
			k = k + 10; // k : 20 30 40 50 60
			System.out.println(k);		
			//k = k + 10;
		}
		
		System.out.println("-- 프로그램 종료 --");
	}
}

/*
20 <- k = k + 10
30 <- k = k + 10
40
50
60
*/