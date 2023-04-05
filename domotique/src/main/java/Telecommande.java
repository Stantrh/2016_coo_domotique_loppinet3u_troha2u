import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
    }
    public void ajouterLampe(Lampe l){
        throw new Error("Méthode non écrite");
    }

    public void activerLampe(int x){
        throw new Error("Méthode non écrite");
    }

    public void desactiverLampe(int x){
        throw new Error("Méthode non écrite");
    }

    public void activerTout(){
        throw new Error("Méthode non écrite");
    }

    public String toString(){
        throw new Error("Méthode non écrite");
    }

    public Lampe getLampe(int x){
        return this.lampes.get(x);
    }
}
