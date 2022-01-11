package com.ajc.projetfinal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Personne {
	@Id
	private String email;
	
	private String title;
	private String nom;
	private String prenom;
	private String birthday;
	private String adresse;
	private int codePostal;
	private String ville;
	private String username;
	private String password;
	
	@Version
	private int version;

	public Personne() {

	}

	public Personne(String email, String title, String nom, String prenom, String birthday, String adresse,
			int codePostal, String ville, String username, String password, int version) {
		super();
		this.email = email;
		this.title = title;
		this.nom = nom;
		this.prenom = prenom;
		this.birthday = birthday;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.username = username;
		this.password = password;
		this.version = version;
	}

	public Personne(String email, String title, String nom, String prenom, String birthday, String adresse,
			int codePostal, String ville, String username, String password) {
		super();
		this.email = email;
		this.title = title;
		this.nom = nom;
		this.prenom = prenom;
		this.birthday = birthday;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.username = username;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Personne [email=" + email + ", title=" + title + ", nom=" + nom + ", prenom=" + prenom + ", birthday="
				+ birthday + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + ", username="
				+ username + ", password=" + password + ", version=" + version + "]";
	}

	
	
}