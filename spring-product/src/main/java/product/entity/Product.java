package product.entity;

public class Product {
	private String no;
	private String name;
	private int price;
	private String vender;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(String no, String name, int price, String vender) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.vender = vender;
	}



	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getVender() {
		return vender;
	}
	public void setVender(String vender) {
		this.vender = vender;
	}
	
	
	
}
