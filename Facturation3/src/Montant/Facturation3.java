package Montant;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Facturation3 {

	public static void main(String[] args) {

		List<Client> listeDeClients = new ArrayList();

		Particulier client0 = new Particulier();
		client0.setCivilite("Madame");
		client0.setNom("Marie");
		client0.setPrenom("Dubois");
		client0.setCaracteresNumeriques("000000000");
		client0.setConsoElectricite(17);
		client0.setConsoGaz(106);
		listeDeClients.add(client0);

		Particulier client1 = new Particulier();
		client1.setCivilite("Monsieur");
		client1.setNom("Antoine");
		client1.setPrenom("Martin");
		client1.setCaracteresNumeriques("111111111");
		client1.setConsoElectricite(293);
		client1.setConsoGaz(249);
		listeDeClients.add(client1);

		ClientProInf1ME client2 = new ClientProInf1ME();
		client2.setSiret("12345678901234");
		client2.setRaisonSociale("AlphaTech Solutions");
		client2.setChiffreDAffaires(706_051);
		client2.setCaracteresNumeriques("222222222");
		client2.setConsoElectricite(157);
		client2.setConsoGaz(262);
		listeDeClients.add(client2);

		ClientProSup1ME client3 = new ClientProSup1ME();
		client3.setSiret("34567890123456");
		client3.setRaisonSociale("Visionnaire Industrie");
		client3.setChiffreDAffaires(1_962_469L);
		client3.setCaracteresNumeriques("333333333");
		client3.setConsoElectricite(140);
		client3.setConsoGaz(379);
		listeDeClients.add(client3);

		ClientProSup1ME client4 = new ClientProSup1ME();
		client4.setSiret("78901234567890");
		client4.setRaisonSociale("Dynamique Ressources");
		client4.setChiffreDAffaires(1_878_956L);
		client4.setCaracteresNumeriques("444444444");
		client4.setConsoElectricite(45);
		client4.setConsoGaz(262);
		listeDeClients.add(client4);

		Scanner sc = new Scanner(System.in);
		System.out.println("\nAfin d'éditer la facture, entrez les 9 chiffres de la Référence Client. Par exemple, pour EKW000000000, écrivez 000000000"
				+ "\n(Essayez : 000000000, 111111111, 222222222, 333333333, et 444444444)");
		String nl = sc.nextLine();
		sc.close();
		for (Client client : listeDeClients) {
			if(client.getCaracteresNumeriques().equals(nl)) {
				NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
				double elec = client.getConsoElectricite()*client.getPrixElectricite();
				double gaz = client.getConsoGaz()*client.getPrixGaz();
				System.out.println(
						client.date() 
						+ client.informations() 
						+ client.elec()
						+ client.xuba()
						+ client.getConsoElectricite()
						+ client.kona()
						+ numberFormat(client.getPrixElectricite())
						+ client.kuva()
						+ nf.format(elec)
						+ client.bule()
						+ client.xuba()
						+ client.getConsoGaz()
						+ client.kona()
						+ numberFormat(client.getPrixGaz())
						+ client.kuva()
						+ nf.format(gaz)
						+ client.gadi()
						+ nf.format(elec + gaz)
						);
				break;
			}
		}

	}

	public static String numberFormat(double number) {
		NumberFormat frenchNumberFormat = NumberFormat.getNumberInstance(Locale.FRENCH);
		if (frenchNumberFormat instanceof DecimalFormat) {
			DecimalFormat decimalFormat = (DecimalFormat) frenchNumberFormat;
			decimalFormat.applyPattern("#,##0.000");
		}
		return frenchNumberFormat.format(number);
	}

	
}