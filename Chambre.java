
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

	
	public static boolean isDispo(Date startToCheck, Date endToCheck){
		for (Reservation r : listeReservations) {
			if ( (startToCheck.after(r.start) && startToCheck.before(r.end)) || (endToCheck.after(r.start) && endToCheck.before(r.end)) || (startToCheck.before(r.start) && endToCheck.after(r.end))) {
				System.out.println("Conflit avec la reservation : " + r.num);
				return false;
			}
		}
		System.out.print("Reservation valide");
		return true;
	}

}