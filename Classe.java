package ecole;

public class Classe {
    private int numeroClasse;
    private String nom;
    private int effectif;
    private static Classe[] classes = new Classe[100]; // Tableau de classes avec une capacité maximale de 100

    private static int nombreClasses = 0; // Nombre actuel de classes
    public Classe(int numeroClasse, String nom, int effectif) {
        this.numeroClasse = numeroClasse;
        this.nom = nom;
        this.effectif = effectif;
    }
    public int getNumeroClasse() {
        return numeroClasse;
    }
    public void setNumeroClasse(int numeroClasse) {
        this.numeroClasse = numeroClasse;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getEffectif() {
        return effectif;
    }
    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }
    private static Classe[] classes = new Classe[100]; // Tableau de classes avec une capacité maximale de 100

    private static int nombreClasses = 0; // Nombre actuel de classes

    public void ajouterClasse(int numeroClasse, String nom, int effectif) {
        if (nombreClasses < classes.length) {
            classes[nombreClasses++] = new Classe(numeroClasse, nom, effectif);
            System.out.println("Classe ajoutée avec succès.");
        } else {
            System.out.println("Impossible d'ajouter plus de classes. Limite atteinte.");
        }
    }

    public void modifierClasse(int numeroClasse, String nouveauNom, int nouvelEffectif) {
        for (int i = 0; i < nombreClasses; i++) {
            if (classes[i].getNumeroClasse() == numeroClasse) {
                classes[i].setNom(nouveauNom);
                classes[i].setEffectif(nouvelEffectif);
                System.out.println("Classe modifiée avec succès.");
                return;
            }
        }
        System.out.println("La classe avec le numéro " + numeroClasse + " n'existe pas.");
    }

    public void supprimerClasse(int numeroClasse) {
        for (int i = 0; i < nombreClasses; i++) {
            if (classes[i].getNumeroClasse() == numeroClasse) {
                for (int j = i; j < nombreClasses - 1; j++) {
                    classes[j] = classes[j + 1];
                }
                nombreClasses--;
                System.out.println("Classe supprimée avec succès.");
                return;
            }
        }
        System.out.println("La classe avec le numéro " + numeroClasse + " n'existe pas.");
    }

    public void afficherListeClasses() {
        System.out.println("Liste des classes : ");
        System.out.println("Numero\tNom\tEffectif");
        for (int i = 0; i < nombreClasses; i++) {
            System.out.println(classes[i].getNumeroClasse() + "\t" + classes[i].getNom() + "\t" + classes[i].getEffectif());
        }
    }

    public void filtrerApprenantsParClasse(int numeroClasse) {
        System.out.println("Apprenants dans la classe " + numeroClasse + " : ");
        for (Apprenant apprenant : Apprenant.listeApprenants) {
            if (apprenant != null && apprenant.getNumeroClasse() == numeroClasse) {
                System.out.println(apprenant.getNom() + "\t" + apprenant.getPrenom());
            }
        }
    }
}
