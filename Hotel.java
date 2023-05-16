
import java.util.Vector;
import java.util.Date;

public class Hotel {
	public String adress;
	public String name;
	public static Vector<Chambre> listeChambres = new Vector<Chambre>();
	public static Vector<Client> listeClients = new Vector<Client>();

	/*************************************************
	 * Default constructor
	 ************************************************/

	public Hotel(String a, String n) {
		adress = a;
		name = n;
	}

	/*************************************************
	 * Modifications de vecteurs
	 ************************************************/

	public void addChambre(Chambre ch) {
		listeChambres.add(ch);
	}

	public void addClient(Client cl) {
		listeClients.add(cl);
	}

	/*************************************************
	 * Méthodes
	 ************************************************/

	public static void affichageChambres() {
		if (listeChambres.size() != 0) {
			int x;
			String y;
			System.out.println("| N° Chambre |   Prix   |");
			for (Chambre ch : listeChambres) {
				// Formatage du prix en triple digit
				x = ch.price;
				if (x < 100) {
					y = "0" + x;
				} else {
					y = "" + x;
				}
				System.out.println("|------------|----------|");
				System.out.println("|    " + ch.num + "     |   " + y + "€   |");
			}
			System.out.println("|-----------------------|");
		} else {
			System.out.println("Erreur : Aucune chambre");
		}
	}

	public static void affichageChambres(Vector<Chambre> liste) {
		if (liste.size() != 0) {
			int x;
			String y;
			System.out.println("| N° Chambre |   Prix   |");
			for (Chambre ch : liste) {
				// Formatage du prix en triple digit
				x = ch.price;
				if (x < 100) {
					y = "0" + x;
				} else {
					y = "" + x;
				}
				System.out.println("|------------|----------|");
				System.out.println("|    " + ch.num + "     |   " + y + "$   |");
			}
			System.out.println("|-----------------------|");
		} else {
			System.out.println("Erreur : Aucune chambre");
		}
	}

	public static void affichageClients() {
		if (listeClients.size() != 0) {
			int x = 1;
			String y;
			System.out.println("| N° Client |   Nom du client   ");
			for (Client cl : listeClients) {
				// Formatage du numéro de client en double digits
				if (x < 10) {
					y = "0" + x;
				} else {
					y = "" + x;
				}
				System.out.println("|-----------|-------------------");
				System.out.println("|    " + y + "     | " + cl.name);
				x++;
			}
			System.out.println("|-------------------------------");
			Menu.Choix();
		} else {
			System.out.println("Erreur : Aucun client");
			Menu.Choix();
		}

	}

	public static Vector<Chambre> getFreeRooms(int priceWanted, Date start, Date end) {
		Vector<Chambre> chL = new Vector<Chambre>();
		for (Chambre x : Hotel.listeChambres) {
			if (x.price == priceWanted && x.isDispo(start, end, x) == true) {
				chL.add(x);
			}
		}
		return chL;
	}

}