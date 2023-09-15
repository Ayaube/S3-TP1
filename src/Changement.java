import java.util.ArrayList;

public class Changement implements Strategie{

    private ArrayList<Strategie> strategies;

    public Changement(ArrayList<Strategie> listeStrategies){
        strategies = listeStrategies;
    }

    public void choisirStrategie(){
    }

    @Override
    public Coup choisirCoup() {
        return null;
    }
}
