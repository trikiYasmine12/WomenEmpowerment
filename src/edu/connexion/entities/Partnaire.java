package edu.connexion.entities;

public class Partnaire {
    private int id;
    private String nom;
    private String Email;
    private Type type;
    private String telephone;

    public Partnaire() {

    }
    public Partnaire(int id, String nom, String email, Type type, String telephone) {
        this.id = id;
        this.nom = nom;
        Email = email;
        this.type = type;
        this.telephone = telephone;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
