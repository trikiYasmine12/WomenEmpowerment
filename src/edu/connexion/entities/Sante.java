package edu.connexion.entities;

import java.util.Date;

public class Sante {
    private int id;
    private String titre;
    private String maladie;
    private String medecin;
    private Date Date;

    public Sante() {
    }

    public Sante(int id, String titre, String maladie, String medecin, Date date) {
        this.id = id;
        this.titre = titre;
        this.maladie = maladie;
        this.medecin = medecin;
        Date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    public String getMedecin() {
        return medecin;
    }

    public void setMedecin(String medecin) {
        this.medecin = medecin;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }
}