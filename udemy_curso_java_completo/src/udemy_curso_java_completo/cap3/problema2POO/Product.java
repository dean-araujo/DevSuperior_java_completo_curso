package udemy_curso_java_completo.cap3.problema2POO;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	
	}
	
	public void RemoveProducts(int quantity){
		this.quantity -= quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuatity() {
		return quantity;
	}

	public void status(){
		System.out.println("Product [name=" + name + ", price=" + price + ", quatity=" + quantity
				+ "totalValue" + totalValueInStock() + "]");
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", "
	+ quantity + " units, Total: $ " 
	+ String.format("%.2f", totalValueInStock());
	}
}
