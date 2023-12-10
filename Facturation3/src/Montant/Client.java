package Montant;

import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

abstract public class Client {

	public static final String PREFIXE = "EKW";

	String caracteresNumeriques = "";
	int consoElectricite = 0;
	int consoGaz = 0;

	public String date() {
		YearMonth ym = YearMonth.now().minusMonths(1);
		String fr = ym.getMonth().getDisplayName(TextStyle.FULL, Locale.FRENCH);
		String uc = fr.substring(0, 1).toUpperCase() + fr.substring(1);
		return "\nVoici la facture de ce client :\n\n\nFacture d'énergie - " 
		+ uc + " " + ym.getYear() + "\n\n";
	}

	abstract public String informations();

	public String getCaracteresNumeriques() {
		return caracteresNumeriques;
	}
	
	public String elec() {
		return "\nRéférence Client : " + PREFIXE + caracteresNumeriques
				+ "\n\nELECTRICITE";
	}

	public String xuba() {
		return "\n- Nombre de kWh consommés : ";
	}

	public int getConsoElectricite() {
		return consoElectricite;
	}

	public String kona() {
		return "\n- Prix du kWh (en €) : ";
	}

	abstract public double getPrixElectricite();

	public String kuva () {
		return "\n- Montant à payer : ";	
	}

	public String bule() {
		return "\n\nGAZ";
	}

	public int getConsoGaz() {
		return consoGaz;
	}
	
	abstract public double getPrixGaz();

	public String gadi() {
		return "\n\nMONTANT TOTAL A PAYER : ";
	}

	
	public void setCaracteresNumeriques(String caracteresNumeriques) {
		this.caracteresNumeriques = caracteresNumeriques;
	}

	public void setConsoElectricite(int consoElectricite) {
		this.consoElectricite = consoElectricite;
	}

	public void setConsoGaz(int consoGaz) {
		this.consoGaz = consoGaz;
	}

}