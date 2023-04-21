public class Menu {
    //Création de la variable de l'hôtel
    public static Hotel h = Saisie.newHotel();

    public static void Start() {
        // TODO Vérification de l'existence d'un fichier Hotel.txt
        // si Hotel.txt -> load le fichier dans la variable h
        // sinon -> public static Hotel h = Saisie.newHotel();
    }

    public static void newHotel1() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|                Entrez le nom de l'hotel                |");
        System.out.println("|--------------------------------------------------------|");

    }

    public static void newHotel2() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|              Entrez l'adresse de l'hotel               |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void newHotel3() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|                L'hotel a bien ete cree                 |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("");
    }

    public static void Choix() {
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

    public static void gestionChambre() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|     Rentrez le numero de ce que vous voulez gerer      |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("| 1 : Saisie d'une nouvelle chambre                      |");
        System.out.println("| 2 : Affichage de la liste des chambres                 |");
        System.out.println("|--------------------------------------------------------|");
        Saisie.gestionChambre();
    }
    public static void etageChambre(){
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|              Entrez l'etage de la chambre              |");
        System.out.println("|--------------------------------------------------------|");
    }
    public static void numChambre() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|             Entrez le numero de la chambre             |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println();
    }

    public static void typeChambre() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|              Entrez le type de la chambre              |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("| 1 : Simple                                             |");
        System.out.println("| 2 : Double                                             |");
        System.out.println("| 3 : Suite Classique                                    |");
        System.out.println("| 4 : Suite Presidentielle                               |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println();
    }

    public static void gestionClient() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|     Rentrez le numero de ce que vous voulez gerer      |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("| 1 : Saisie d'un.e nouveau.elle client.e                |");
        System.out.println("| 2 : Affichage de la liste des clients                  |");
        System.out.println("|--------------------------------------------------------|");
        Saisie.gestionClient();
    }

    public static void nomClient() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|           Entrez le nom du (de la) client.e            |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void dateArrivee() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|     Entrez la date d'arrivée au format dd/MM/yyyy      |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void dateDepart() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|     Entrez la date de départ au format dd/MM/yyyy      |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void selectionChambre() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|   Entrez le numéro de la chambre que vous souhaitez    |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void gestionSejour() {
        Saisie.gestionSejour();
    }
}
