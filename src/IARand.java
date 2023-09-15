import java.util.ArrayList;
import java.util.Random;

public class IARand implements Strategie{

    // L'algo récupère au Hasard un coup parmi les trois qui sont stockés dans une liste,
    // à chaque tour on relance le dé des 3 coups


    private ArrayList<String> coups = new ArrayList<String>();

    public IARand(){
        coups.add("pierre");
        coups.add("feuille");
        coups.add("ciseaux");
    }


    @Override
    public Coup choisirCoup() {
        Coup coup = null;
        try {
            coup = new Coup(coupRandom(coups));
        } catch (PasCoup e) {
            e.printStackTrace();
        }
        return coup;
    }

    public static String coupRandom(ArrayList<String> liste) {
        Random rand = new Random();
        return liste.get(rand.nextInt(liste.size()));
    }
}
