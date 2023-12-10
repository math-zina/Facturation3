package Montant;

import Montant.Client;

public class Particulier extends Client {

	String civilite = "";
	String nom = "";
	String prenom = "";

	double prixElectricite = 0.133; // electricité
	double prixGaz = 0.108; // gaz

	@Override
	public String informations() {
		return civilite + " " + nom + " " + prenom;
	}

	@Override
	public double getPrixElectricite() {
		return prixElectricite;
	}

	@Override
	public double getPrixGaz() {
		return prixGaz;
	}

	
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}