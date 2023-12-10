package Montant;

import Montant.Client;

abstract public class ClientPro extends Client {

	String siret = "";
	String raisonSociale = "";
	long chiffreDAffaires = 0;

	@Override
	public String informations() {
		return "Raison sociale : " + raisonSociale 
				+ "\nNuméro SIRET : " + siret;
	}

	
	public void setSiret (String siret) {
		this.siret = siret;
	}

	public void setRaisonSociale (String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public void setChiffreDAffaires (long chiffreDAffaires) {
		this.chiffreDAffaires = chiffreDAffaires;
	}

}