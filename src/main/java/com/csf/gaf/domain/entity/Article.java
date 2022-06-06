package com.csf.gaf.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table (name = "article") 
public class Article {
	@Id  
	@Column  
	private String idArticle;
	
	@Column
	String Designation;
	
	@Column
	float Qte;
	
	@Column
	float PU_HTVA;
	
	@Column
	float TVA;
	
	@Column
	float PU_TTC;
	
	@Column
	String idFournisseur;

	public String getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(String idArticle) {
		this.idArticle = idArticle;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public float getQte() {
		return Qte;
	}

	public void setQte(float qte) {
		Qte = qte;
	}

	public float getPU_HTVA() {
		return PU_HTVA;
	}

	public void setPU_HTVA(float pU_HTVA) {
		PU_HTVA = pU_HTVA;
	}

	public float getTVA() {
		return TVA;
	}

	public void setTVA(float tVA) {
		TVA = tVA;
	}

	public float getPU_TTC() {
		return PU_TTC;
	}

	public void setPU_TTC(float pU_TTC) {
		PU_TTC = pU_TTC;
	}

	public String getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(String idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", Designation=" + Designation + ", Qte=" + Qte + ", PU_HTVA="
				+ PU_HTVA + ", TVA=" + TVA + ", PU_TTC=" + PU_TTC + ", idFournisseur=" + idFournisseur
				+ ", getIdArticle()=" + getIdArticle() + ", getDesignation()=" + getDesignation() + ", getQte()="
				+ getQte() + ", getPU_HTVA()=" + getPU_HTVA() + ", getTVA()=" + getTVA() + ", getPU_TTC()="
				+ getPU_TTC() + ", getIdFournisseur()=" + getIdFournisseur() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



}
