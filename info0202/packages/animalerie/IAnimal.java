package animalerie;
 
/**
 * Interface IAnimal devant etre implementee par la classe Animal
 * @author Jessica Jonquet
 * @version 03/02/2026
 */
public interface IAnimal {
 
    /**
     * Fait crier l'animal
     */
    public void crier();
    
    public int getnbpattes();
    
    public String getnom();
 
}
