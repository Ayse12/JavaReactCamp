package oopIntro;

public class Product {
	
	public Product () {//constructor
		System.out.println("Ben �al��t�m.");
	}
	
	public Product (int Id, String name, double unitPrice,String detail) {//constructor
		this();
		this.Id= Id;
		this.name= name;
		this.unitPrice= unitPrice;
		this.detail= detail;
	}
	
	
	
	int Id;
	String name;
	double unitPrice;
	String detail;
	

}