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
        telec.ajouterAppareil(lampe);
        // vérification
        assertEquals(lampe, telec.getAppareil(0));
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
        telec.ajouterAppareil(lampe);
        // méthode testée
        telec.ajouterAppareil(lampe2);
        // vérification
        assertEquals(lampe2, telec.getAppareil(1));
    }

    /*
     * activation d'une lampe existante en position 0 ;
     */
    @Test
    public void activerLampeExistante0(){
        // préparation des données
        Lampe lampe = new Lampe("Lampe 1");
        Telecommande telec = new Telecommande();
        telec.ajouterAppareil(lampe);
        // méthode testée
        telec.activerAppareil(0);
        // vérification
        assertEquals(true, ((Lampe)telec.getAppareil(0)).isAllume());
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
        telec.ajouterAppareil(lampe);
        telec.ajouterAppareil(lampe2);
        // méthode testée
        telec.activerAppareil(1);
        // vérification
        assertEquals(true, ((Lampe)telec.getAppareil(1)).isAllume());
    }

    /*
     * activation d'une lampe inexistante.
     */
    @Test public void activerLampeInexistante(){
        // préparation des données
        Lampe lampe = new Lampe("Lampe 1");
        Telecommande telec = new Telecommande(2);
        // méthode testée
        telec.activerAppareil(1);
        // vérification
        assertEquals(0, telec.getNombre());
    }

    /**
     * activation d'une cheminee existante
     */
    @Test
    public void activerChemineeExistante0(){
        // préparation des données
        Cheminee cheminee = new Cheminee();
        AdapterCheminee adapterCheminee = new AdapterCheminee(cheminee);
        Telecommande telec = new Telecommande();
        telec.ajouterAppareil(adapterCheminee);
        // méthode testée
        telec.activerAppareil(0);
        // vérification
        assertEquals(10, ((AdapterCheminee)telec.getAppareil(0)).getCheminee().getLumiere());
    }
}
