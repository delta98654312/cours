

public class PersonneTest {

    public static void main(String[] arg) {
        Personne p1 = new Personne("Alice", Type.ENSEIGNANT);
        Personne p2 = new Personne("Bob", Type.VACATAIRE);

        System.out.println(p1.getNom() + " " + p1.getType());
        System.out.println(p2.getNom() + " " + p2.getType());
    }
}