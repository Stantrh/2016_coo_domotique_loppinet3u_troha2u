import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
    }

    public Telecommande(int longueur) {
        this.lampes = new ArrayList<Lampe>(longueur);
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

    public String toString(){
        String res = "";
        for(int i=0;i<this.lampes.size();i++){
            res += this.lampes.get(i).toString();
            res += "\n\n";
        }
        return res;
    }

    public Lampe getLampe(int x){
        return this.lampes.get(x);
    }

    public int nbLampes(){
        return this.lampes.size();
    }
}
