package com.tnsif.inheritance;

public class Citizen 
{
    private String name;
    private long aadhar;
    private String address;
    private long phoneno;
    
	public Citizen(String name, long aadhar, String address, long phoneno) 
	{
		super();
		this.name = name;
		this.aadhar = aadhar;
		this.address = address;
		this.phoneno = phoneno;
	}
	public Citizen() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadhar=" + aadhar + ", address=" + address + ", phoneno=" + phoneno + "]";
	}
    
	
}
