package com.customer.model;



public class Address {
	
	
	private String type;
	private int house_number;
	private String street_name1;
	private String street_name2;
	private String city;
	private String country;
	private String post_code;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHouse_number() {
		return house_number;
	}
	public void setHouse_number(int house_number) {
		this.house_number = house_number;
	}
	public String getStreet_name1() {
		return street_name1;
	}
	public void setStreet_name1(String street_name1) {
		this.street_name1 = street_name1;
	}
	public String getStreet_name2() {
		return street_name2;
	}
	public void setStreet_name2(String street_name2) {
		this.street_name2 = street_name2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPost_code() {
		return post_code;
	}
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	
	@Override
	public String toString() {
		return "Address [type=" + type + ", house_number=" + house_number + ", street_name1=" + street_name1
				+ ", street_name2=" + street_name2 + ", city=" + city + ", country=" + country + ", post_code="
				+ post_code + "]";
	}
	
	

}
