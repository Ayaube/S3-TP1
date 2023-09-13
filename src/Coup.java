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

    public static Coup saisirCoup(Scanner scanner) {
        String coupSaisi;
        try{
            System.out.print("Veuillez saisir un coup (pierre, papier, ou ciseaux) : ");
            coupSaisi = scanner.nextLine();
            return new Coup(coupSaisi);

        }
        catch (PasCoup e) {
            System.out.print("Coup invalide. Veuillez saisir un coup correct : ");
            return saisirCoup(scanner);
        }
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
