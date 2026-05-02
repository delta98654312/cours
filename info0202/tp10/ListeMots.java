import java.util.Vector;

public class ListeMots {
    private String filename;
    private Vector <String> tab = new Vector <String>();

    public ListeMots(String f){
        this.filename = f;
    }

    public String motAleatoire(){
        int index = (int)(Math.random()*tab.size());
        return tab.get(index);
    }

    public void ajouterMot(String m){
        tab.add(m);
    }

    public String getMot(int i) {
        return tab.get(i);
    }

    public int getTaille() {
        return tab.size();
    }

}