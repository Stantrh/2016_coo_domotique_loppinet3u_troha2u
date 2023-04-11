import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }

    public Telecommande(int longueur) {
        this.appareils = new ArrayList<Appareil>(longueur);
    }

    public void ajouterAppareil(Appareil a){
        if(a != null)
            this.appareils.add(a);
    }

    public void activerAppareil(int x){
        if(x>=0 && x<this.appareils.size())
            this.appareils.get(x).allumer();
    }

    public void desactiverLampe(int x){
        if(x>=0 && x<this.lampes.size())
            this.lampes.get(x).eteindre();
    }

    public void activerTout(){
        for(int i=0;i<this.lampes.size();i++){
            this.lampes.get(i).allumer();
        }
    }


    public String toString(){
        String res = "";
        for(int i=0;i<this.lampes.size();i++){
            res += this.lampes.get(i).toString();
            res += "\n";
        }
        res += "\n\n\n";
        for(int i=0;i<this.hifis.size();i++){
            res += this.hifis.get(i).toString();
            res += "\n";
        }
        return res;
    }

    public Lampe getLampe(int x){
        return this.appareils.get(x);
    }

    public int nbLampes(){
        return this.appareils.size();
    }

}
