
public class Main {

	public static void main(String[] args) {
		
		String[] students = new String[4];
		students[0] = "Arzu";
		students[1] = "Nazife";
		students[2] = "Hatice";
		students[3] = "Nilüfer";
		
		for(int i=0 ; i<students.length ; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("------------------------------");
		
		for(String student:students) {
			System.out.println(student);
		}
	}

}
