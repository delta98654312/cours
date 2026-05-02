public class Personne {

    private String nom;
    private Type type;

    public Personne(String nom, Type type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public Type getType() {
        return type;
    }
}