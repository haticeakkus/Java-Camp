
public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.name = "Laptop";
		product.id = 18;
		product.description = "Asus Laptop";
		product.price = 6000;
		product.stockAmount = 5;
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
			
			
	}
	
	// single responsibility principle: a class or method should only do one task

}
