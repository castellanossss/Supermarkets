package model;

public class Supplier extends Person {
	
	private String webPage;
	private String phone;
	
	public Supplier(String rut, String name, Address address, String phone, String webPage) {
		super(name, address, rut);
		this.webPage = webPage;
		this.phone = phone;
	}
	public String getWebPage() {
		return webPage;
	}

	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
