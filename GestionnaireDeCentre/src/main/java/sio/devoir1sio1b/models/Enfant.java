package sio.devoir1sio1b.models;

public class Enfant
{
    private String nomEnfant;
    private String prenomEnfant;
    private String sexeEnfant;

    public Enfant(String nomEnfant, String prenomEnfant, String sexeEnfant) {
        this.nomEnfant = nomEnfant;
        this.prenomEnfant = prenomEnfant;
        this.sexeEnfant = sexeEnfant;
    }

    public String getNomEnfant() {
        return nomEnfant;
    }

    public String getPrenomEnfant() {
        return prenomEnfant;
    }

    public String getSexeEnfant() {
        return sexeEnfant;
    }
}
