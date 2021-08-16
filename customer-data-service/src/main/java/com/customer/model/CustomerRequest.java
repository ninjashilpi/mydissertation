package com.customer.model;

public class CustomerRequest {
	
	private String first_name;
	private String last_name;
	private int party_id;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getParty_id() {
		return party_id;
	}
	public void setParty_id(int party_id) {
		this.party_id = party_id;
	}
	@Override
	public String toString() {
		return "CustomerRequest [first_name=" + first_name + ", last_name=" + last_name + ", party_id=" + party_id
				+ "]";
	}
	
	
	
}
