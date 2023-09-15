import java.util.ArrayList;
import java.util.Random;

public class IAmemeCoup implements Strategie {

    // Ici au debut de la partie on choisi aleatoirement ( pseudo aleatoire merci Mehdi ),
    // ce coup sera joué en boucle toute la partie, si pierre est aleatoirement choisi au debut,
    // toute la partie il va jouer pierre

    private ArrayList<String> coups = new ArrayList<String>();
    Coup coupPartie = null;
    private int check = 0;

    public IAmemeCoup() {
        coups.add("pierre");
        coups.add("feuille");
        coups.add("ciseaux");
    }



    @Override
    public Coup choisirCoup() {
        if (check == 0) {
            try {
                coupPartie = new Coup(coupRandom(coups));
                check = 1;  // mise à jour de check pour indiquer que le coup a été choisi
            } catch (PasCoup e) {
                e.printStackTrace();
            }
        }

        return coupPartie;
    }


    public static String coupRandom(ArrayList<String> liste) {
        Random rand = new Random();
        return liste.get(rand.nextInt(liste.size()));
    }

}
