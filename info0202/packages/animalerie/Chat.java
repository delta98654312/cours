package animalerie;

public class Chat extends Mammifere {
	public Chat(){
		super("Tama",4);
	}
	
	public String toString(){
		return ("Chat " + getnom() + ", mammifere");
	}
	
	public void crier(){
		System.out.println("Miaou Miaou");
	}

}
