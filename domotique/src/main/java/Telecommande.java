import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;
    private ArrayList<Hifi> hifis;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
        this.hifis = new ArrayList<Hifi>();
    }

    public Telecommande(int longueurLampe, int longueurHifi) {
        this.lampes = new ArrayList<Lampe>(longueurLampe);
        this.hifis = new ArrayList<Hifi>(longueurHifi);
    }
    public void ajouterLampe(Lampe l){
        if(l != null)
            this.lampes.add(l);
    }

    public void activerLampe(int x){
        if(x>=0 && x<this.lampes.size())
            this.lampes.get(x).allumer();
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

    public void activerHifi(int x){
        if(x>=0 && x<this.hifis.size())
            this.hifis.get(x).allumer();
    }

    public void desactiverHifi(int x){
        if(x>=0 && x<this.hifis.size())
            this.hifis.get(x).eteindre();
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
        return this.lampes.get(x);
    }

    public int nbLampes(){
        return this.lampes.size();
    }

    public Hifi getHifi(int x){
        return this.hifis.get(x);
    }

    public int nbHifis(){
        return this.hifis.size();
    }
}
