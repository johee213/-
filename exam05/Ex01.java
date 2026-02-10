package exam05;

public class Ex01 {
	public static void main(String[] args) {
		// 80, 90, 70, 100, 85
		int num1 = 80;
		int num2 = 90;
		int num3 = 70;
		int num4 = 100;
		int num5 = 85;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		System.out.println("-------------------");
		
		int[] nums = {80, 90, 70, 100, 85}; // int[]
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println("배열의 길이 : " + nums.length);
		
		for (int i=0; i<5; i++) { // i - 인텍스로 사용하겠다.
			System.out.println(i + " / " + nums[i]);
		}

	}
}
