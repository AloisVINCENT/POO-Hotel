
import java.util.*;

public class Chambre {
	public int num;
	public int floor;
	public int price;
	/**
	 * Default constructor
	 */
	public Chambre(int n, int f, int p) {
		num = n;
		floor = f;
		price = p;
	}

	
	public Vector<Hotel> listeChambres = new Vector<Hotel>();
	public void addHotel(Hotel h){
		listeChambres.add(h);
	}

	 
	public Vector<Réservation> listeRéservations = new Vector<Réservation>();
	public void addRéservation(Réservation r){
		listeRéservations.add(r);
	}
}