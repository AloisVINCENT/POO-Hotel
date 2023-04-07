public class Menu {
    public static Hotel h = Saisie.newHotel();

    public static void Start(){
        //TODO Vérification de l'existence d'un fichier Hotel.txt
        //si Hotel.txt -> load le fichier dans la variable h
        //sinon -> public static Hotel h = Saisie.newHotel(); 
    }

    public static void Choix(){
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|     Rentrez le numero de ce que vous voulez gerer      |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("| 1 : Gestion des chambres                               |");
        System.out.println("| 2 : Gestion des clients                                |");
        System.out.println("| 3 : Affichage de la liste des réservations             |");
        System.out.println("| 4 : Gestion des sejours                                |");
        System.out.println("| 5 : Quitter                                            |");
        System.out.println("|--------------------------------------------------------|");
        Saisie.Start();
    }

    public static void gestionChambre(){
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|     Rentrez le numero de ce que vous voulez gerer      |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("| 1 : Saisie d'une nouvelle chambre                      |");
        System.out.println("| 2 : Affichage de la liste des chambres                 |");
        System.out.println("|--------------------------------------------------------|");
        Saisie.gestionChambre();
    }

    public static void gestionClient(){
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|     Rentrez le numero de ce que vous voulez gerer      |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("| 1 : Saisie d'un.e nouveau.elle client.e                |");
        System.out.println("| 2 : Affichage de la liste des clients                  |");
        System.out.println("|--------------------------------------------------------|");
        Saisie.gestionClient();
    }

    public static void gestionSejour(){
        Saisie.gestionSejour();
    }
}
