package entities;

public class OrderItem {

	private Product product;
	
	private Integer quantity;
	private Double price;

	
	public OrderItem() {
	}
	
	public OrderItem(Product product, Integer quantity, Double price) {
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return product.getName() + ", $" + price + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
	}
	
	
	
}
