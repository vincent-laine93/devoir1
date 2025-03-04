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
        boolean placeLibre;

        if (enfants.size() > 2){
            placeLibre = false;
        }
        else {
            placeLibre = true;
        }

        return placeLibre;
    }

    // Cette méthode permet de savoir si le type de la chambre
    // correspond au sexe passé en paramétre
    public boolean verifierTypeChambre(String sexe)
    {
        boolean verification;
        if (sexe == typeChambre){
            verification = true;
        }
        else {
            verification = false;
        }
        return verification;
    }
}
