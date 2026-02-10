package exam07.ex01;

public class 실행 {
	public static void main(String[] args) {
		// new 해서 만들면 물건이 만들어진다. 
		// 이 물건을 객체라고 한다.
		// 객체 = 인스턴스
		식판 홍길동식판 = new 식판();
		식판 이성순식판 = new 식판();
		식판 장천용식판 = new 식판();
		
		System.out.println(홍길동식판.반찬1);
		System.out.println(홍길동식판.반찬2);
		System.out.println(홍길동식판.반찬3);
		System.out.println(홍길동식판.밥);
		System.out.println(홍길동식판.국);
		
		홍길동식판.반찬1 = "계란";
		홍길동식판.반찬2 = "오이무침";
		홍길동식판.반찬3 = "김치";
		홍길동식판.밥 = "오곡밥";
		홍길동식판.국 = "추어탕";
		
		System.out.println(홍길동식판.반찬1);
		System.out.println(홍길동식판.반찬2);
		System.out.println(홍길동식판.반찬3);
		System.out.println(홍길동식판.밥);
		System.out.println(홍길동식판.국);
		
		홍길동식판.반찬1 = "콩나물";
		System.out.println(홍길동식판.반찬1);
		
		System.out.println("-----------------------");
		
		System.out.println(이성순식판.반찬1);
		System.out.println(이성순식판.반찬2);
		System.out.println(이성순식판.반찬3);
		System.out.println(이성순식판.밥);
		System.out.println(이성순식판.국);
		
		이성순식판.반찬1 = "고사리";
		이성순식판.반찬2 = "미나리";
		이성순식판.반찬3 = "산나물";
		이성순식판.밥 = "쌀밥";
		이성순식판.국 = "쇠고기국";
		
		System.out.println(이성순식판.반찬1);
		System.out.println(이성순식판.반찬2);
		System.out.println(이성순식판.반찬3);
		System.out.println(이성순식판.밥);
		System.out.println(이성순식판.국);
		
		
		
		
		
		
	}
}
