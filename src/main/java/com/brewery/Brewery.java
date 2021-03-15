package com.brewery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brewery{

	@JsonProperty("country")
	private String country;

	@JsonProperty("brewery_type")
	private String breweryType;

	@JsonProperty("city")
	private String city;

	@JsonProperty("address_2")
	private Object address2;

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("address_3")
	private Object address3;

	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("website_url")
	private String websiteUrl;

	@JsonProperty("updated_at")
	private String updatedAt;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("street")
	private String street;

	@JsonProperty("name")
	private String name;

	@JsonProperty("county_province")
	private Object countyProvince;

	@JsonProperty("id")
	private int id;

	@JsonProperty("state")
	private String state;

	@JsonProperty("postal_code")
	private String postalCode;

	@JsonProperty("longitude")
	private String longitude;

	public String getCountry(){
		return country;
	}

	public String getBreweryType(){
		return breweryType;
	}

	public String getCity(){
		return city;
	}

	public Object getAddress2(){
		return address2;
	}

	public String getLatitude(){
		return latitude;
	}

	public Object getAddress3(){
		return address3;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getWebsiteUrl(){
		return websiteUrl;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getPhone(){
		return phone;
	}

	public String getStreet(){
		return street;
	}

	public String getName(){
		return name;
	}

	public Object getCountyProvince(){
		return countyProvince;
	}

	public int getId(){
		return id;
	}

	public String getState(){
		return state;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public String getLongitude(){
		return longitude;
	}
}