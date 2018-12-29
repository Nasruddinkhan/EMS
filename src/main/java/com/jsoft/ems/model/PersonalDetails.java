/**
 * 
 */
package com.jsoft.ems.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Nasruddin khan Waris
 *
5:22:15 PM
 */
@Entity
@Table(name = "PERSNOL_DETAILS")
public class PersonalDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "PERSONAL_ID", nullable = false)
	private Long personalId;
	@Column (name = "FIRST_NAME")
	private String firstName;
	@Column (name = "LAST_NAME")
	private String middleName;
	@Column (name = "MIDDEL_NAME")
	private String lastName;
	@Column (name = "FATHER_FIRST_NAME")
	private String fatherFirstName;
	@Column (name = "FATHER_MIDDEL_NAME")
	private String fatherMiddleName;
	@Column (name = "FATHER_LAST_NAME")
	private String fatherLastName;
	@Column (name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	@Column (name = "PAN_NUMBER")
	private String panNumber;
	@Column (name = "AADHAR_NUMBER")
	private String aadharNumber;
	@Column (name = "GENDER", columnDefinition="char(1)")
	private String gender;
	@Column (name = "NATIONALITY")
	private String nationality;
	@Column (name = "EMAIL")
	private String email;
	@Column (name = "LINKED_PROFILE_URL")
	private String linkedProfileUrl;
	@Column (name = "TWITER_PROFILE_URL")
	private String twiterProfileUrl;
	@Column (name = "FACEBOOK_PROFILE_URL")
	private String facebookPrifileUrl;
	@Column (name = "EMP_ID")
	private Long empID;
	/**
	 * @return the personalId
	 */
	public Long getPersonalId() {
		return personalId;
	}
	/**
	 * @param personalId the personalId to set
	 */
	public void setPersonalId(Long personalId) {
		this.personalId = personalId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
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
	 * @param middleName the middleName to set
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
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the fatherFirstName
	 */
	public String getFatherFirstName() {
		return fatherFirstName;
	}
	/**
	 * @param fatherFirstName the fatherFirstName to set
	 */
	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}
	/**
	 * @return the fatherMiddleName
	 */
	public String getFatherMiddleName() {
		return fatherMiddleName;
	}
	/**
	 * @param fatherMiddleName the fatherMiddleName to set
	 */
	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}
	/**
	 * @return the fatherLastName
	 */
	public String getFatherLastName() {
		return fatherLastName;
	}
	/**
	 * @param fatherLastName the fatherLastName to set
	 */
	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the panNumber
	 */
	public String getPanNumber() {
		return panNumber;
	}
	/**
	 * @param panNumber the panNumber to set
	 */
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	/**
	 * @return the aadharNumber
	 */
	public String getAadharNumber() {
		return aadharNumber;
	}
	/**
	 * @param aadharNumber the aadharNumber to set
	 */
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the linkedProfileUrl
	 */
	public String getLinkedProfileUrl() {
		return linkedProfileUrl;
	}
	/**
	 * @param linkedProfileUrl the linkedProfileUrl to set
	 */
	public void setLinkedProfileUrl(String linkedProfileUrl) {
		this.linkedProfileUrl = linkedProfileUrl;
	}
	/**
	 * @return the twiterProfileUrl
	 */
	public String getTwiterProfileUrl() {
		return twiterProfileUrl;
	}
	/**
	 * @param twiterProfileUrl the twiterProfileUrl to set
	 */
	public void setTwiterProfileUrl(String twiterProfileUrl) {
		this.twiterProfileUrl = twiterProfileUrl;
	}
	/**
	 * @return the facebookPrifileUrl
	 */
	public String getFacebookPrifileUrl() {
		return facebookPrifileUrl;
	}
	/**
	 * @param facebookPrifileUrl the facebookPrifileUrl to set
	 */
	public void setFacebookPrifileUrl(String facebookPrifileUrl) {
		this.facebookPrifileUrl = facebookPrifileUrl;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonalDetails [personalId=" + personalId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", fatherFirstName=" + fatherFirstName + ", fatherMiddleName="
				+ fatherMiddleName + ", fatherLastName=" + fatherLastName + ", dateOfBirth=" + dateOfBirth + ", panNumber="
				+ panNumber + ", aadharNumber=" + aadharNumber + ", gender=" + gender + ", nationality=" + nationality
				+ ", email=" + email + ", linkedProfileUrl=" + linkedProfileUrl + ", twiterProfileUrl=" + twiterProfileUrl
				+ ", facebookPrifileUrl=" + facebookPrifileUrl + "]";
	}
	/**
	 * @return the empID
	 */
	public Long getEmpID() {
		return empID;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(Long empID) {
		this.empID = empID;
	}


}
