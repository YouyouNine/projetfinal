package com.ajc.projetfinal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
@Entity
public class FormulaireService {
	@Id
	private String email;
	
	private String title;
	private String nom;
	private String prenom;
	private String societe;
	private int nsiret;
	private int telephone;
	private String objet;
	private String message;
	
	
	@Version
	private int version;


	public FormulaireService(String email, String title, String nom, String prenom, String societe, int nsiret,
			int telephone, String objet, String message, int version) {
		super();
		this.email = email;
		this.title = title;
		this.nom = nom;
		this.prenom = prenom;
		this.societe = societe;
		this.nsiret = nsiret;
		this.telephone = telephone;
		this.objet = objet;
		this.message = message;
		this.version = version;
	}


	public FormulaireService(String email, String title, String nom, String prenom, String societe, int nsiret,
			int telephone, String objet, String message) {
		super();
		this.email = email;
		this.title = title;
		this.nom = nom;
		this.prenom = prenom;
		this.societe = societe;
		this.nsiret = nsiret;
		this.telephone = telephone;
		this.objet = objet;
		this.message = message;
	}


	public FormulaireService() {
		super();
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


	public String getSociete() {
		return societe;
	}


	public void setSociete(String societe) {
		this.societe = societe;
	}


	public int getNsiret() {
		return nsiret;
	}


	public void setNsiret(int nsiret) {
		this.nsiret = nsiret;
	}


	public int getTelephone() {
		return telephone;
	}


	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	public String getObjet() {
		return objet;
	}


	public void setObjet(String objet) {
		this.objet = objet;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "FormulaireService [email=" + email + ", title=" + title + ", nom=" + nom + ", prenom=" + prenom
				+ ", societe=" + societe + ", nsiret=" + nsiret + ", telephone=" + telephone + ", objet=" + objet
				+ ", message=" + message + ", version=" + version + "]";
	}
	
	
	
	
	
	
	
	
}
