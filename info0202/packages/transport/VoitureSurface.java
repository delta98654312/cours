package transport;
import personne.*;

public class VoitureSurface implements IVoiture{
    private Moteur moteur;
    private Reservoir reservoir;
    private Personne conducteur;
    private Couleur couleur;

    public VoitureSurface(Moteur m, Reservoir r, Couleur c) {
        this.reservoir = r;
        this.moteur = m;
        this.couleur = c;
    }


    public VoitureSurface(VoitureSurface v){
        this.moteur = v.getMoteur();
        this.reservoir = v.getReservoir();
        this.couleur = v.getCouleur();
    }

    public void setConducteur(Personne conducteur){
        this.conducteur = conducteur;
    }

    public Moteur getMoteur(){
        return this.moteur;
    }

    public Reservoir getReservoir(){
        return this.reservoir;
    }

    public Personne getConducteur(){
        return this.conducteur;
    }

    public void afficher(){
        System.out.println(this.moteur + " " + this.reservoir + " " + this.conducteur);
    }

    public java.lang.String toString(){
        return this.moteur + " " + this.reservoir + " " + this.conducteur;
    }

    public double avancer(double distance){
        double essence = getContenuReservoir();
        double conso = this.moteur.getConsommation();

        return distance - (essence/conso);
    }

    public double faireLePlein(){
        double nombre = this.reservoir.getCapacite() - getContenuReservoir();
        this.reservoir.remplir(nombre);
        return nombre;
    }

    public double getContenuReservoir(){
        return this.reservoir.getContenu();
    }

    public Couleur getCouleur() {
        return this.couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}
