public class Lancement {
    public static void main(String[] args) throws PasCoup {
        Machine j1 = new Machine(new Changement());
        Machine j3 = new Machine(new Changement());
        Humain j2 = new Humain("Rabab");
        Partie p1 = new Partie(j1,j2,10);
        p1.go();
    }
}
