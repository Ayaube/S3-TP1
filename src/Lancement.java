public class Lancement {
    public static void main(String[] args) throws PasCoup {
        Machine j1 = new Machine();
        Machine j3 = new Machine();
        Humain j2 = new Humain("Rabab");
        Partie p1 = new Partie(j1,j2,3);
        p1.go();
    }
}
