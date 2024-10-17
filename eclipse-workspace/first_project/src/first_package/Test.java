package first_package;

public class Test {
	public static void main(String []args) {
		Personne p1 = new Personne("Mohammad", 23);
		Personne p2 = new Personne("Hicham", 34);
//		System.out.println("nom de p1: " + p1.getNom());
//		System.out.println("nom de p2: " + p2.getNom());
//		System.out.println("age de p1: " + p1.getAge());
//		System.out.println("age de p2: " + p2.getAge());
//		p1.setAge(24);
//		System.out.println("nouveau age de p1: " + p1.getAge());
//		p2.setNom("Oussama");
//		System.out.println("nouveau nom de p2: " + p2.getNom());
//		
		
		Personne[] tabP = new Personne[10];
//		tabP[0] = new Personne("Mohammed", 24);
//		tabP[1] = new Personne("Hicham", 25);
//		tabP[2] = new Personne("Oussama", 33);
//		tabP[3] = new Personne("Karim", 28);
//		tabP[4] = new Personne("Fateh", 18);
//		Personne.affiche(tabP, 5);
//		tabP[3].setNom("Meriem");
//		tabP[3].setAge(21);
//		Personne.ajouter(tabP, "Mohammed", 25);
		Personne.affiche(tabP);
		
	}
}
