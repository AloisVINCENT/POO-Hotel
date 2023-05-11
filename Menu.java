public class Menu {
    //Création de la variable de l'hôtel
    //public static Hotel h = Saisie.newHotel();
    //! Variables de test pour ne pas avoir à créer un hôtel à chaque fois
    public static Hotel h;
    public static Chambre ch1;
    public static Chambre ch2;
    public static Chambre ch3;
    public static Chambre ch4;
    public static Chambre ch5;
    public static Chambre ch6;
    public static Chambre ch7;
    public static Chambre ch8;
    public static Chambre ch9;
    public static Client cl;

    static {
        h = new Hotel("2 rue de l'hotel", "Maurice hotel");
        ch1 = new Chambre(101, 1, 50);
        ch2 = new Chambre(201, 2, 80);
        ch3 = new Chambre(301, 3, 50);
        ch4 = new Chambre(401, 4, 50);
        ch5 = new Chambre(501, 5, 150);
        ch6 = new Chambre(601, 6, 50);
        ch7 = new Chambre(701, 7, 50);
        ch8 = new Chambre(801, 8, 50);
        ch9 = new Chambre(901, 9, 50);
        
        h.addChambre(ch1);
        h.addChambre(ch2);
        h.addChambre(ch3);
        h.addChambre(ch4);
        h.addChambre(ch5);
        h.addChambre(ch6);        
        h.addChambre(ch7);
        h.addChambre(ch8);
        h.addChambre(ch9);
    }

    public static void Start() {
        // TODO Vérification de l'existence d'un fichier Hotel.txt
        // si Hotel.txt -> load le fichier dans la variable h
        // sinon -> public static Hotel h = Saisie.newHotel();
    }

    public static void newHotel1() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|                Entrez le nom de l'hotel                |");
        System.out.println("|--------------------------------------------------------|");

    }

    public static void newHotel2() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|              Entrez l'adresse de l'hotel               |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void newHotel3() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|                L'hotel a bien ete cree                 |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void Choix() {
        System.out.println();
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
        System.out.println();
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
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|             Entrez le numero de la chambre             |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void typeChambre() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|              Entrez le type de la chambre              |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("| 1 : Simple                                             |");
        System.out.println("| 2 : Double                                             |");
        System.out.println("| 3 : Suite Classique                                    |");
        System.out.println("| 4 : Suite Presidentielle                               |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void gestionClient() {
        System.out.println();
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
    public static void selectionChambreSecours() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|    Vous pouvez choisir une chambre d'un autre type     |");
    }
        public static void selectionChambreSecours1() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|   Voici la liste des chambres simples disponibles :    |");
        System.out.println("|--------------------------------------------------------|");
    }

        public static void selectionChambreSecours2() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|   Voici la liste des chambres doubles disponibles :    |");
        System.out.println("|--------------------------------------------------------|");
    }
        public static void selectionChambreSecours3() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|   Voici la liste des suites classiques disponibles :   |");
        System.out.println("|--------------------------------------------------------|");
    }
        public static void selectionChambreSecours4() {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|Voici la liste des suites présidentielles disponibles : |");
        System.out.println("|--------------------------------------------------------|");
    }

    public static void gestionSejour() {
        Saisie.gestionSejour();
    }
}
