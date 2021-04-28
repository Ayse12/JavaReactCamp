package oopIntro;


public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10, 13.500); // referans oluþturma,intance
		// product1.Id = 1;
		// product1.name = "Lenovo V14";
		// product1.unitPrice = 15000;
		// product1.detail = "16 GB RAM";

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Category category1= new Category();
		category1.setId(1);
		
		
		
		
		

		
	}

}
