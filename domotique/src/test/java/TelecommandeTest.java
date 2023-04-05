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
    @Test
    public void testAjoutLampe1Element(){
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
    @Test
    public void activerLampeExistante0(){
        // préparation des données
        Lampe lampe = new Lampe("Lampe 1");
        Telecommande telec = new Telecommande();
        telec.ajouterLampe(lampe);
        // méthode testée
        telec.activerLampe(0);
        // vérification
        assertEquals(lampe.isActif(), true);
    }


    /*
    * activation d'une lampe existante en position 1 ;
    */
    @Test
    public void activerLampeExistante1(){
        // préparation des données
        Lampe lampe = new Lampe("Lampe 1");
        Lampe lampe2 = new Lampe("Lampe 2");
        Telecommande telec = new Telecommande();
        telec.ajouterLampe(lampe);
        telec.ajouterLampe(lampe2);
        // méthode testée
        telec.activerLampe(1);
        // vérification
        assertEquals(true, telec.getLampe(1).isAllume());
    }

    /*
    * activation d'une lampe inexistante.
    */
    @Test public void activerLampeInexistante(){
        // préparation des données
        Lampe lampe = new Lampe("Lampe 1");
        Telecommande telec = new Telecommande(2);
        // méthode testée
        telec.activerLampe(1);
        // vérification
        assertEquals(null, telec.getLampe(1));
    }
}
