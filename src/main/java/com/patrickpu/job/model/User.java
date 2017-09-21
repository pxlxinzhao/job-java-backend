package com.patrickpu.job.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "users")
public class User {

   @Id
   @GeneratedValue
   @Column(name = "user_id")
   private Long userId;

   @Column(name = "username")
   @Size(max = 30, min = 3, message = "{user.name.invalid}")
   private String username;
   
   @Column(name = "password")
   @Size(max = 30, min = 3)
   private String password;

   @Column(name = "nickname")
   @Size(max = 30)
   private String nickname;

   @Column(name = "email", unique = true)
   @Email(message = "{user.email.invalid}")
   private String email;

	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", email=" + email + "]";
	}
   
}
