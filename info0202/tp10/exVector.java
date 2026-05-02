import java.util.Vector;

public class exVector{
    private Vector <Integer> tab = new Vector<Integer>(); 
    public exVector(){
        
    }


    public void ajouterScore(int score){
        tab.add(score);
    }

    public double moyenne(){
        double number = 0;
        for (int i=0;i<getTaille();i++){
            number += tab.get(i);
        }

        return number/getTaille();
    }

    public int getTaille(){
        return tab.size();
    }

    public double meilleurScore(){
        int number = 0;
        for (int i=0;i<getTaille();i++){
            if (number < tab.get(i)){
                number = tab.get(i);
            }
        }

        return number;
    }


    public void afficherScore(){
        for (int i=0;i<getTaille();i++){
            System.out.println(tab.get(i));
        }
    }


}