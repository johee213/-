package exam05;

public class Ex02 {

	public static void main(String[] args) {
		int kor = 90;
		int eng = 80;
		int mat = 70;
		int sci = 60;
		int his = 50;
		System.out.println(kor);
		
		//배열을 만드는 방법 1 - {값1, 값23, 값3}
		int[] jumsu1 = {kor, eng, mat, sci, his};
		System.out.println(jumsu1[0]); //주소가 나온다.
		
		//배열을 만드는 방법 2 - new 연산자 사용
		int[] jumsu2 = new int[5]; //int형 자료 5개를 담을 수 있는 배열을 만들어라. -> 주소
		System.out.println(jumsu2 + " / " + jumsu2[0]);
		jumsu2[0] = kor;
		jumsu2[1] = eng;
		jumsu2[2] = mat;
		jumsu2[3] = sci;
		jumsu2[4] = his;
		
		for (int i=0; i<jumsu2.length; i++) {
			System.out.println("jumsu2[" + i + "] : " + jumsu2[i]);
		}
		
		
		System.out.println("===================");
		
		String[] strs = new String[7]; // null(널)
		System.out.println(strs);
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		System.out.println(strs[3]);
		System.out.println(strs[4]);
		System.out.println(strs[5]);
		System.out.println(strs[6]);
		
		strs[0] = "홍길동";
		strs[1] = "이성순";
		strs[2] = "장천용";
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		System.out.println(strs[3]);
		System.out.println(strs[4]);
		System.out.println(strs[5]);
		System.out.println(strs[6]);
		
		
		
		
		
		
		
		
		
		
	}

}
