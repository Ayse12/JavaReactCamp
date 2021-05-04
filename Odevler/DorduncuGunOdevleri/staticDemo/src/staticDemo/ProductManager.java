package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		if(validator.IsValid(product)) {
			System.out.println(product);
		}else {
			System.out.println("Bilgiler geçersizdir.");
		}
	}

}
