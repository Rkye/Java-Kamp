package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		
		Product product = new Product();
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setId(1);
		
		Product product2 = new Product("Laptop",2,"Dell",3,"Siyah",3.500);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());

	}

}
