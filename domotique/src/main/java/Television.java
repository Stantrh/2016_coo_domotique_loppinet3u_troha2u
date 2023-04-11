/**
 * La classe Television qui represente une télévision qu'on peut allumer et eteindre.
 *
 */

public class Television implements Appareil {

    /**
     * nom de la télévision
     */
    private String nom;

    /**
     * Source vidéo de la télévision lors de l'allumage
     */
    private String srcVideo;


    /**
     * construit une télévision avec un nom et une source
     *
     * @param paramNom nom de la télévision
     */
    public Television(String paramNom) {
        this.nom = paramNom;
        this.srcVideo = null;
    }

    /**
     * permet de changer l'etat interne d'une lampe en l'allumant
     */
    public void allumer() {
        this.srcVideo = "HDMI";
    }

    /**
     * permet de changer l'etat interne d'une lampe en l'eteignant
     */
    public void eteindre() {
        this.srcVideo = null;
    }

    /**
     * retourne le descriptif de la lampe sous la forme nom + "On"/"Off"
     */
    public String toString() {
        String r = "";
        if (this.srcVideo != null) {
            r = "On";
        } else {
            r = "Off";
        }
        return (nom + ": " + r);
    }
}
