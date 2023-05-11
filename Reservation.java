
import java.util.*;

public class Reservation {
	public Date start;
	public Date end;
	public Client client;
	public Chambre chambre;
	public int num;
	/**
	 * Default constructor
	 */
	public Reservation(Date s, Date e, Client cl, Chambre ch, int n) {
		start = s;
		end = e;
		client = cl;
		chambre = ch;
		num = n;
	}


	public Vector<Produit> listeProduits = new Vector<Produit>();
	public void addProduit(Produit p){
		listeProduits.add(p);
	}
}