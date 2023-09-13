public abstract class Joueur {

    protected String nom ;
    protected  int score ;
    protected  Coup coupCourant;

    public Joueur(String nom) {
        this.nom = nom ;
        this.score = 0 ;
    }
    public abstract void choisitUnCoup() throws PasCoup;

    public void marquePoint(int point){
        this.score = score + point ;

    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Coup getCoupCourant() {
        return coupCourant;
    }

    public void setCoupCourant(Coup coupCourant) {
        this.coupCourant = coupCourant;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nom = " + nom + '\'' +
                ", score ="  + score +
                ", coupCourant = " + coupCourant +
                '}';
    }
}
