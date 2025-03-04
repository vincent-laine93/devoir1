package sio.devoir1sio1b.models;

import java.util.ArrayList;

public class Chambre
{
    private String nomChambre;
    private String typeChambre;
    private ArrayList<Enfant> enfants;

    public Chambre(String nomChambre, String typeChambre) {
        this.nomChambre = nomChambre;
        this.typeChambre = typeChambre;
        this.enfants = new ArrayList<>();
    }

    public String getNomChambre() {
        return nomChambre;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public ArrayList<Enfant> getEnfants() {
        return enfants;
    }

    public void ajouterEnfant(Enfant unEnfant)
    {
        enfants.add(unEnfant);
    }

    // Cette méthode permet de savoir s'il reste de la place dans la chambre
    public boolean verifierPlaceLibre()
    {
        // A vous de jouer
        return true;
    }

    // Cette méthode permet de savoir si le type de la chambre
    // correspond au sexe passé en paramétre
    public boolean verifierTypeChambre(String sexe)
    {
        // A vous de jouer
        return true;
    }
}
