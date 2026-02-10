package exam05;

public class Ex15 {
	public static void main(String[] args) {
		String str = "     Welcome to My Site 123 헤헤 !!!   ";
		System.out.println(str);		
		System.out.println(str.trim()); //문자열의 좌측과 우측의 공백을 제거.
		
		String aaa = "          h o n g          ";
		System.out.println("[" + aaa + "]");
		System.out.println("[" + aaa.trim() + "]");
		
		System.out.println("3. " + str.toUpperCase()); // 대문자로 바꾸는 기능.
		System.out.println("4. " + str.toLowerCase()); // 소문자로 바꾸는 기능.
		
		System.out.println("5. " + str.contains("Site")); // Site 라는 글자가 들어가있느냐?
		
		str = "Welcome to My Site 123 헤헤 !!!";
		System.out.println("6. " + str.substring(3, 7)); // 문자열 자르기
		System.out.println("7. " + str.substring(3));
		
		System.out.println("8. " + str.replace("헤헤", "ㅎㅎ")); // 치환
		System.out.println("9. " + str.replace(" 헤헤 !!!", ""));
		
		System.out.println("======================");
		
		String jumsu = "90,80,70,60,50";
		String[] jumsus = jumsu.split(","); // {"90","80","70","60","50"}
		
		String kor_ = jumsus[0];
		String eng_ = jumsus[1];
		String mat_ = jumsus[2];
		String sci_ = jumsus[3];
		String his_ = jumsus[4];
		
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int mat = Integer.parseInt(mat_);
		int sci = Integer.parseInt(sci_);
		int his = Integer.parseInt(his_);
		
		System.out.println("국어 : " + kor);
		
//      String jumsu = "90,80,70,60,50";
		
		System.out.println(jumsu.indexOf(",")); //2
		//첫번째 콤마(,)가 몇번째 인덱스에 있는지 알려줘.

		System.out.println(jumsu.lastIndexOf(","));
		
		String imsi = "대한민국/미국/호주/캐나다";
		String[] countrys = imsi.split("/"); 
		// {"대한민국", "미국", "호주", "캐나다"}
		//countrys[3]
		
//		.trim()
//		.substring(시작인덱스, 마지막인텍스 - 1)
//		.replace("", "");
//		.split("공통된 구분자"); // 배열로 만들어라.
		
	}
}
