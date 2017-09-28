package com.patrickpu.job.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue
	@Column(name="id")
	private Long id;
	@Column(name="postby")
	private String postby;
	@Column(name="timestamp")
	private Date timestamp;
	@Column(name="title")
	private String title;
	@Column(name="details")
	private String details;
	@Column(name="category")
	private String category;
	@Column(name="salary")
	private String salary;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	@Column(name="phone2")
	private String phone2;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="isagent")
	private Boolean isagent;
	@Column(name="requirement")
	private String requirement;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPostby() {
		return postby;
	}
	public void setPostby(String postby) {
		this.postby = postby;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Boolean getIsagent() {
		return isagent;
	}
	public void setIsagent(Boolean isagent) {
		this.isagent = isagent;
	}
	public String getRequirment() {
		return requirement;
	}
	public void setRequirment(String requirment) {
		this.requirement = requirment;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", postby=" + postby + ", timestamp=" + timestamp + ", title=" + title + ", details="
				+ details + ", category=" + category + ", salary=" + salary + ", email=" + email + ", phone=" + phone
				+ ", phone2=" + phone2 + ", address=" + address + ", city=" + city + ", state=" + state + ", country="
				+ country + ", isagent=" + isagent + ", requirement=" + requirement + "]";
	}
	
}
