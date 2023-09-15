public class Machine extends Joueur{

    private int tour;
    private int mode;

    public Machine(){
        super("IA");
        tour = 1;
        this.mode = 0;
    }

    @Override
    public void choisitUnCoup() throws PasCoup {
        switch(tour){
            case 1 :
                this.coupCourant = new Coup("pierre");
                break;
            case 2 :
                this.coupCourant = new Coup("papier");
                break;
            case 3 :
                this.coupCourant = new Coup("ciseaux");
                break;

            default:
                tour = 1;
                break;
        }
        tour ++ ;
    }
}
