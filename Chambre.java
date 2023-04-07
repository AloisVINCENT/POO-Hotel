
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

	 
	public Vector<Reservation> listeReservations = new Vector<Reservation>();
	public void addReservation(Reservation r){
		listeReservations.add(r);
	}

	
	public boolean isDispo(Date start2, Date end2){
		for (Reservation r : listeReservations) {
			if (r.start.after(end2) || r.end.before(start2)) {
				// Les intervalles ne se chevauchent pas
				return true;
			}
		}
		return false;
	}
}