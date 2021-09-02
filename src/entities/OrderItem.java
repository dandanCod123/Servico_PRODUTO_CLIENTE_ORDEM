package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem(int i, double d, Product p) {
		
	}

	public OrderItem(Integer quantity, Double price) {
		
		this.quantity = quantity;
		this.price = price;
		this.product = product;
		
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

	public double subTotal() {
		return quantity * price;
	}
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
	
	
	
	
	public void remove(OrderItem item) {
		// TODO Auto-generated method stub
		
	}

	public void add(OrderItem item) {
		// TODO Auto-generated method stub
		
	}
	
}
