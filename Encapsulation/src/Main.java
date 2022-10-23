
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(54);
		product.setDescription("Asus Laptop");
		product.setPrice(6000);
		product.setStockAmount(5);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getCode());
	}

}
