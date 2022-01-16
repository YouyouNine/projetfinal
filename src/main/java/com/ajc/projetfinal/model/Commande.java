package com.ajc.projetfinal.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Commande {
	
//	 private static final AtomicInteger ID_FACTORY = new AtomicInteger();  
	 @Id
	 private String date;
	 private int prixTotal;
	 private String status;

	public Commande() {
	}

	public Commande(String date, int prixTotal, String status) {
		this.date = date;
		this.prixTotal = prixTotal;
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(int prixTotal) {
		this.prixTotal = prixTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return "commande [ date=" + date + ", prixTotal=" + prixTotal + ", status=" + status + "]";
	}
	
	
	
	 

}
