package com.teddygu.treedomain.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="ADDRESS", schema="netheart")
public class Address {

	@Id
	@GeneratedValue(generator="TableIdGen")
	@GenericGenerator(strategy="org.hibernate.id.enhanced.TableGenerator", name="TableIdGen", parameters={
			@Parameter(name = "table_name", value = "ADID_GENERATE"),
			@Parameter(name = "segment_value", value = "adId"),
			@Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"),
			@Parameter(name = "increment_size", value = "10")
		})
	private long adId;
	@Column(name = "ADDRESS_LINE_ONE", nullable = false, unique = false)
	private String addressLineOne;
	@Column(name = "ADDRESS_LINE_TWO", nullable = false, unique = false)
	private String addressLineTwo;
	@Column(name = "COUNTRY", nullable = false, unique = false)
	private String country;
	@Column(name = "STATE", nullable = false, unique = false)
	private String state;
	@Column(name = "CITY", nullable = false, unique = false)
	private String city;
	@Column(name = "TOWN_VILLAGE", nullable = false, unique = false)
	private String townVillage;
	@Column(name = "LAND_MARK", nullable = false, unique = false)
	private String landMark;
	@Column(name = "ZIPCODE", nullable = false, unique = false)
	private String zipcode;
	@Column(name = "WEBSITE", nullable = true, unique = false)
	private String website;
	@Column(name = "EMAIL_ID", nullable = true, unique = false)
	private String emailId;
	@Column(name = "FAX_NUMBER", nullable = true, unique = false)
	private String faxNumber;
	@Column(name = "MOBILE_NUMBER", nullable = true, unique = false)
	private String mobileNumber;
	@Column(name = "LAND_LINE_NUMBER", nullable = true, unique = false)
	private String landLineNumber;
	@Column(name = "LONGITUDE", nullable = true, unique = false)
	private Float longitude;
	@Column(name = "LATITUDE", nullable = true, unique = false)
	private Float latitude;
	/**
	 * @return the adId
	 */
	public long getAdId() {
		return adId;
	}
	/**
	 * @param adId the adId to set
	 */
	public void setAdId(long adId) {
		this.adId = adId;
	}
	/**
	 * @return the addressLineOne
	 */
	public String getAddressLineOne() {
		return addressLineOne;
	}
	/**
	 * @param addressLineOne the addressLineOne to set
	 */
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}
	/**
	 * @return the addressLineTwo
	 */
	public String getAddressLineTwo() {
		return addressLineTwo;
	}
	/**
	 * @param addressLineTwo the addressLineTwo to set
	 */
	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the townVillage
	 */
	public String getTownVillage() {
		return townVillage;
	}
	/**
	 * @param townVillage the townVillage to set
	 */
	public void setTownVillage(String townVillage) {
		this.townVillage = townVillage;
	}
	/**
	 * @return the landMark
	 */
	public String getLandMark() {
		return landMark;
	}
	/**
	 * @param landMark the landMark to set
	 */
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}
	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the faxNumber
	 */
	public String getFaxNumber() {
		return faxNumber;
	}
	/**
	 * @param faxNumber the faxNumber to set
	 */
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the landLineNumber
	 */
	public String getLandLineNumber() {
		return landLineNumber;
	}
	/**
	 * @param landLineNumber the landLineNumber to set
	 */
	public void setLandLineNumber(String landLineNumber) {
		this.landLineNumber = landLineNumber;
	}
	/**
	 * @return the longitude
	 */
	public Float getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the latitude
	 */
	public Float getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

}
