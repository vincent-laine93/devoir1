package sio.devoir1sio1b;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import sio.devoir1sio1b.models.Chambre;
import sio.devoir1sio1b.models.Enfant;
import sio.devoir1sio1b.models.Maison;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DevoirController implements Initializable
{
    ArrayList<Maison> maisons;
    ArrayList<Enfant> enfants;

    @FXML
    private Button btnAjouter;
    @FXML
    private TableColumn tcNomMaison;
    @FXML
    private TableView tvMaisons;
    @FXML
    private TableColumn tcNomEnfantChambre;
    @FXML
    private TableColumn tcNomChambre;
    @FXML
    private TableView tvEnfantsAll;
    @FXML
    private TableView tvEnfantsChambre;
    @FXML
    private TableView tvChambres;
    @FXML
    private TableColumn tcNomEnfantsAll;
    @FXML
    private TableColumn tcPrenomEnfantChambre;
    @FXML
    private TableColumn tcPrenomEnfantsAll;
    @FXML
    private TextField txtTauxCentreAere;
    @FXML
    private TextField txtTauxMaison;
    @FXML
    private TableColumn tcSexeEnfantsAll;
    @FXML
    private TableColumn tcTypeChambre;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        maisons = new ArrayList<>();
        enfants = new ArrayList<>();
        initDatas();

        // A vous de jouer

    }

    // Cette méthode permet de remplir les 2 collections
    // La liste de tous les enfants
    // La liste de toutes les maisons
    // Ne pas toucher ce code
    public void initDatas()
    {
        Maison maison1 = new Maison("Maison rouge");
        Maison maison2 = new Maison("Maison verte");

        Chambre chambre1 = new Chambre("Chambre 1","Fille");
        Chambre chambre2 = new Chambre("Chambre 2","Fille");
        Chambre chambre3 = new Chambre("Chambre 3","Garçon");
        Chambre chambre4 = new Chambre("Chambre 4","Garçon");
        Chambre chambre5 = new Chambre("Chambre 5","Fille");

        Enfant enfant1 = new Enfant("Garnier","François","Garçon");
        Enfant enfant2 = new Enfant("Fortin","François","Garçon");
        Enfant enfant3 = new Enfant("Alison","Virginie","Fille");
        Enfant enfant4 = new Enfant("Gand","Christophe","Garçon");
        Enfant enfant5 = new Enfant("Cousinot","Sébastien","Garçon");
        Enfant enfant6 = new Enfant("Derquenne","Sabrina","Fille");
        Enfant enfant7 = new Enfant("Annonier","Eric","Garçon");
        Enfant enfant8 = new Enfant("Duterte","Emma","Fille");
        Enfant enfant9 = new Enfant("Bailly","Lindsay","Fille");
        Enfant enfant10 = new Enfant("Abdous","Illan","Garçon");

        maison1.ajouterChambre(chambre1);maison1.ajouterChambre(chambre2);maison1.ajouterChambre(chambre3);
        maison2.ajouterChambre(chambre4);maison2.ajouterChambre(chambre5);

        maisons.add(maison1);maisons.add(maison2);

        enfants.add(enfant1);enfants.add(enfant2);enfants.add(enfant3);
        enfants.add(enfant4);enfants.add(enfant5);enfants.add(enfant6);
        enfants.add(enfant7);enfants.add(enfant8);enfants.add(enfant9);
        enfants.add(enfant10);
    }

    @FXML
    public void tvChambresClicked(Event event)
    {
        // A vous de jouer

    }

    @FXML
    public void tvMaisonsClicked(Event event)
    {
        // A vous de jouer

    }

    @FXML
    public void btnAjouterAction(ActionEvent actionEvent)
    {
        // A vous de jouer

    }

    // Cette méthode permet de calculer le taux de remplissage
    // du centre aéré
    public double calculerTauxRemplissageCentreAere()
    {
        // A vous de jouer
        return 0;
    }

    // Cette méthode permet de calculer le taux de remplissage
    // de la maison passée en paramétre
    public double calculerTauxRemplissageMaison(Maison maison)
    {
        // A vous de jouer
        return 0;
    }
}