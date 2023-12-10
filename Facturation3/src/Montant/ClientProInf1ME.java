package Montant;

import Montant.ClientPro;

public class ClientProInf1ME extends ClientPro {

	double prixElectricite = 0.112;
	double prixGaz = 0.117;

	@Override
	public double getPrixElectricite() {
		return prixElectricite;
	}

	@Override
	public double getPrixGaz() {
		return prixGaz;
	}

}