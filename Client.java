
import java.util.*;

public class Client {
	public String name;
	/**
	* Default constructor
	*/
	public Client(String n) {
		name = n;
	}


	public Vector<Reservation> listeReservations = new Vector<Reservation>();
	public void addReservation(Reservation r){
		listeReservations.add(r);
	}


	public Vector<Hotel> listeClients = new Vector<Hotel>();
	public void addHotel(Hotel h){
		listeClients.add(h);
	}
}