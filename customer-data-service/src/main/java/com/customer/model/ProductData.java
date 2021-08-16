package com.customer.model;

public class ProductData {
		
	private int sort_code;
	private int account_number;
	private char active;
	
	public int getSort_code() {
		return sort_code;
	}
	public void setSort_code(int sort_code) {
		this.sort_code = sort_code;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public char getActive() {
		return active;
	}
	public void setActive(char active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "ProductData [sort_code=" + sort_code + ", account_number=" + account_number + ", active=" + active
				+ "]";
	}
	
	
	
}
