
import java.text.SimpleDateFormat;
import java.util.*;

public class Chambre {
	public int num;
	public int floor;
	public int price;
	public Hotel hotel;
	public Vector<Reservation> listeReservations = new Vector<Reservation>();
	public static Vector<Reservation> listeReservationsGlobale = new Vector<Reservation>();

	/*************************************************
	 * Default constructor
	 ************************************************/

	public Chambre(int n, int f, int p) {
		num = n;
		floor = f;
		price = p;
	}

	/*************************************************
	 * Modifications de variables
	 *************************************************/

	public void setHotel(Hotel h) {
		hotel = h;
	}

	public void addReservation(Reservation r) {
		listeReservations.add(r);
		listeReservationsGlobale.add(r);
	}

	public void initListeReservation(Vector<Reservation> lR) {
		listeReservationsGlobale.addAll(lR);
	}

	/*************************************************
	 * Méthodes
	 *************************************************/

	public static String dateToString(Date d) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String s = dateFormat.format(d);
		return s;
	}

	public static void affichageReservations() {
		if (listeReservationsGlobale.size() != 0) {
			// Compteur du numéro de réservation
			int x = 1;
			String y;
			System.out.println("| N° | N° Chambre |   Dates (Début - fin)   |   Nom du client   ");
			for (Reservation r : listeReservationsGlobale) {
				// Formatage du numéro de réservation en double digits
				if (x < 10) {
					y = "0" + x;
				} else {
					y = "" + x;
				}
				System.out.println("|----|------------|-------------------------|-------------------");
				System.out.println("| " + y + " |    " + r.chambre.num + "     | " + dateToString(r.start) + " - "
						+ dateToString(r.end) + " | " + r.client.name);
				x++;
			}
			System.out.println("|---------------------------------------------------------------");
			Menu.Choix();
		} else {
			System.out.println("Erreur : Aucune réservation");
			Menu.Choix();
		}
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
