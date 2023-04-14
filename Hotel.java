
import java.util.*;

public class Hotel {
	public String adress;
	public String name;
	/**
	 * Default constructor
	 */
	public Hotel(String a, String n) {
		adress = a;
		name = n;
	}


	public static Vector<Chambre> listeChambres = new Vector<Chambre>();
	public void addChambre(Chambre ch){
		listeChambres.add(ch);
	}

	public static void affichageChambres() {
		//TODO Affichage en tableau
		int x = 1;
		for (Chambre ch : listeChambres) {
			System.out.println("Chambre "+ x + ": Numéro : " + ch.num + " | Prix : " + ch.price);
			x++;
		}
	}

	public static Vector<Client> listeClients = new Vector<Client>();
	public void addClient(Client cl){
		listeClients.add(cl);
	}
	
	public static void affichageClients() {
		int x = 1;
		for (Client cl : listeClients) {
			System.out.println("Client "+ x + ": " + cl.name);
			x++;
		}
		Menu.Choix();
	}

	public Vector<Produit> listeProduits = new Vector<Produit>();
	public void addProduit(Produit p){
		listeProduits.add(p);
	}

	//TODO getFreeRooms qui va parcourir listeChambres et appliquer la methode isDispo

	public static Vector<Chambre> getFreeRooms(){
		return null;
	}

}