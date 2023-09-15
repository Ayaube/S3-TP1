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

    }
}
