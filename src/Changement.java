import java.util.ArrayList;

public class Changement implements Strategie{

    private ArrayList<Strategie> strategies;
    private int tour = 1;
    private Strategie strategieCourante;

    public Changement(){
        strategies = new ArrayList<>();
        strategies.add(new IABoucle());
        strategies.add(new IAmemeCoup());
        strategies.add(new IARand());
        choisirStrategie();
    }

    public void choisirStrategie(){
        switch (tour) {
            case 1:
                System.out.println("Vous avez choisi une stratégie 1");
                strategieCourante = strategies.get(0);
                break;

            case 2:
                System.out.println("Vous avez choisi une stratégie 2");
                strategieCourante = strategies.get(1);
                break;

            case 3:
                System.out.println("Vous avez choisi une stratégie 3");
                strategieCourante = strategies.get(2);
                break;

            default:
                tour = 1;  // Réinitialisez le tour après le tour 3
                choisirStrategie(); // Choisissez une stratégie pour le prochain tour (tour 1)
                return;
        }
        tour++;
    }

    @Override
    public Coup choisirCoup() {
        return strategieCourante.choisirCoup();
    }
}
