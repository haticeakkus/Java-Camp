
public class Main {

	public static void main(String[] args) {
		MathOperation mathOperation = new MathOperation();
		
		// two or more methods may have the same name if they differ in parameters
		System.out.println(mathOperation.sum(4, 7));
		System.out.println(mathOperation.sum(4, 7, 9));
	}

}
