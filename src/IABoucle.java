public class IABoucle implements Strategie {

    private int tour;

    public IABoucle() {
        this.tour = 1;
    }

    @Override
    public Coup choisirCoup() {
        Coup coup = null;

        switch(tour) {
            case 1:
                try {
                    coup = new Coup("pierre");
                } catch (PasCoup e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    coup = new Coup("papier");
                } catch (PasCoup e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    coup = new Coup("ciseaux");
                } catch (PasCoup e) {
                    e.printStackTrace();
                }
                break;
            default:
                tour = 0;
                break;
        }

        tour++;
        return coup;
    }
}
