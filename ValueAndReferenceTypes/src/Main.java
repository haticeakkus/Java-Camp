
public class Main {

	public static void main(String[] args) {
		
		// value
		int num1 = 10,
			num2 = 20;
		num2 = num1;
		num1 = 30;
		System.out.println(num2);

		// reference
		int[] numbers1 = new int[]{2,5,7};				//arrays are reference types
		int[] numbers2 = new int[]{8,3,9};
		
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
	}	

}