package exam05;

public class Ex19 {
	public static void main(String[] args) {
		String str1 = "뉴욕111/파리999/시드니5/멜버른2342/런던123/모스크바123";
		String[] array = str1.split("/"); // {"뉴욕","파리","시드니","멜버른","런던","모스크바"}
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
