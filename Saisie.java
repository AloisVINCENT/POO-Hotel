import java.util.*;
import java.text.*;

public class Saisie {
    // Le compteur sert au numéro de réservation
    public static int compteur = 0;

    public static Scanner sc = new Scanner(System.in);

    public static Hotel newHotel() {
        Menu.newHotel1();
        String name = sc.nextLine();
        Menu.newHotel2();
        String address = sc.nextLine();
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
                    Chambre.affichageReservation();
                    break;
                case 4:
                    Menu.gestionSejour();
                    break;
                case 5:
                    fin = true;
                    sc.close();
                    System.exit(0);
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
                    temp = sc.nextInt();
                }
                //? Le prix définit le type de chambre
                switch (temp) {
                    case 1:
                    //Simple
                        price = 50;
                        break;

                    case 2:
                    //Double
                        price = 80;
                        break;

                    case 3:
                    //Classique
                        price = 150;
                        break;

                    case 4:
                    //Présidentielle
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
        // Peu importe le switch, on veut retourner au menu à la fin
        Menu.Choix();
    }

    public static void gestionClient() {
        int x = sc.nextInt();
        switch (x) {
            case 1:
                Menu.nomClient();
                String name = sc.next();
                Client c = new Client(name.toUpperCase());
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
        // TODO comprendre comment ça fonctionne
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
            end = dateFormat.parse(sc.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Menu.typeChambre();

        int type = sc.nextInt();
        while (type > 4 | type < 1) {
            System.out.println("Erreur : Saisie invalide, veuillez entrer une valeur comprise entre 1 et 4");
            type = sc.nextInt();
        }

        int priceWanted = 0;
        switch (type) {
            case 1:
                priceWanted = 50;
                break;

            case 2:
                priceWanted = 80;
                break;

            case 3:
                priceWanted = 150;
                break;

            case 4:
                priceWanted = 200;
                break;

            default:
                break;
        }

        // On veut assigner une chambre à notre reservation en parcourant la liste des chambres disponibles
        Vector<Chambre> listChambresDispo = new Vector<Chambre>();
        listChambresDispo = Hotel.getFreeRooms(priceWanted, start, end);

        if (listChambresDispo.size() == 0) {
            System.out.println("Erreur : liste vide");
            choixChambreSecours(start, end, cl, num);
        }

        Hotel.affichageChambres(listChambresDispo);
        Menu.selectionChambre();
        Chambre ch = choixChambre(listChambresDispo);
        while (ch == null) {
            System.out.println("Erreur : Numéro de chambre invalide, veuillez réessayer");
            ch = choixChambre(listChambresDispo);
        }
        Reservation r = new Reservation(start, end, cl, ch, num);
        ch.addReservation(r);
        Menu.Choix();
    }

    public static Chambre choixChambre(Vector<Chambre> liste) {
        int temp = sc.nextInt();
        for (Chambre i : liste) {
            if (i.num == temp) {
                return i;
            }
        }
        return null;
    }

    public static void choixChambreSecours(Date start, Date end, Client cl, int num){

        // On regarde si il y a au moins une autre chambre disponible sur cette période
        if ((Hotel.getFreeRooms(50, start, end)).size() == 0 && (Hotel.getFreeRooms(80, start, end)).size() == 0 && (Hotel.getFreeRooms(150, start, end)).size() == 0 && (Hotel.getFreeRooms(200, start, end)).size() == 0) {
            Chambre.affichageReservation();
        } 
        
        //On propose les autres types de chambres
        else Menu.selectionChambreSecours();
        //On crée les listes des autres chambres disponibles
        Vector<Chambre> liste1 = new Vector<Chambre>();
        liste1 = Hotel.getFreeRooms(50, start, end);
        Vector<Chambre> liste2 = new Vector<Chambre>();
        liste2 = Hotel.getFreeRooms(80, start, end);
        Vector<Chambre> liste3 = new Vector<Chambre>();
        liste3 = Hotel.getFreeRooms(150, start, end);
        Vector<Chambre> liste4 = new Vector<Chambre>();
        liste4 = Hotel.getFreeRooms(200, start, end);

        Vector<Chambre> listChambresDispo = new Vector<Chambre>();
        listChambresDispo.addAll(liste1);
        listChambresDispo.addAll(liste2);
        listChambresDispo.addAll(liste3);
        listChambresDispo.addAll(liste4);



        if (liste1.size() != 0) {
            Menu.selectionChambreSecours1();
            Hotel.affichageChambres(liste1);
        } if (liste2.size() != 0) {
            Menu.selectionChambreSecours2();
            Hotel.affichageChambres(liste2);
        } if (liste3.size() != 0) {
            Menu.selectionChambreSecours3();
            Hotel.affichageChambres(liste3);
        } if (liste4.size() != 0) {
            Menu.selectionChambreSecours4();
            Hotel.affichageChambres(liste4);
        }


        Chambre ch = choixChambre(listChambresDispo);
        while (ch == null) {
            System.out.println("Erreur : Numéro de chambre invalide, veuillez réessayer");
            ch = choixChambre(listChambresDispo);
        }
        Reservation r = new Reservation(start, end, cl, ch, num);
        ch.addReservation(r);
        Menu.Choix();
    }


    public static void gestionSejour() {
        Menu.Choix();
    }
}
