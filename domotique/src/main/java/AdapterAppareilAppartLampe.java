import appartement.AppareilAppartLampe;

public class AdapterAppareilAppartLampe implements Appareil {
    private AppareilAppartLampe appareilLampe;

    public AdapterAppareilAppartLampe(AppareilAppartLampe a){
        this.appareilLampe = a;
    }

    @Override
    public void eteindre() {
        this.appareilLampe.allumer();
    }

    @Override
    public void allumer() {
        this.appareilLampe.eteindre();
    }

    public String toString(){
        return this.appareilLampe.toString();
    }

    public AppareilAppartLampe getAppareilHifi(){
        return this.appareilLampe;
    }
}
