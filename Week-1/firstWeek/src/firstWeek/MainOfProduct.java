package firstWeek;

public class MainOfProduct {

	public static void main(String[] args) {
			
			Product product = new Product();
		    product.setName("Laptop");
		    product.setPrice(5000);
		    
		    Product product2 = new Product();
		    product2.setName("Mouse");
		    
		    Product[] products = new Product[] {product, product2};
		    
		    for(int i=0; i<products.length; i++) {
		    	System.out.println(products[i].getName());
		    }
	}

}
