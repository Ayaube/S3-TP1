public class Machine extends Joueur {
    private Strategie strategie;

    public Machine(Strategie strategie) {
        super("IA");
        this.strategie = strategie;
    }

    @Override
    public void choisitUnCoup() throws PasCoup {
        this.coupCourant = strategie.choisirCoup();
    }
}
