package com.jsoft.ems.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nasruddin khan 
 *
1:32:00 AM
 */
@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID", nullable=false)
	private Long address_id;
	@Column(name = "ADDRESS")
	private String addres;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "DISTRICT")
	private String district;
	@Column(name = "PINCODE")
	private String pincode;

	

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", addres=" + addres + ", city=" + city + ", state=" + state
				+ ", district=" + district + ", pincode=" + pincode + "]";
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}

}
