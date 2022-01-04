package com.learn.SpringMVCFORM;

public class Address {
private String City;
private String Street;
private String Country;
private int pincode;
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

}
