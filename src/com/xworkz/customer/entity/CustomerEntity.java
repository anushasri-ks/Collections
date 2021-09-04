package com.xworkz.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_table")

public class CustomerEntity implements Serializable {

	@Column(name = "c_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "c_first_name")
	private String firstName;
	@Column(name = "c_last_name")
	private String lastName;
	@Column(name = "c_gender")
	private String gender;
	@Column(name = "c_age")
	private int age;
	@Column(name = "c_mobile_no")
	private String mobileNo;
	@Column(name = "c_email")
	private String email;
	@Column(name = "c_married")
	private boolean married;
	@Column(name = "c_billing_address")
	private String billingAddress;
	@Column(name = "c_delivery_address")
	private String deliveryAddress;

	public CustomerEntity() {
	}

	public CustomerEntity(String firstName, String lastName, String gender, int age, String mobileNo, String email,
			boolean married, String billingAddress, String deliveryAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.mobileNo = mobileNo;
		this.email = email;
		this.married = married;
		this.billingAddress = billingAddress;
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", mobileNo=" + mobileNo + ", email=" + email + ", married=" + married
				+ ", billingAddress=" + billingAddress + ", deliveryAddress=" + deliveryAddress + "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof CustomerEntity) {
			CustomerEntity casted = (CustomerEntity) obj;
			if (this.firstName.equals(casted.firstName) && this.lastName.equals(casted.lastName)
					&& this.mobileNo == casted.mobileNo) {
				return true;
			}
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
}
