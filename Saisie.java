import java.util.*;
import java.text.*;

public class Saisie {
    //Le compteur sert au numéro de réservation
    public static int compteur = 0;

    public static Scanner sc = new Scanner(System.in);


    public static Hotel newHotel() {
        Menu.newHotel1();
        String name = sc.nextLine();
        System.out.println();
        Menu.newHotel2();
        String address = sc.nextLine();
        System.out.println();
        Hotel h = new Hotel(name, address);
        Menu.newHotel3();
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
                    Reservation.affichageReservation();
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

        switch (x) {
            case 1:
                Menu.etageChambre();

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

                Menu.numChambre();

                int temp_num = sc.nextInt();
                while (temp_num < 0 | temp_num > 99) {
                    System.out.println("Erreur, le numero ne peut être negatif, veuillez reessayer");
                    temp_num = sc.nextInt();
                }
                int num = floor * 100 + temp_num;

                Menu.typeChambre();

                int temp = sc.nextInt();
                int price = 0;
                while (temp > 4 | temp < 1) {
                    System.out.println("Erreur : Saisie invalide, veuillez entrer une valeur comprise entre 1 et 4");
                }

                switch (temp) {
                    case 1:
                        price = 50;
                        break;

                    case 2:
                        price = 80;
                        break;

                    case 3:
                        price = 150;
                        break;

                    case 4:
                        price = 200;
                        break;

                    default:
                        break;
                }


                Chambre chambreSelectionne = new Chambre(num, floor, price);
                Menu.h.addChambre(chambreSelectionne);
                break;
            case 2:
                Hotel.affichageChambres();
                break;
            default:
                break;
        }
        //Peu importe le switch, on veut retourner au menu à la fin
        Menu.Choix();
    }

    public static void gestionClient() {
        int x = sc.nextInt();
        switch (x) {
            case 1:
                Menu.nomClient();
                String name = sc.next();
                System.out.println();
                // TODO Verifier si nom en MAJ (On veut tout en MAJ)
                Client c = new Client (name);
                Menu.h.addClient(c);
                compteur++;
                gestionReservation(c, compteur);
                break;
            case 2:
                Hotel.affichageClients();
        }
    }

    public static void gestionReservation(Client cl, int num) {
        Menu.dateArrivee();
        //TODO comprendre comment ça fonctionne
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date start = null;
        try {
            start = dateFormat.parse(sc.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Menu.dateDepart();
        Date end = null;
        try {
            start = dateFormat.parse(sc.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // On veut assigner une chambre à notre reservation en parcourant la liste de chambres
        Chambre ch = null;
        for (Chambre x : Hotel.listeChambres) {
            ch = x;
        }
        Reservation r = new Reservation(start, end, cl, ch, num);
        ch.addReservation(r);

        

        Menu.Choix();
    }



    public static void gestionSejour() {
        Menu.Choix();
    }
}
