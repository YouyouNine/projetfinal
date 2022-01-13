package com.ajc.projetfinal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Newsletter {
	@Id
	private String email;
	
	@Version
	private int version;

	public Newsletter(String email, int version) {
		super();
		this.email = email;
		this.version = version;
	}

	public Newsletter(String email) {
		super();
		this.email = email;
	}

	public Newsletter() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Newsletter [email=" + email + ", version=" + version + "]";
	}
	
	

}
