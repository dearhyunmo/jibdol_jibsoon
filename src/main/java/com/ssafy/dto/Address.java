package com.ssafy.dto;

public class Address {
	String city;
	String code;
	String dongcode;
	String gugun;
	String dong;
	String y;
	String x;
	
	public Address(String city, String code, String dongcode, String gugun, String dong, String y, String x) {
		super();
		this.city = city;
		this.code = code;
		this.dongcode = dongcode;
		this.gugun = gugun;
		this.dong = dong;
		this.y = y;
		this.x = x;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDongcode() {
		return dongcode;
	}
	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", code=" + code + ", dongcode=" + dongcode + ", gugun=" + gugun + ", dong="
				+ dong + ", y=" + y + ", x=" + x + "]";
	}
	
}
