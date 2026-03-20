

public class PointCartesien implements IPoint{
    private double x;
    private double y;


    public PointCartesien() {
        this.x = 0;
        this.y = 0;
    }

    public PointCartesien(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PointCartesien(PointCartesien p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distance(){
        return (Math.sqrt(x*x + y*y));
    }

    public double distance(IPoint p) {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    

    public void afficher() {
        System.out.println(x + "" + y);
    }


    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public String toString(){
        return ("(" + x + ", " + y + ")");
    }

}
