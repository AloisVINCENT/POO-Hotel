import java.util.Scanner;

public class Saisie {
    public static Scanner sc = new Scanner(System.in);
    public static Hotel h = newHotel();
    
    public static Hotel newHotel(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Entrez le nom de l'hôtel");
        System.out.println("----------------------------------------------------------");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("Entrez l'adresse de l'hôtel");
        System.out.println("----------------------------------------------------------");
        String address = sc.nextLine();
        System.out.println();
        Hotel h = new Hotel(name, address);
        System.out.println("----------------------------------------------------------");
        System.out.println("L'hôtel a bien été créé");
        System.out.println("----------------------------------------------------------");
        return h;
    }
    
    public static void Start(){
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
            Menu.gestionRéservation();
            break;

            case 4:
            Menu.gestionSéjour();
            break;

            default:
            System.out.println("Erreur : Saisie invalide, veuillez entrer une valeur comprise entre 1 et 4");
            Start();
            break;
        }
    }

    public static void gestionChambre(){
        int x = sc.nextInt();
        int price1 = 50;
        int price2 = 80;
        int price3 = 150;
        int price4 = 200;
        switch (x) {
            case 1:
                System.out.println();
                System.out.println("----------------------------------------------------------");
                System.out.println("Entrez l'étage de la chambre");
                System.out.println("----------------------------------------------------------");
                int floor = sc.nextInt();
                System.out.println();
                while (floor < 0 | floor > 9) {
                    if (floor < 0) {
                        System.out.println("Erreur, l'étage ne peut être négatif, veuillez réessayer");
                    }
                    else {
                        System.out.println("Erreur, l'étage ne peut être supérieur à 9, veuillez réessayer");
                    }
                    floor = sc.nextInt();
                }

                System.out.println("----------------------------------------------------------");
                System.out.println("Entrez le numéro de la chambre");
                System.out.println("----------------------------------------------------------");
                int temp_num = sc.nextInt();
                System.out.println();

                while (temp_num < 0 | temp_num > 99) {
                    System.out.println("Erreur, le numéro ne peut être négatif, veuillez réessayer");
                    temp_num = sc.nextInt();
                }
                int num = floor * 100 + temp_num;
                System.out.println("----------------------------------------------------------");
                System.out.println("Entrez le type de la chambre");
                System.out.println("1 : Simple");
                System.out.println("2 : Double");
                System.out.println("3 : Suite Classique");
                System.out.println("4 : Suite Présidentielle");
                System.out.println("----------------------------------------------------------");
                int temp = sc.nextInt();
                System.out.println();
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
                
                //! Cette partie sert à vérifier la création de l'objet
                Chambre maChambre = new Chambre(num, floor, price);
                System.out.println("##########################################################");
                System.out.println("Numéro de chambre : " + maChambre.num);
                System.out.println("Étage : " + maChambre.floor);
                System.out.println("Prix : " + maChambre.price);
                System.out.println("##########################################################");

                h.addChambre(maChambre);

            case 2:
            //? Changer les numéros ou induire des prix variables
                break;
            default:
                break;
        }
    }

    public static void gestionClient(){
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println();
                System.out.println("----------------------------------------------------------");
                System.out.println("Entrez le nom du (de la) client.e");
                System.out.println("----------------------------------------------------------");
                String name = sc.next();
                System.out.println();
                //TODO Vérifier si nom en MAJ (On veut tout en MAJ)
                h.addClient(new Client(name));
                break;
            case 2 :
                //String cl = sc.next();
        }
    }
    public static void gestionRéservation(){
        
    }
    public static void gestionSéjour(){
        
    }
}
