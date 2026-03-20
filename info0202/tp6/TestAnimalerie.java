import animalerie.*;

class TestAnimalerie{
	public static void main(String[] args){
		Chien Test2 = new Chien();
		Chat Test1 = new Chat();
		Pigeon Test3 = new Pigeon("Robert", 2, 5);
		Pigeon Test4 = new Pigeon();
		Abeille Test5 = new Abeille();

		Zoo Monzo = new Zoo();
		
		Monzo.ajouterAnimal(Test1,0);
		Monzo.ajouterAnimal(Test2,1);
		Monzo.ajouterAnimal(Test3,2);
		Monzo.ajouterAnimal(Test4,3);
		Monzo.ajouterAnimal(Test5,4);
		
		System.out.println("0");
		System.out.println(Monzo.getAnimal(0).getnom());
		
		
		System.out.println("1");
		Monzo.supprimerAnimal(0);
		System.out.println(Monzo.getAnimal(0));
		
		
		Monzo.faireCrier();
		System.out.println(Monzo.getAnimal(2));
		System.out.println(Test3.getnbpattes());
		System.out.println(Test3.getnbailles());

	}

}
