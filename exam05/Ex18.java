package exam05;

public class Ex18 {
	public static void main(String[] args) {
//		String str1 = "Java Study";
//		String str11 = str1.toUpperCase();
//		System.out.println(str11);
//		
//		String str12 = str1.toLowerCase();
//		System.out.println(str12);
//		
//		String str13 = str1.replace("Study", "공부");
//		System.out.println(str13);
//		
//		String str14 = str1.substring(5);
//		System.out.println(str14);
		
		String city1="", city2="", city3="", city4="", city5="", city6="";
		
		String str2 = "뉴욕/파리/시드니/멜버른/런던/모스크바";
		
		String temp = new String("뉴욕/파리/시드니/멜버른/런던/모스크바");		
		int idx = temp.indexOf("/"); // 2
		city1 = temp.substring(0, idx); // 뉴욕

		temp = temp.substring(idx + 1); //파리/시드니/멜버른/런던/모스크바
		idx = temp.indexOf("/"); // 2
		city2 = temp.substring(0, idx); // 파리
		
		temp = temp.substring(idx + 1); //시드니/멜버른/런던/모스크바
		idx = temp.indexOf("/"); // 3
		city3 = temp.substring(0, idx); // 시드니
		
		temp = temp.substring(idx + 1); //멜버른/런던/모스크바
		idx = temp.indexOf("/"); // 3
		city4 = temp.substring(0, idx); // 멜버른
		
		temp = temp.substring(idx + 1); //런던/모스크바
		idx = temp.indexOf("/"); // 2
		city5 = temp.substring(0, idx); // 런던
		
		temp = temp.substring(idx + 1); //모스크바
		idx = temp.indexOf("/"); // -1
		
		if (idx == -1) {
			city6 = temp;
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
