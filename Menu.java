public class Menu {

    public static void newHotel(){
        System.out.println("Définissez l'hôtel");
        //TODO : Garder en mémoire l'hôtel et vérifier si il est présent dans la base de données
        Saisie.newHotel(); 
    }

    public static void Start(){
        Saisie();
        System.out.println("----------------------------------------------------------");
        System.out.println("Rentrez le numéro correspondant à ce que vous voulez gérer");
        System.out.println("1 : Gestion des chambres");
        System.out.println("2 : Gestion des clients");
        System.out.println("3 : Gestion des réservations");
        System.out.println("4 : Gestion des séjours");
        System.out.println("----------------------------------------------------------");
        Saisie.Start();
    }

    public static void gestionChambre(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Rentrez le numéro correspondant à ce que vous voulez gérer");
        System.out.println("1 : Saisie d'une nouvelle chambre");
        System.out.println("2 : Modification d'une chambre");
        System.out.println("----------------------------------------------------------");
        Saisie.gestionChambre();
    }

    public static void gestionClient(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Rentrez le numéro correspondant à ce que vous voulez gérer");
        System.out.println("1 : Saisie d'un.e nouveau.elle client.e");
        System.out.println("2 : Modification des informations d'un.e client.e");
        System.out.println("----------------------------------------------------------");
        Saisie.gestionClient();
    }

    public static void gestionRéservation(){
        Saisie.gestionRéservation();
    }

    public static void gestionSéjour(){
        Saisie.gestionSéjour();
    }
}
