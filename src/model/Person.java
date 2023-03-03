package model;

public class Person {
	
	private String name;
	private Address address;
	private String rut;
	
	public Person(String name, Address address, String rut) {
		this.name = name;
		this.address = address;
		this.rut = rut;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getDirection() {
		return address;
	}
	public void setDirection(Address address) {
		this.address = address;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
}
