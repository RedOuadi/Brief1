import java.util.ArrayList;
import java.util.Scanner;


public class Administrateur {

    private static ArrayList<Apprenant> apprenantListe = new ArrayList<>();
    private static Apprenant[] apprenantArr;
    private static ArrayList<Classe> classeListe = new ArrayList<>();
    private static Classe[] classeArr;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int choix;

        do {
            afficherMenuPrincipal();
            choix = cin.nextInt();

            switch (choix) {
                case 1:
                    ajouterApprenant();
                    break;
                case 2:
                    modifierInfosApprenant();
                    break;
                case 3:
                    supprimerApprenant();
                    break;
                case 4:
                    afficherListeApprenants();
                    break;
                case 5:
                    rechercherApprenant();
                    break;
                case 6:
                    ajouterClasse();
                    break;
                case 7:
                    modifierClasse();
                    break;
                case 8:
                    supprimerClasse();
                    break;
                case 9:
                    afficherListeClasses();
                    break;
                case 10:
                    filtrerParClasse();
                    break;
                case 0:
                    System.out.println("Au revoir!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
            }

        } while (choix != 0);
    }

    public static void afficherMenuPrincipal() {
        System.out.println("********************************************************** ");
        System.out.println("________________Gérer les Apprenants__________________");
        System.out.println("1. Ajouter des apprenants");
        System.out.println("2. Modifier les informations d'un apprenant");
        System.out.println("3. Supprimer un apprenant");
        System.out.println("4. Afficher la liste des apprenants");
        System.out.println("5. Rechercher un apprenant");
        System.out.println("********************************************************** ");
        System.out.println("________________Gérer les Classes Scolaires_____________");
        System.out.println("6. Ajouter une nouvelle classe");
        System.out.println("7. Modifier une classe");
        System.out.println("8. Supprimer une classe");
        System.out.println("9. Afficher la liste des classes");
        System.out.println("10. Filtrer les apprenants par classe");
        System.out.println("0. Quitter");
        System.out.println("********************************************************** ");
        System.out.print("Entrez votre choix: ");
    }

    public static void ajouterApprenant() {
        Scanner cin = new Scanner(System.in);
        System.out.print("Combien d'apprenants voulez-vous ajouter : ");
        int nombreApprenants = cin.nextInt();
        apprenantArr = new Apprenant[nombreApprenants];

        for (int i = 0; i < nombreApprenants; i++) {
            apprenantArr[i] = new Apprenant();
            System.out.println("**************************************");
            System.out.print("Entrez le prénom : ");
            apprenantArr[i].setPrenom(cin.next());
            System.out.print("Entrez le nom : ");
            apprenantArr[i].setNom(cin.next());
            System.out.print("Entrez la date de naissance : ");
            apprenantArr[i].setDateNaissance(cin.next());
            System.out.print("Entrez l'adresse : ");
            apprenantArr[i].setAdresse(cin.next());
            System.out.print("Entrez le numéro de téléphone : ");
            apprenantArr[i].setNumeroTelephone(cin.nextDouble());
            System.out.print("Entrez le numéro de classe : ");
            apprenantArr[i].setNumeroClasse(cin.nextInt());
            System.out.print("Entrez le numéro d'identité : ");
            apprenantArr[i].setNumeroIdentite(cin.nextInt());
        }

        for (int i = 0; i < apprenantArr.length; i++) {
            apprenantListe.add(apprenantArr[i]);
        }
    }

    public static void afficherListeApprenants() {
        if (apprenantListe.isEmpty()) {
            System.out.println("Aucune information sur les apprenants disponible.");
        } else {
            System.out.println("*************Liste des Apprenants************* ");
            for (int i = 0; i < apprenantListe.size(); i++) {
                System.out.println("Apprenant n° " + (i + 1));
                System.out.println("********************************************** ");
                System.out.println("********************************************** ");
                Apprenant apprenant = apprenantListe.get(i);
                System.out.println("Prénom : " + apprenant.getPrenom());
                System.out.println("Nom : " + apprenant.getNom());
                System.out.println("Date de Naissance : " + apprenant.getDateNaissance());
                System.out.println("Adresse : " + apprenant.getAdresse());
                System.out.println("Numéro de téléphone : " + apprenant.getNumeroTelephone());
                System.out.println("Numéro de classe : " + apprenant.getNumeroClasse());
                System.out.println("Numéro d'identité : " + apprenant.getNumeroIdentite());
            }
        }
    }

    public static void modifierInfosApprenant() {
        Scanner cin = new Scanner(System.in);

        if (apprenantListe.isEmpty()) {
            System.out.println("Aucune information sur les apprenants disponible.");
        } else {
            System.out.println("Entrez le prénom de l'apprenant dont vous souhaitez modifier les informations : ");
            String prenomApprenant = cin.next();
            boolean apprenantTrouve = false;

            for (int i = 0; i < apprenantListe.size(); i++) {
                Apprenant apprenant = apprenantListe.get(i);

                if (apprenant.getPrenom().equals(prenomApprenant)) {
                    apprenantTrouve = true;
                    System.out.println("Veuillez spécifier la modification que vous souhaitez apporter :");
                    System.out.println("========= Menu de modification des informations de l'apprenant ==========");
                    System.out.println("1. Modifier le prénom");
                    System.out.println("2. Modifier le nom");
                    System.out.println("3. Modifier la date de naissance");
                    System.out.println("4. Modifier l'adresse");
                    System.out.println("5. Modifier le numéro de téléphone");
                    System.out.println("6. Modifier le numéro de classe");
                    System.out.println("7. Modifier le numéro d'identité");
                    System.out.print("Entrez votre choix : ");
                    int choix = cin.nextInt();

                    switch (choix) {
                        case 1:
                            System.out.print("Entrez le nouveau prénom : ");
                            String nouveauPrenom = cin.next();
                            apprenant.setPrenom(nouveauPrenom);
                            break;
                        case 2:
                            System.out.print("Entrez le nouveau nom : ");
                            String nouveauNom = cin.next();
                            apprenant.setNom(nouveauNom);
                            break;
                        case 3:
                            System.out.print("Entrez la nouvelle date de naissance : ");
                            String nouvelleDateNaissance = cin.next();
                            apprenant.setDateNaissance(nouvelleDateNaissance);
                            break;
                        case 4:
                            System.out.print("Entrez la nouvelle adresse : ");
                            String nouvelleAdresse = cin.next();
                            apprenant.setAdresse(nouvelleAdresse);
                            break;
                        case 5:
                            System.out.print("Entrez le nouveau numéro de téléphone : ");
                            double nouveauNumeroTelephone = cin.nextDouble();
                            apprenant.setNumeroTelephone(nouveauNumeroTelephone);
                            break;
                        case 6:
                            System.out.print("Entrez le nouveau numéro de classe : ");
                            int nouveauNumeroClasse = cin.nextInt();
                            apprenant.setNumeroClasse(nouveauNumeroClasse);
                            break;
                        case 7:
                            System.out.print("Entrez le nouveau numéro d'identité : ");
                            int nouveauNumeroIdentite = cin.nextInt();
                            apprenant.setNumeroIdentite(nouveauNumeroIdentite);
                            break;
                        default:
                            System.out.println("Choix invalide. Veuillez réessayer.");
                    }
                }
            }

            if (!apprenantTrouve) {
                System.out.println("Désolé, cet apprenant n'a pas été trouvé.");
            }
        }
    }

    public static void supprimerApprenant() {
        Scanner cin = new Scanner(System.in);

        if (apprenantListe.isEmpty()) {
            System.out.println("Aucune information sur les apprenants disponible.");
        } else {
            System.out.println("Entrez le prénom de l'apprenant que vous souhaitez supprimer : ");
            String prenomApprenant = cin.next();
            boolean apprenantTrouve = false;

            for (int i = 0; i < apprenantListe.size(); i++) {
                Apprenant apprenant = apprenantListe.get(i);

                if (apprenant.getPrenom().equals(prenomApprenant)) {
                    apprenantTrouve = true;
                    apprenantListe.remove(i);
                    System.out.println("La suppression de l'apprenant a été effectuée avec succès!");
                    break;
                }
            }

            if (!apprenantTrouve) {
                System.out.println("Désolé, cet apprenant n'a pas été trouvé.");
            }
        }
    }

    public static void rechercherApprenant() {
        Scanner cin = new Scanner(System.in);

        if (apprenantListe.isEmpty()) {
            System.out.println("Aucune information sur les apprenants disponible.");
        } else {
            System.out.println("Entrez le prénom de l'apprenant que vous souhaitez rechercher : ");
            String prenomApprenant = cin.next();
            boolean apprenantTrouve = false;

            for (int i = 0; i < apprenantListe.size(); i++) {
                Apprenant apprenant = apprenantListe.get(i);

                if (apprenant.getPrenom().equals(prenomApprenant)) {
                    System.out.println("Apprenant trouvé : ");
                    System.out.println("***************************************************");
                    System.out.println("Prénom : " + apprenant.getPrenom());
                    System.out.println("Nom : " + apprenant.getNom());
                    System.out.println("Date de Naissance : " + apprenant.getDateNaissance());
                    System.out.println("Adresse : " + apprenant.getAdresse());
                    System.out.println("Numéro de téléphone : " + apprenant.getNumeroTelephone());
                    System.out.println("Numéro de classe : " + apprenant.getNumeroClasse());
                    System.out.println("Numéro d'identité : " + apprenant.getNumeroIdentite());
                    apprenantTrouve = true;
                    break;
                }
            }

            if (!apprenantTrouve) {
                System.out.println("Désolé, cet apprenant n'a pas été trouvé.");
            }
        }
    }

    public static void ajouterClasse() {
        Scanner cin = new Scanner(System.in);
        System.out.print("Combien de classes voulez-vous ajouter : ");
        int nombreClasses = cin.nextInt();
        classeArr = new Classe[nombreClasses];

        for (int i = 0; i < nombreClasses; i++) {
            classeArr[i] = new Classe();
            System.out.println("****************************");
            System.out.print("Entrez le numéro de classe : ");
            classeArr[i].setNumeroClasse(cin.nextInt());
            System.out.print("Entrez le nom de la classe : ");
            classeArr[i].setNomClasse(cin.next());
            System.out.print("Entrez l'effectif : ");
            classeArr[i].setEffectif(cin.nextInt());
        }

        for (int i = 0; i < classeArr.length; i++) {
            classeListe.add(classeArr[i]);
        }
    }

    public static void afficherListeClasses() {
        if (classeListe.isEmpty()) {
            System.out.println("Aucune information sur les classes disponible.");
        } else {
            System.out.println("************ Liste des Classes ********** ");
            for (int i = 0; i < classeListe.size(); i++) {
                System.out.println("Classe n° " + (i + 1));
                System.out.println("********************************************** ");
                System.out.println("********************************************** ");
                
                Classe classe = classeListe.get(i);
                System.out.println("\uD83D\uDE0E Numéro de classe : " + classe.getNumeroClasse());
                System.out.println("\uD83D\uDE03 Nom de la classe : " + classe.getNomClasse());
                System.out.println("\uD83D\uDE04 Effectif : " + classe.getEffectif());
            }
        }
    }

    public static void modifierClasse() {
        Scanner cin = new Scanner(System.in);

        if (classeListe.isEmpty()) {
            System.out.println("Aucune information sur les classes disponible.");
        } else {
            System.out.println("Entrez le nom de la classe dont vous souhaitez modifier les informations : ");
            String nomClasse = cin.next();
            boolean classeTrouvee = false;

            for (int i = 0; i < classeListe.size(); i++) {
                Classe classe = classeListe.get(i);

                if (classe.getNomClasse().equals(nomClasse)) {
                    classeTrouvee = true;
                    System.out.println("Veuillez spécifier la modification que vous souhaitez apporter :");
                    System.out.println("========= Menu de modification des informations de la classe ==========");
                    System.out.println("1. Modifier le numéro de classe");
                    System.out.println("2. Modifier le nom de la classe");
                    System.out.println("3. Modifier l'effectif");
                    System.out.print("Entrez votre choix : ");
                    int choix = cin.nextInt();

                    switch (choix) {
                        case 1:
                            System.out.print("Entrez le nouveau numéro de classe : ");
                            int nouveauNumeroClasse = cin.nextInt();
                            classe.setNumeroClasse(nouveauNumeroClasse);
                            break;
                        case 2:
                            System.out.print("Entrez le nouveau nom de la classe : ");
                            String nouveauNomClasse = cin.next();
                            classe.setNomClasse(nouveauNomClasse);
                            break;
                        case 3:
                            System.out.print("Entrez le nouvel effectif : ");
                            int nouvelEffectif = cin.nextInt();
                            classe.setEffectif(nouvelEffectif);
                            break;
                        default:
                            System.out.println("Choix invalide. Veuillez réessayer.");
                    }
                }
            }

            if (!classeTrouvee) {
                System.out.println("Désolé, cette classe n'a pas été trouvée.");
            }
        }
    }

    public static void supprimerClasse() {
        Scanner cin = new Scanner(System.in);

        if (classeListe.isEmpty()) {
            System.out.println("Aucune information sur les classes disponible.");
        } else {
            System.out.println("Entrez le nom de la classe que vous souhaitez supprimer : ");
            String nomClasse = cin.next();
            boolean classeTrouvee = false;

            for (int i = 0; i < classeListe.size(); i++) {
                Classe classe = classeListe.get(i);

                if (classe.getNomClasse().equals(nomClasse)) {
                    classeTrouvee = true;
                    classeListe.remove(i);
                    System.out.println("La suppression de la classe a été effectuée avec succès!");
                    break;
                }
            }

            if (!classeTrouvee) {
                System.out.println("Désolé, cette classe n'a pas été trouvée.");
            }
        }
    }

    public static void filtrerParClasse() {
        Scanner cin = new Scanner(System.in);

        if (apprenantListe.isEmpty()) {
            System.out.println("Aucune information sur les apprenants disponible.");
        } else {
            System.out.print("Entrez le numéro de classe pour filtrer les apprenants : ");
            int numeroClasse = cin.nextInt();
            boolean apprenantsTrouves = false;

            System.out.println("***********************************************");
            System.out.println("  Apprenants triés par classe ");
            Apprenant[] apprenantList = new Apprenant[100];
            for (Apprenant apprenant : apprenantList) {
                if (apprenant.getNumeroClasse() == numeroClasse) {
                    System.out.println(" : " + apprenant.getPrenom() + " " + apprenant.getNom() + " - Numéro de classe : " + apprenant.getNumeroClasse());
                    apprenantsTrouves = true;
                }
            }

            if (!apprenantsTrouves) {
                System.out.println("Aucun apprenant trouvé pour la classe " + numeroClasse);
            }
        }
    }
}
