package first_package;

public class Personne {
	static int nbrP = 0;
	private String nom;		
	private int age;
	
	public Personne(String nom, int age) {
		nbrP++;
		this.nom = nom;
		this.age = age;
	}
	
	void setNom(String nom) {
		this.nom = nom;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getNom() {
		return this.nom;
	}
	
	int getAge() {
		return this.age;
	}
	
	static void affiche(Personne[] tabP) {
		for(int i = 0; i < nbrP; i++) {
			System.out.println(tabP[i].getNom() + ", " + tabP[i].getAge());
		}
	}
	
	static void ajouter(Personne[] tabP, String nom, int age) {
		tabP[nbrP] = new Personne(nom, age);
	}
	
}
