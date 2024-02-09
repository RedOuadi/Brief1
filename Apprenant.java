package ecole;
public class Apprenant {
    private static final int MAX_APPRENANTS = 100;
    public Apprenant[] listeApprenants = new Apprenant[MAX_APPRENANTS];
    private static int nbApprenants = 0;

    private String nom;
    private String prenom;
    private String dateNaissance;
    private String adresse;
    private int numeroTelephone;
    private int numeroClasse;

    public Apprenant(String nom, String prenom, String dateNaissance, String adresse, int numeroTelephone, int numeroClasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.numeroClasse = numeroClasse;
        listeApprenants[nbApprenants++] = this;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public int getNumeroTelephone() {
        return numeroTelephone;
    }
    public void setNumeroTelephone(int numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
    public int getNumeroClasse() {
        return numeroClasse;
    }
    public void setNumeroClasse(int numeroClasse) {
        this.numeroClasse = numeroClasse;
    }
    
    
    public void ajouterApprenant(String nom, String prenom, String dateNaissance, String adresse, int numeroTelephone, int numeroClasse) {
        if (nbApprenants < MAX_APPRENANTS) {
            new Apprenant(nom, prenom, dateNaissance, adresse, numeroTelephone, numeroClasse);
        } else {
            System.out.println("Impossible d'ajouter plus d'apprenants. Limite atteinte.");
        }
    }
    
    
    public  void modifierApprenant(String ancienNom, String ancienPrenom, String nouveauNom, String nouveauPrenom, String dateNaissance, String adresse, int numeroTelephone, int numeroClasse) {
        for (int i = 0; i < nbApprenants; i++) {
            if (listeApprenants[i].getNom().equals(ancienNom) && listeApprenants[i].getPrenom().equals(ancienPrenom)) {
                listeApprenants[i].setNom(nouveauNom);
                listeApprenants[i].setPrenom(nouveauPrenom);
                listeApprenants[i].setDateNaissance(dateNaissance);
                listeApprenants[i].setAdresse(adresse);
                listeApprenants[i].setNumeroTelephone(numeroTelephone);
                listeApprenants[i].setNumeroClasse(numeroClasse);
                break;
            }
        }
    }

    public void supprimerApprenant(String nom, String prenom) {
        for (int i = 0; i < nbApprenants; i++) {
            if (listeApprenants[i].getNom().equals(nom) && listeApprenants[i].getPrenom().equals(prenom)) {
                for (int j = i; j < nbApprenants - 1; j++) {
                    listeApprenants[j] = listeApprenants[j + 1];
                }
                nbApprenants--;
                break;
            }
        }
    }

    public  void consulterListeApprenants() {
        System.out.println("Liste des apprenants : ");
        System.out.println("Nom\tPrénom\tDate de naissance\tAdresse\tNuméro de téléphone\tNuméro de classe");
        for (int i = 0; i < nbApprenants; i++) {
            System.out.println(listeApprenants[i].getNom() + "\t" + listeApprenants[i].getPrenom() + "\t" + listeApprenants[i].getDateNaissance() + "\t" + listeApprenants[i].getAdresse() + "\t" + listeApprenants[i].getNumeroTelephone() + "\t" + listeApprenants[i].getNumeroClasse());
        }
    }
    public Apprenant rechercherApprenant(String critere) {
        for (int i = 0; i < nbApprenants; i++) {
            if (listeApprenants[i].getNom().equals(critere) || listeApprenants[i].getPrenom().equals(critere)) {
                return listeApprenants[i];
            }
        }
        return null;
    }
}





