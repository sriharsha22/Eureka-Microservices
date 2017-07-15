package model;

public class myInfo {
	private String Id;
	private String name;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public double getAddress() {
		return Address;
	}
	public void setAddress(double address) {
		Address = address;
	}
	private String Phone;
	private double Address;
	
}
