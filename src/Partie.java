public class Partie {

    private int nbToursMax;
    private Joueur j1;
    private Joueur j2;

    public Partie(Joueur j1, Joueur j2, int nbToursMax) {
        this.nbToursMax = nbToursMax;
        this.j1 = j1;
        this.j2 = j2;
    }

    public void go() throws PasCoup {
        for(int i = 0; i<nbToursMax; i++){
            this.unTour();
        }
        if(j1.getScore() > j2.getScore()){
            System.out.println("C'est le joueur " + j1.getNom() + " qui gagne !\n" + "SCORE DE " + j1.getNom() + " : " + j1.getScore() + " point(s)" +  "\n"
            + "SCORE DE " + j2.getNom() + " : " + j2.getScore() + " point(s)" + "\n" );
        }
        else if(j2.getScore() > j1.getScore()){
            System.out.println("C'est le joueur " + j2.getNom() + " qui gagne !\n" + "SCORE DE " + j1.getNom() + " : " + j1.getScore() + " point(s)" +  "\n"
                    + "SCORE DE " + j2.getNom() + " : " + j2.getScore() + " point(s)" + "\n" );
        }
        else {
            System.out.println("les deux joueurs sont à egalite !\n" + "SCORE DE " + j1.getNom() + " : " + j1.getScore() + " point(s)" + "\n"
                    + "SCORE DE " + j2.getNom() + " : " + j2.getScore() + " point(s)" + "\n");
        }

    }

    public void resoudreTour(){
        if(j1.getCoupCourant().getNom().equals(j2.getCoupCourant().getNom())){
            j1.setScore(j1.getScore() + 1);
            j2.setScore(j2.getScore() + 1);
        }
        else if(j1.getCoupCourant().bat(j2.getCoupCourant())){
            j1.setScore(j1.getScore() + 2);
        }
        else if(j2.getCoupCourant().bat(j1.getCoupCourant())){
            j2.setScore(j2.getScore() + 2);
        }
    }

    public void unTour() throws PasCoup {
        while (nbToursMax != 0){
               j1.choisitUnCoup();
               j2.choisitUnCoup();
               System.out.println(j1.getNom() + " joue " + j1.getCoupCourant().getNom() + " et " + j2.getNom() + " joue " + j2.getCoupCourant().getNom());
               this.resoudreTour();
               nbToursMax -- ;
        }
    }
}
