
import java.util.*;

public class Reservation {
	public Date start;
	public Date end;
	public Client client;
	public int num;
	/**
	 * Default constructor
	 */
	public Reservation(Date s, Date e, Client c, int n) {
		start = s;
		end = e;
		client = c;
		num = n;
	}


	public Chambre chambre;
	public void setChambre(Chambre ch){
		chambre = ch;
	}


	public Vector<Produit> listeProduits = new Vector<Produit>();
	public void addProduit(Produit p){
		listeProduits.add(p);
	}
}