import java.util.Objects;
import java.util.Scanner;

public class Coup {

    private String nom;

    public Coup(String nom) throws PasCoup {
        if (nom.equals("pierre") || nom.equals("papier") || nom.equals("ciseaux")) {
            this.nom = nom;
        } else {
            throw new PasCoup("Il y'a une erreur dans " + nom);
        }
    }

    public boolean bat(Coup c) {

        if (nom.equals("pierre") && c.nom.equals("ciseaux")) {
            return true;
        }
        else if (nom.equals("papier") && c.nom.equals("pierre")) {
            return true;
        }
        else if (nom.equals("ciseaux") && c.nom.equals("papier")) {
            return true;
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coup coup = (Coup) o;
        return Objects.equals(nom, coup.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }

    public static Coup saisirCoup(Scanner sc){
        Coup coup = null;
            String nom = sc.nextLine();
            if (nom.equals("papier") || nom.equals("pierre") || nom.equals("ciseaux")) {
                try {
                    coup = new Coup(nom);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        return coup;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Coup{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
