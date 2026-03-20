package geometrie;
/**
 * Classe <b>Point</b> qui implémente l'interface <b>IPoint</b>.
 * Cette classe permet de représenter un point cartésien.
 * Un point cartésien est défini par ses coordonnées x et y.
 * @see IPoint
 * @author Cl&eacute;ment Foyer
 * @version 07/03/2025
 */
public class Point implements IPoint{

	private double x;
	private double y;

	/**
	 * Constructeur de la classe <b>Point</b>.
	 * @param x la coordonnée x
	 * @param y la coordonnée y
	 */
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	/**
	 * Constructeur de copie de la classe <b>Point</b>.
	 * @param p le point à copier
	 */
	public Point(Point p){
		this(p.x, p.y);
	}

	/**
	 * Constructeur par défaut de la classe <b>Point</b>.
	 */
	public Point(){
		this(0, 0);
	}

	/**
	 * @see IPoint#getX()
	 */
	public double getX(){
		return x;
	}

	/**
	 * @see IPoint#getY()
	 */
	public double getY(){
		return y;
	}

	/**
	 * @see IPoint#setX()
	 */
	public void setX(double x){
		this.x = x;
	}

	/**
	 * @see IPoint#setY()
	 */
	public void setY(double y){
		this.y = y;
	}

	/**
	 * M&eacute;thode toString pour la classe <b>Point</b>.
	 * @return une chaîne de caractères représentant le point
	 */
	public String toString() {
		return "Point : x = " + x + ", y = " + y;
	}

	 /**
      * Effectue une translation sur le point suivant le vecteur (dx,dy)
      * @param dx coordonn&eacute;e x du vecteur
      * @param dy coordonn&eacute;e y du vecteur
      */
    public void translation(double dx, double dy){
    	 x += dx;
    	 y += dy;
    }

}
