package exam05;

import java.util.Arrays;

public class Ex08 {
	public static void main(String[] args) {
		int value1; //변수 선언
		//System.out.println(value1); //초기화를 안해서 에러.

		int[] value2;
		//System.out.println(value2);
		
		int value3 = 90;
		System.out.println(value3);
		
		int[] value4 = null;
		System.out.println(value4);
		
		System.out.println("1. ============================");
		
		boolean[] array1 = new boolean[3]; // {false, false, false}
		for (int i=0; i<array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		System.out.println("2. ============================");
		
		int[] array2 = new int[13]; // {0, 0, 0}
		for (int i=0; i<array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

		//문자열 + 문자열 = 문자열결합
		//모든 자료형에 문자열을 더하면 = 문자열결합

		System.out.println();
		System.out.println("3. ============================");
		
		double[] array3 = new double[3]; // {0.0, 0.0, 0.0}
		for (int i=0; i<array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		
		System.out.println();
		System.out.println("4. ============================");
			
		String[] array4 = new String[3]; // {null, null, null} 
		for (int i=0; i<array4.length; i++) {
			System.out.print(array4[i] + " ");
		}

		System.out.println();
		System.out.println("5. ============================");
		
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
		System.out.println(array4);
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
