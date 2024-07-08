package com.tnsif.constructor;

public class Customer 
{
    private String name;
    private int cid;
    private String cadress;
    
	public Customer() {}
	
	public Customer(String name, int cid, String cadress) {
		super();
		this.name = name;
		this.cid = cid;
		this.cadress = cadress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCadress() {
		return cadress;
	}
	public void setCadress(String cadress) {
		this.cadress = cadress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", cid=" + cid + ", cadress=" + cadress + "]";
	}
	
}
