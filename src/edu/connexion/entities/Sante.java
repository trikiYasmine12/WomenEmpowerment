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
}