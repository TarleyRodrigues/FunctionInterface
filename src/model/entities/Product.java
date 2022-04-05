package model.entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//função uppercase no modelo static
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	//função uppercase no modelo non static
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product name: ");
		builder.append(name);
		builder.append(", price: ");
		builder.append(String.format("%.2f", price));
		return builder.toString();
	}
	
	
	
}
