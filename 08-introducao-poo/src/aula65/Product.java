package aula65;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", R$ " 
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unidades, total R$ "
				+ String.format("%.2f", totalValueInStock());
	}

}
