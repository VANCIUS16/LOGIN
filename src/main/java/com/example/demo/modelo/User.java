package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_login")
public class User {
	
	@Id
    @Column(name = "id_usr")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "usr")
    private String username;
	@Column(name = "pw")
    private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
}
