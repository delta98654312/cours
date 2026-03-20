public class TestPoint {

    public static void main(String[] args) {
        PointCartesien p1 = new PointCartesien();
        p1.afficher();

        PointCartesien p2 = new PointCartesien(3, 4);
        p2.afficher();


        PointCartesien p3 = new PointCartesien(p2);
        p3.afficher();

        System.out.println("x de p2 : " + p2.getX());
        System.out.println("y de p2 : " + p2.getY());

        p1.setX(5);
        p1.setY(6);
        p1.afficher();

        System.out.println("Distance de p2 à l'origine : " + p2.distance());

        System.out.println("Distance entre p1 et p2 : " + p1.distance(p2));

        System.out.println("p2 = " + p2.toString());
    } 
}