/**
 * 
 */
package com.jsoft.ems.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nasruddin khan Waris
 *
1:41:32 AM
 */
@Entity
@Table(name = "ADDRESS_DETAILS")
public class PresentAddress extends BaseBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5372239777199966847L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private Long addressId;
	@Column(name = "ADDRESS_LINE_1")
	private String addressLine1;
	@Column(name = "ADDRESS_LINE_2")
	private String addressLine2;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "STATE")
	private String state;
	@Column(name = "CITY")
	private String city;
	@Column(name = "PINCODE")
	private String pinCode;
	@Column(name = "AVL_STATUS")
	private String status;
	@Column(name = "EMP_ID")
	private Long empId;
	
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
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
	
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "PresentAddress [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", country=" + country + ", state=" + state + ", city=" + city + ", pinCode=" + pinCode
				+ ", status=" + status + ", empId=" + empId + "]";
	}
	
}
