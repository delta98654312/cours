public class PenduException extends Exception {
    public PenduException(String ErrorMessage){
        super(ErrorMessage);
    }


    public PenduException(String ErrorMessage, String mdp){
        System.out.println(mdp);
        super(ErrorMessage);
    }
}