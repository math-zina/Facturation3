package Montant;

import Montant.ClientPro;

public class ClientProSup1ME extends ClientPro  {

	double prixElectricite = 0.110;
	double prixGaz = 0.123;

	@Override
	public double getPrixElectricite() {
		return prixElectricite;
	}

	@Override
	public double getPrixGaz() {
		return prixGaz;
	}

}