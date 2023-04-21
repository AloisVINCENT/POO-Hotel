
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

	
	public Hotel hotel;
	public void setHotel(Hotel h){
		hotel = h;
	}

	 
	public static Vector<Reservation> listeReservations = new Vector<Reservation>();

	public void addReservation(Reservation r){
		listeReservations.add(r);
	}

	
	public static boolean isDispo(Date start2, Date end2){
		for (Reservation r : listeReservations) {
			if ( (start2.after(r.start) && start2.before(r.end)) || (end2.after(r.start) && end2.before(r.end)) || (start2.before(r.start) && end2.after(r.end))) {
				System.out.print("Conflit avec la reservation :");
				System.out.println(r.num);
				return false;
			}
		}
		System.out.print("Reservation valide");
		return true;
	}
	//!! ERREUR : 
	//!! Pourquoi retourner false ? Pq False plutot que true ? Comparer avec listeReserv ? Rester dans le for meme si faux a un moment !
}