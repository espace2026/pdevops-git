

public class point {

    private double abs;
    private double ord;
    

    // Constructeur
    public point (double  x, double y) {
        abs = x;
        ord = y;
    }

    // Méthode pour déplacer
    public void deplacer(double x, double y) {
        abs += x;
        ord += y;
    }

    // Méthode pour afficher
    public void afficher() {
        System.out.println("[" + abs + ", " + ord + "]");
    }

public point(){
    abs=0;
    ord=0;
}

public String toString() {
        return "[" + abs + ", " + ord + "]";
    }
public void Echelle(double ve){
    abs*=ve;
    ord*=ve;
}

public double Distance(point P) {
        return Math.sqrt(Math.pow(P.abs - this.abs, 2) + Math.pow(P.ord - this.ord, 2));
    }

};

