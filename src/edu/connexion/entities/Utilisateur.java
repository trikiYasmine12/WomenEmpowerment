package edu.connexion.entities;

public class Utilisatuer {
    private int id;
    private String mail;
    private String MotDePasse;
    private String Nom;
    private String Prenom;
    private Date DateNaissance ;

    public Utilisatuer(int id, String mail, String motDePasse, String nom, String prenom, Date dateNaissance) {
        this.id = id;
        this.mail = mail;
        MotDePasse = motDePasse;
        Nom = nom;
        Prenom = prenom;
        DateNaissance = dateNaissance;
    }

    public Utilisatuer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        MotDePasse = motDePasse;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        DateNaissance = dateNaissance;
    }


