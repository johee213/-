package exam05;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		boolean[] array1 = new boolean[3]; // {false, false, false}
		for (int i=0; i<array1.length; i++) {
			System.out.println(i + ". " + array1[i]);
		}
		System.out.println("=============================");
		
		int[] array2 = new int[3]; // {0, 0, 0}
		for (int i=0; i<array2.length; i++) {
			System.out.println(i + ". " + array2[i]);
		}
		System.out.println("=> " + array2);
		System.out.println("==> " + Arrays.toString(array2));
		System.out.println("=============================");
	}
}
