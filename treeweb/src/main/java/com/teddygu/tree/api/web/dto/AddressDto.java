/**
 *
 */
package com.teddygu.tree.api.web.dto;


/**
 * @author Rupen
 *
 */
public class AddressDto {

	private String addressLineOne;
	private String addressLineTwo;
	private String country;
	private String state;
	private String city;
	private String townVillage;
	private String landMark;
	private String zipcode;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddressDto [addressLineOne=" + addressLineOne
				+ ", addressLineTwo=" + addressLineTwo + ", country=" + country
				+ ", state=" + state + ", city=" + city + ", townVillage="
				+ townVillage + ", landMark=" + landMark + ", zipcode="
				+ zipcode + "]";
	}


}
