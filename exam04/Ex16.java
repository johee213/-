package exam04;

public class Ex16 {
	public static void main(String[] args) {
		
		int a;
        a = 0;
        while(a < 0) {
            System.out.print(a + " ");
            a++;
        }
		
        a = 0;
        do {
            System.out.print(a + " ");
            a++;
        } while(a < 0);
        
	}
}
