
import java.util.*;

public class Client {
	public String name;
	/**
	* Default constructor
	*/
	public Client(String n) {
		name = n;
	}


	public Vector<Réservation> listeRéservations = new Vector<Réservation>();
	public void addRéservation(Réservation r){
		listeRéservations.add(r);
	}


	public Vector<Hotel> listeClients = new Vector<Hotel>();
	public void addClient(Hotel h){
		listeClients.add(h);
	}
}