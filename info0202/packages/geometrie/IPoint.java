package geometrie;
/**
  * Interface <b>IPoint</b> qui est &ecirc;tre impl&eacute;ment&eacute;e
  * par la classes <b>Point</b>
  * @author Jessica Jonquet
  * @version 17/03/2025
  */
public interface IPoint {

    /**
      * Retourne la coordonnée x du point
      * @return la coordonnée x du point
      */
    public double getX();

    /**
      * Retourne la coordonnée y du point
      * @return la coordonnée y du point
      */
    public double getY();

    /**
      * Modifie la coordonnée x du point
      * @param x la nouvelle coordonnée x du point
      */
    public void setX(double x);

    /**
      * Modifie la coordonnée y du point
      * @param y la coordonnée y du point
      */
    public void setY(double y);

    /**
      * Effectue une translation sur le point suivant le vecteur (dx,dy)
      * @param dx coordonn&eacute;e x du vecteur
      * @param dy coordonn&eacute;e y du vecteur
      */
    public void translation(double dx, double dy);

}
