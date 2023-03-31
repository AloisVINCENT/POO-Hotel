
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


	public Vector<Chambre> listeChambres = new Vector<Chambre>();
	public void addChambre(Chambre ch){
		listeChambres.add(ch);
	}


	public Vector<Client> listeClients = new Vector<Client>();
	public void addClient(Client cl){
		listeClients.add(cl);
	}
	

	public Vector<Produit> listeProduits = new Vector<Produit>();
	public void addProduit(Produit p){
		listeProduits.add(p);
	}
}