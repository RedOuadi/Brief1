package ecole;

import java.util.Scanner;

public class Administrateur {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("Menu:");
            System.out.println("1. Gérer les apprenants");
            System.out.println("2. Gérer les classes");
            System.out.println("3. Quitter");

            System.out.print("Choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choix) {
                case 1:
                    gererApprenants(scanner);
                    break;
                case 2:
                    gererClasses(scanner);
                    break;
                case 3:
                    continuer = false;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
        scanner.close();
    }

    public static void gererApprenants(Scanner scanner) {
        boolean continuer = true;
        while (continuer) {
            System.out.println("Menu Apprenants:");
            System.out.println("1. Ajouter un apprenant");
            System.out.println("2. Modifier un apprenant");
            System.out.println("3. Supprimer un apprenant");
            System.out.println("4. Consulter la liste des apprenants");
            System.out.println("5. Retour");

            System.out.print("Choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choix) {
                case 1:
                    ajouterApprenant(scanner);
                    break;
                case 2:
                    modifierApprenant(scanner);
                    break;
                case 3:
                    supprimerApprenant(scanner);
                    break;
                case 4:
                    consulterListeApprenants();
                    break;
                case 5:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

    public static void ajouterApprenant(Scanner scanner) {
        System.out.println("Entrez le nom de l'apprenant:");
        String nom = scanner.nextLine();
        System.out.println("Entrez le prénom de l'apprenant:");
        String prenom = scanner.nextLine();
        System.out.println("Entrez la date de naissance de l'apprenant:");
        String dateNaissance = scanner.nextLine();
        System.out.println("Entrez l'adresse de l'apprenant:");
        String adresse = scanner.nextLine();
        System.out.println("Entrez le numéro de téléphone de l'apprenant:");
        int numeroTelephone = scanner.nextInt();
        System.out.println("Entrez le numéro de classe de l'apprenant:");
        int numeroClasse = scanner.nextInt();
        Apprenant.ajouterApprenant(nom, prenom, dateNaissance, adresse, numeroTelephone, numeroClasse);
    }

    public static void modifierApprenant(Scanner scanner) {
        System.out.println("Entrez le nom de l'apprenant à modifier:");
        String ancienNom = scanner.nextLine();
        System.out.println("Entrez le prénom de l'apprenant à modifier:");
        String ancienPrenom = scanner.nextLine();
        // Collect new information
        // Then call the modifier method from Apprenant
    }

    public static void supprimerApprenant(Scanner scanner) {
        System.out.println("Entrez le nom de l'apprenant à supprimer:");
        String nom = scanner.nextLine();
        System.out.println("Entrez le prénom de l'apprenant à supprimer:");
        String prenom = scanner.nextLine();
        Apprenant.supprimerApprenant(nom, prenom);
    }

    public static void consulterListeApprenants() {
        Apprenant.consulterListeApprenants();
    }

    public static void gererClasses(Scanner scanner) {
        boolean continuer = true;
        while (continuer) {
            System.out.println("Menu Classes:");
            System.out.println("1. Ajouter une classe");
            System.out.println("2. Modifier une classe");
            System.out.println("3. Supprimer une classe");
            System.out.println("4. Consulter la liste des classes");
            System.out.println("5. Retour");

            System.out.print("Choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choix) {
                case 1:
                    ajouterClasse(scanner);
                    break;
                case 2:
                    modifierClasse(scanner);
                    break;
                case 3:
                    supprimerClasse(scanner);
                    break;
                case 4:
                    consulterListeClasses();
                    break;
                case 5:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

    public static void ajouterClasse(Scanner scanner) {
        // Logique pour ajouter une classe
    }

    public static void modifierClasse(Scanner scanner) {
        // Logique pour modifier une classe
    }

    public static void supprimerClasse(Scanner scanner) {
        // Logique pour supprimer une classe
    }

    public static void consulterListeClasses() {
        // Logique pour consulter la liste des classes
    }
}

