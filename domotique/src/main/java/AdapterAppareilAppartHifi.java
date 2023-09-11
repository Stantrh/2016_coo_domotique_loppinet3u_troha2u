import appartement.AppareilAppartHifi;

public class AdapterAppareilAppartHifi implements Appareil {
    private AppareilAppartHifi appareilHifi;

    public AdapterAppareilAppartHifi(AppareilAppartHifi a){
        this.appareilHifi = a;
    }

    @Override
    public void eteindre() {
        this.appareilHifi.changerSon(0);
    }

    @Override
    public void allumer() {
        this.appareilHifi.changerSon(50);
    }

    public String toString(){
        return this.appareilHifi.toString();
    }

    public AppareilAppartHifi getAppareilHifi(){
        return this.appareilHifi;
    }
}
