import java.util.Scanner;

public class Humain extends Joueur{

    public Humain(String nom) {
        super(nom);
    }

    @Override
    public void choisitUnCoup() {
        Scanner choix_du_coup = new Scanner(System.in);
        this.coupCourant = Coup.saisirCoup(choix_du_coup);
    }
}
