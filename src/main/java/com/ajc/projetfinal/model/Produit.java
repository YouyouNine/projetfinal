package com.ajc.projetfinal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Produit {
	@Id
	private int id;
	private String nom;
	private int prix;
	private String description;
	private String lienImage;
	
	@Version
	private int version;

	public Produit() {

	}

	public Produit(int id, String nom, int prix, String description, String lienImage, int version) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.lienImage = lienImage;
		this.version = version;
	}

	public Produit(int id, String nom, int prix, String description, String lienImage) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.lienImage = lienImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLienImage() {
		return lienImage;
	}

	public void setLienImage(String lienImage) {
		this.lienImage = lienImage;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", prix=" + prix + ", description=" + description + ", lienImage="
				+ lienImage + "]";
	}


	
	

	

	
	
}