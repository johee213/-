package exam04;

public class Ex03 {
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int mat = 70;

		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		
		//평균이 60점이상이면 합격, 아니면 불합격
		if (avg >= 60) {
			System.out.println(name + "님 합격 (" + avg + ")");
		} else {
			System.out.println(name + "님 불합격 (" + avg + ")");
		}
	}
}
