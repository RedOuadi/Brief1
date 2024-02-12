import java.util.ArrayList;


public class Apprenant {

    private String prenom;
    private String nom;
    private String dateDeNaissance;
    private String adresse;
    private double numeroTelephone;
    private int numeroClasse;
    private int numeroIdentification;


    public Apprenant() {

    }

    public Apprenant(String prenom, String nom, String dateDeNaissance, String adresse, double numeroTelephone, int numeroClasse, int numeroIdentification) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.numeroClasse = numeroClasse;
        this.numeroIdentification = numeroIdentification;
    }
    // Getters et Setters

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaissance() {
        return dateDeNaissance;
    }

    public void setDateNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(double numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public int getNumeroClasse() {
        return numeroClasse;
    }

    public void setNumeroClasse(int numeroClasse) {
        this.numeroClasse = numeroClasse;
    }

    public int getNumeroIdentite() {
        return numeroIdentification;
    }

    public void setNumeroIdentite(int numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }
}




