
public class Main {

	public static void main(String[] args) {
		int result = total(4, 7 ,9 ,0 ,7);	// we can add as many as we want
		System.out.println(result);
	}
	
	// like single dimensions arrays concept
	public static int total(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		return sum;
	}
}