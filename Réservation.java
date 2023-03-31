
import java.util.*;

public class Réservation {
	public Date start;
	public Date end;
	public Client client;
	/**
	 * Default constructor
	 */
	public Réservation(Date s, Date e, Client c) {
		start = s;
		end = e;
		client = c;
	}


	public Vector<Chambre> listeChambresRéservées = new Vector<Chambre>();
	public void addChambre(Chambre ch){
		listeChambresRéservées.add(ch);
	}


	public Vector<Produit> listeProduits = new Vector<Produit>();
	public void addProduit(Produit p){
		listeProduits.add(p);
	}
}