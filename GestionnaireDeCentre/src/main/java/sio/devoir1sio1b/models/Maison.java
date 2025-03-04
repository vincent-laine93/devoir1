package sio.devoir1sio1b.models;

import java.util.ArrayList;

public class Maison
{
    private String nomMaison;
    private ArrayList<Chambre> chambres;

    public Maison(String nomMaison) {
        this.nomMaison = nomMaison;
        this.chambres = new ArrayList<>();
    }

    public String getNomMaison() {
        return nomMaison;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void ajouterChambre(Chambre uneChambre)
    {
        chambres.add(uneChambre);
    }
}
