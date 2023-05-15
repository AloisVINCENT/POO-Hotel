
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

	public void setHotel(Hotel h) {
		hotel = h;
	}

	public Vector<Reservation> listeReservations = new Vector<Reservation>();

	public void addReservation(Reservation r) {
		listeReservations.add(r);
		listeReservationsGlobale.add(r);
	}

	public static Vector<Reservation> listeReservationsGlobale = new Vector<Reservation>();

	public void initListeReservation (Vector<Reservation> lR){
		listeReservationsGlobale.addAll(lR);
	}

	public static void affichageReservation(){
        int x = 1;
		for (Reservation r : listeReservationsGlobale) {
			//TODO Affichage en tableau 
			System.out.println("Reservation "+ x + ": Nom du client : " + r.client.name + " | Numéro de chambre : " + r.chambre.num + " | Dates : " + r.start + " - " + r.end);
			x++;
		}
        Menu.Choix();
    }

	public boolean isDispo(Date startToCheck, Date endToCheck, Chambre ch) {
		for (Reservation r : ch.listeReservations) {
			if ((startToCheck.after(r.start) && startToCheck.before(r.end))
					|| (endToCheck.after(r.start) && endToCheck.before(r.end))
					|| (startToCheck.before(r.start) && endToCheck.after(r.end))
					|| (startToCheck.equals(r.start))
					|| (endToCheck.equals(r.end))) {
				return false;
			}
		}
		return true;
	}
}
