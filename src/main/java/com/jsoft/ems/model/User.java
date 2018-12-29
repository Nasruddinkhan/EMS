package com.jsoft.ems.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Nasruddin khan 
 *
1:31:17 AM
 */
@Entity
@Table(name = "USERS")
public class User  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable=false)
	private Long id;
	@Column(name = "LOGIN_ID", columnDefinition= "varchar (50)")
	@Size(max = 50, min = 6, message = "{user.loginId.invalid}")
	private String loginId;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "PASSWORDS")
	@NotEmpty(message = "{user.password.empty}")
	private String password;
	@Column(name = "MOBILE_NO")
	private String mobileNo;
	@Transient
	private String newPassword;
	@Column(name = "FRIST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "ALT_MOBNO")
	private String alternateNo;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "DOJ")
	private String doj;
	@Column(name = "DOB")
	private String dateOfBirth;
	@Column(name = "Roles")
	private String roles;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "STATUS", columnDefinition="char(1) default 'N'")
	private String status;
	@Column(name="FATHER_NAME")
	private String fatherName;
	@Column(name="MOTHER_NAME")
	private String motherName;
	@Column(name="PAN_NO")
	private String panNo;
	@Column(name="AADHAAR_NO")
	private String aadhaarNo;
	@Column(name="text",columnDefinition= "nvarchar (500)")
	private String text;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn (name = "ADDRESS_ID")
	private Address address;
	@Lob
	private byte[] photo;
	@Lob
	private String encodeStr;
	@Column(name="IS_SBT_PERSONAL_DTS",columnDefinition="char(1) default 'N'")
	private String isSubmitedPersonalDetail;
	@Column(name = "IS_SBT_PER_DATE")
	private Timestamp isSubmitedPersDate;
	@Column(name="IS_SBT_ADDR_DTS",columnDefinition="char(1) default 'N'")
	private String isSubmitedAddressDetail;
	@Column(name = "IS_SBT_ADDR_DATE")
	private Timestamp isSubmitedPersAddDate;
	@Column(name="IS_SBT_EDU_DTS",columnDefinition="char(1) default 'N'")
	private String isSubmitedEduDetail;
	@Column(name = "IS_SBT_EDU_DATE")
	private Timestamp isSubmitedEduDate;
	@Column(name="IS_SBT_APP",columnDefinition="char(1) default 'N'")
	private String isSubmitedAppDtl;
	@Column(name = "IS_SBT_APP_DATE")
	private Timestamp isSubmitedAppDate;
	
	public String getIsSubmitedPersonalDetail() {
		return isSubmitedPersonalDetail;
	}

	public void setIsSubmitedPersonalDetail(String isSubmitedPersonalDetail) {
		this.isSubmitedPersonalDetail = isSubmitedPersonalDetail;
	}

	public Timestamp getIsSubmitedPersDate() {
		return isSubmitedPersDate;
	}

	public void setIsSubmitedPersDate(Timestamp isSubmitedPersDate) {
		this.isSubmitedPersDate = isSubmitedPersDate;
	}

	public String getIsSubmitedAddressDetail() {
		return isSubmitedAddressDetail;
	}

	public void setIsSubmitedAddressDetail(String isSubmitedAddressDetail) {
		this.isSubmitedAddressDetail = isSubmitedAddressDetail;
	}

	public Timestamp getIsSubmitedPersAddDate() {
		return isSubmitedPersAddDate;
	}

	public void setIsSubmitedPersAddDate(Timestamp isSubmitedPersAddDate) {
		this.isSubmitedPersAddDate = isSubmitedPersAddDate;
	}

	public String getIsSubmitedEduDetail() {
		return isSubmitedEduDetail;
	}

	public void setIsSubmitedEduDetail(String isSubmitedEduDetail) {
		this.isSubmitedEduDetail = isSubmitedEduDetail;
	}

	public Timestamp getIsSubmitedEduDate() {
		return isSubmitedEduDate;
	}

	public void setIsSubmitedEduDate(Timestamp isSubmitedEduDate) {
		this.isSubmitedEduDate = isSubmitedEduDate;
	}

	public String getIsSubmitedAppDtl() {
		return isSubmitedAppDtl;
	}

	public void setIsSubmitedAppDtl(String isSubmitedAppDtl) {
		this.isSubmitedAppDtl = isSubmitedAppDtl;
	}

	public Timestamp getIsSubmitedAppDate() {
		return isSubmitedAppDate;
	}

	public void setIsSubmitedAppDate(Timestamp isSubmitedAppDate) {
		this.isSubmitedAppDate = isSubmitedAppDate;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}



	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}



	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}



	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getAlternateNo() {
		return alternateNo;
	}
	public void setAlternateNo(String alternateNo) {
		this.alternateNo = alternateNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * @return the photo
	 */
	public  byte[] getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto( byte[] photo) {
		this.photo = photo;
	}

	/**
	 * @return the encodeStr
	 */
	public String getEncodeStr() {
		return encodeStr;
	}

	/**
	 * @param encodeStr the encodeStr to set
	 */
	public void setEncodeStr(String encodeStr) {
		this.encodeStr = encodeStr;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", loginId=" + loginId + ", userName=" + userName + ", password=" + password
				+ ", mobileNo=" + mobileNo + ", newPassword=" + newPassword + ", firstName=" + firstName + ", lastName="
				+ lastName + ", alternateNo=" + alternateNo + ", email=" + email + ", doj=" + doj + ", dateOfBirth="
				+ dateOfBirth + ", roles=" + roles + ", gender=" + gender + ", status=" + status + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", panNo=" + panNo + ", aadhaarNo=" + aadhaarNo
				+ ", text=" + text + ", address=" + address + ", photo=" + photo + ", encodeStr=" + encodeStr + "]";
	}



}