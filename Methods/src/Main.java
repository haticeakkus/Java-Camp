
public class Main {

	public static void main(String[] args) {
		int sum = total(5,7);
		String cityName = city();
		add();
		delete();
		update();
		
		System.out.println(sum);
		System.out.println(cityName);
	}
	
	public static void add() {
		System.out.println("Added");
	}
	public static void delete() {
		System.out.println("Deleted");
	}
	public static void update() {
		System.out.println("Updated");
	}
	public static int total(int num1 , int num2) {
		return num1 + num2;
	}
	public static String city() {
		return "Ankara";
	}

}