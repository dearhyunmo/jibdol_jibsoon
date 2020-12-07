package com.ssafy.dto;

public class Member {
	String userid;
	String pwd;
	String name;
	String phone;
	String email;
	String address1;
	String address2;
	
	public Member(String userid, String pwd, String name, String phone, String email, String address1, String address2) {
		super();
		this.userid = userid;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getaddress1() {
		return address1;
	}

	public void setaddress1(String address1) {
		this.address1 = address1;
	}

	public String getaddress2() {
		return address2;
	}

	public void setaddress2(String address2) {
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", address=" + address1 +address2+"]";
	}

}