package edu.connexion.entities;

import java.util.Date;

public class Education {
    private int id;
    private String titre;
    private String Formateur;
    private Date dateDebut;
    private Date dateFin;

    public Education() {

    }

    public Education(int id, String titre, String formateur, Date dateDebut, Date dateFin) {
        this.id = id;
        this.titre = titre;
        Formateur = formateur;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getFormateur() {
        return Formateur;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setFormateur(String formateur) {
        Formateur = formateur;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
