import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {
    /*
    * ajout d'une lampe à une télécommande vide ;
    */
    @Test
    public void testAjoutLampeTelecommandeVide(){
        // préparation des données
        Lampe lampe = new Lampe("Lampe 1");
        Telecommande telec = new Telecommande();
        // méthode testée
        telec.ajouterLampe(lampe);
        // vérification
        assertEquals(lampe, telec.getLampe(0));
    }

    /*
    * ajout d'une lampe à une télécommande avec 1 élément ;
    */
    @Test public void testAjoutLampe1Element(){
        // préparation des données
        Lampe lampe = new Lampe("Lampe 1");
        Lampe lampe2 = new Lampe("Lampe 2");
        Telecommande telec = new Telecommande();
        telec.add(lampe);
        // méthode testée
        telec.ajouterLampe(lampe2);
        // vérification
        assertEquals(lampe2, telec.getLampe(1));
    }

    /*
    * activation d'une lampe existante en position 0 ;
    */
    @Test public void activerLampeExistante(){
        // préparation des données
        Lampe lampe = new Lampe("Lampe 1");
        Lampe lampe2 = new Lampe("Lampe 2");
        Telecommande telec = new Telecommande();
        // méthode testée

        // vérification

    }

    /*
    * activation d'une lampe existante en position 1 ;
    */

    /*
    * activation d'une lampe inexistante.
    */
}
