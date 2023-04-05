import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {
    /*
    * ajout d'une lampe à une télécommande vide ;
    */
    @Test
    public void testAjoutLampeTelecommandeVide(){
        // préparation des données

        // méthode testée

        // vérification
    }













    /*
    * ajout d'une lampe à une télécommande avec 1 élément ;
    */
    @Test
    public void testAjoutLampeTelecommande1Element(){
        // préparation des données
        Lampe l = new Lampe("lampe1");
        Telecommande t = new Telecommande();
        // méthode testée
        t.ajouterLampe(l);
        // vérification

    }














    /*
    * activation d'une lampe existante en position 0 ;
    */

    /*
    * activation d'une lampe existante en position 1 ;
    */

    /*
    * activation d'une lampe inexistante.
    */
}
