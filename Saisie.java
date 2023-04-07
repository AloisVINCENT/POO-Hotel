import java.util.*;
import java.text.*;

public class Saisie {
    public static Scanner sc = new Scanner(System.in);

    public static Hotel newHotel() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|                Entrez le nom de l'hotel                |");
        System.out.println("|--------------------------------------------------------|");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|              Entrez l'adresse de l'hotel               |");
        System.out.println("|--------------------------------------------------------|");
        String address = sc.nextLine();
        System.out.println();
        Hotel h = new Hotel(name, address);
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|                L'hotel a bien ete cree                 |");
        System.out.println("|--------------------------------------------------------|");
        return h;
    }

    public static void Start() {
        boolean fin = false;
        while (!fin) {
            int x = sc.nextInt();
            System.out.println();
            switch (x) {
                case 1:
                    Menu.gestionChambre();
                    break;
                case 2:
                    Menu.gestionClient();
                    break;
                case 3:
                    affichageReservation();
                    break;
                case 4:
                    Menu.gestionSejour();
                    break;
                case 5:
                    fin = true;
                    break;
                default:
                    System.out.println("Erreur : Saisie invalide, veuillez entrer une valeur comprise entre 1 et 5");
                    Start();
                    break;
            }
        }

    }

    public static void gestionChambre() {
        int x = sc.nextInt();
        // Prix de la chambre simple
        int price1 = 50;
        // Prix de la chambre double
        int price2 = 80;
        // Prix de la suite classique
        int price3 = 150;
        // Prix de la suite présidentielle
        int price4 = 200;
        switch (x) {
            case 1:
                System.out.println();
                System.out.println("|--------------------------------------------------------|");
                System.out.println("|              Entrez l'etage de la chambre              |");
                System.out.println("|--------------------------------------------------------|");
                int floor = sc.nextInt();
                System.out.println();
                while (floor < 0 | floor > 9) {
                    if (floor < 0) {
                        System.out.println("Erreur, l'etage ne peut être negatif, veuillez reessayer");
                    } else {
                        System.out.println("Erreur, l'etage ne peut être superieur à 9, veuillez reessayer");
                    }
                    floor = sc.nextInt();
                }


                System.out.println("|--------------------------------------------------------|");
                System.out.println("|             Entrez le numero de la chambre             |");
                System.out.println("|--------------------------------------------------------|");
                System.out.println();

                int temp_num = sc.nextInt();
                while (temp_num < 0 | temp_num > 99) {
                    System.out.println("Erreur, le numero ne peut être negatif, veuillez reessayer");
                    temp_num = sc.nextInt();
                }
                int num = floor * 100 + temp_num;


                System.out.println("|--------------------------------------------------------|");
                System.out.println("|              Entrez le type de la chambre              |");
                System.out.println("|--------------------------------------------------------|");
                System.out.println("| 1 : Simple                                             |");
                System.out.println("| 2 : Double                                             |");
                System.out.println("| 3 : Suite Classique                                    |");
                System.out.println("| 4 : Suite Presidentielle                               |");
                System.out.println("|--------------------------------------------------------|");
                System.out.println();

                int temp = sc.nextInt();
                int price = 0;
                while (temp > 4 | temp < 1) {
                    System.out.println("Erreur : Saisie invalide, veuillez entrer une valeur comprise entre 1 et 4");
                }

                switch (temp) {
                    case 1:
                        price = price1;
                        break;

                    case 2:
                        price = price2;
                        break;

                    case 3:
                        price = price3;
                        break;

                    case 4:
                        price = price4;
                        break;

                    default:
                        break;
                }

                // ! Cette partie sert à verifier la creation de l'objet
                Chambre maChambre = new Chambre(num, floor, price);
                System.out.println("##########################################################");
                System.out.println("Numero de chambre : " + maChambre.num);
                System.out.println("etage : " + maChambre.floor);
                System.out.println("Prix : " + maChambre.price);
                System.out.println("##########################################################");

                Menu.h.addChambre(maChambre);

            case 2:
                // TODO Affichage de la liste des chambres
                break;
            default:
                break;
        }
        Menu.Choix();
    }

    public static void gestionClient() {
        int compteur = 0;
        int x = sc.nextInt();
        boolean x1 = false;
        switch (x) {
            case 1:
                System.out.println();
                System.out.println("|--------------------------------------------------------|");
                System.out.println("|           Entrez le nom du (de la) client.e            |");
                System.out.println("|--------------------------------------------------------|");
                String name = sc.next();
                System.out.println();
                // TODO Verifier si nom en MAJ (On veut tout en MAJ)
                Client c = new Client (name);
                Menu.h.addClient(c);
                compteur++;
                gestionReservation(c, compteur);
                break;
            case 2:
                x1 = true;
                // TODO Affichage de la liste des clients
        }
        if (x1) {
            Menu.Choix();
        }
    }

    public static void gestionReservation(Client c, int num) {
        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|     Entrez la date d'arrivée au format dd/MM/yyyy      |");
        System.out.println("|--------------------------------------------------------|");
        //TODO comprendre comment ça fonctionne
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date start = null;
        try {
            start = dateFormat.parse(sc.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|     Entrez la date de départ au format dd/MM/yyyy      |");
        System.out.println("|--------------------------------------------------------|");
        Date end = null;
        
        try {
            start = dateFormat.parse(sc.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }


        Reservation r = new Reservation(start, end, c, num);
        

        Menu.Choix();
    }

    public static void affichageReservation(){
        Menu.Choix();
    }

    public static void gestionSejour() {
        Menu.Choix();
    }
}
