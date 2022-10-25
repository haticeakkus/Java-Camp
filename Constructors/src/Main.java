
public class Main {

	public static void main(String[] args) {

		Product product = new Product(65, "Laptop", "Asus Laptop", 5000, 3, "5");
		Product productControl = new Product();
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getCode());
	}

}
