package com.teddygu.tree.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "PERSON", schema = "netheart")
@NamedQueries({
    @NamedQuery(name="Person.list",
                query=DomainNamedQueries.PERSON_LIST),
    @NamedQuery(name="Person.findByName",
                query=DomainNamedQueries.PERSON_LIST)
})
public class Person {
	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "PEID_GENERATE"),
			@Parameter(name = "segment_value", value = "peid"),
			@Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"),
			@Parameter(name = "increment_size", value = "10") })
	private Long peid;
	@Column(name = "FIRST_NAME", nullable = false, unique = false)
	private String firstName;
	@Column(name = "MIDDLE_NAME", nullable = false, unique = false)
	private String middleName;
	@Column(name = "LAST_NAME", nullable = false, unique = false)
	private String lastName;
	@Temporal(TemporalType.DATE)
	@Column(name = "DOB", nullable = false, unique = false)
	private Date dateOfBirth;
	@Column(name = "USER_NAME", nullable = false, unique = false)
	private String userName;
	@Column(name = "PASSWORD", nullable = false, unique = false)
	private String password;
	@Column(name = "EMAIL_ID", nullable = false, unique = false)
	private String emailId;
	@Column(name = "MOBILE_NUMBER", nullable = false, unique = false)
	private String mobileNumber;

	/**
	 * @return the peid
	 */
	public Long getPeid() {
		return peid;
	}

	/**
	 * @param peid
	 *            the peid to set
	 */
	public void setPeid(Long peid) {
		this.peid = peid;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName
	 *            the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *            the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
