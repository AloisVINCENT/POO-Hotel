
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

	public static void affichageReservation(){
        int x = 1;
		for (Reservation r : Chambre.listeReservations) {
			//TODO Affichage en tableau 
			System.out.println("Reservation "+ x + ": Nom du client : " + r.client.name + " | Numéro de chambre : " + r.chambre.num + " | Dates : " + r.start + " - " + r.end);
			x++;
		}
        Menu.Choix();
    }

	public Vector<Produit> listeProduits = new Vector<Produit>();
	public void addProduit(Produit p){
		listeProduits.add(p);
	}
}