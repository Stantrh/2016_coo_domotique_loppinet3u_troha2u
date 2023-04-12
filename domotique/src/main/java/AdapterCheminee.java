public class AdapterCheminee implements Appareil{

    private Cheminee cheminee;

    public AdapterCheminee(Cheminee c) {
        this.cheminee = c;
    }


    public void eteindre(){
        this.cheminee.changerIntensite(0);
    }

    public void allumer(){
        int i = this.cheminee.getLumiere();
        this.cheminee.changerIntensite(i + 10);
    }

    public String toString(){
        return this.cheminee.toString();
    }

    public Cheminee getCheminee() {
        return this.cheminee;
    }
}