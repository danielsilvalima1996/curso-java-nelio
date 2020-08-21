package entities;

public class Product implements Comparable<Product>{

	private String name;
	private Double price;

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "name " + name + ", price " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product other) {
		return this.price.compareTo(other.getPrice());
	}
	
	

}
