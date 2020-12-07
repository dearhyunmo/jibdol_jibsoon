package com.ssafy.dto;

public class HouseDealDto {

	int no;
	String city, gugun, dong;
	String AptName;
	String dealAmount;
	String jibun;
	String buildYear, dealYear, dealMonth, dealDay;
	String area, floor;
	String type;
	String rentMoney;
	double lat, lng;
	String img;
	
	public HouseDealDto(int no, String city, String gugun, String dong, String aptName, String dealAmount,
			String jibun, String buildYear, String dealYear, String dealMonth, String dealDay, String area,
			String floor, String type, String rentMoney, double lat, double lng, String img) {
		super();
		this.no = no;
		this.city = city;
		this.gugun = gugun;
		this.dong = dong;
		this.AptName = aptName;
		this.dealAmount = dealAmount;
		this.jibun = jibun;
		this.buildYear = buildYear;
		this.dealYear = dealYear;
		this.dealMonth = dealMonth;
		this.dealDay = dealDay;
		this.area = area;
		this.floor = floor;
		this.type = type;
		this.rentMoney = rentMoney;
		this.lat = lat;
		this.lng = lng;
		this.img = img;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getAptName() {
		return AptName;
	}

	public void setAptName(String aptName) {
		this.AptName = aptName;
	}

	public String getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getJibun() {
		return jibun;
	}

	public void setJibun(String jibun) {
		this.jibun = jibun;
	}

	public String getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}

	public String getDealYear() {
		return dealYear;
	}

	public void setDealYear(String dealYear) {
		this.dealYear = dealYear;
	}

	public String getDealMonth() {
		return dealMonth;
	}

	public void setDealMonth(String dealMonth) {
		this.dealMonth = dealMonth;
	}

	public String getDealDay() {
		return dealDay;
	}

	public void setDealDay(String dealDay) {
		this.dealDay = dealDay;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRentMoney() {
		return rentMoney;
	}

	public void setRentMoney(String rentMoney) {
		this.rentMoney = rentMoney;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "HouseDealDetailDto [no=" + no + ", city=" + city + ", gugun=" + gugun + ", dong=" + dong + ", AptName="
				+ AptName + ", dealAmount=" + dealAmount + ", jibun=" + jibun + ", buildYear=" + buildYear
				+ ", dealYear=" + dealYear + ", dealMonth=" + dealMonth + ", dealDay=" + dealDay + ", area=" + area
				+ ", floor=" + floor + ", type=" + type + ", rentMoney=" + rentMoney + ", lat=" + lat + ", lng=" + lng
				+ ", img=" + img + "]";
	}


	public String toString2() {
		return "HouseDealDto [no=" + no + ", city=" + city + ", gugun=" + gugun + ", dong=" + dong + ", AptName="
				+ AptName + ", dealAmount=" + dealAmount + ", jibun=" + jibun + ", buildYear=" + buildYear
				+ ", dealYear=" + dealYear + ", dealMonth=" + dealMonth + ", dealDay=" + dealDay + ", area=" + area
				+ ", floor=" + floor + ", type=" + type + ", rentMoney=" + rentMoney + ", lat=" + lat + ", lng=" + lng
				+ ", img=" + img + "]";
	}
	
	
}
