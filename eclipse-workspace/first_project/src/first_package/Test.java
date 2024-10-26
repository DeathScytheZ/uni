package first_package;

public class Test {
	public static void main(String []args) {
//      Person p1 = new Person("Mohammad", 23);
// 		Person p2 = new Person("Hicham", 34);
//		System.out.println("name of p1: " + p1.getName());
//		System.out.println("name of p2: " + p2.getName());
//		System.out.println("age of p1: " + p1.getAge());
//		System.out.println("age of p2: " + p2.getAge());
//		p1.setAge(24);
//		System.out.println("new age de p1: " + p1.getAge());
//		p2.setNom("Oussama");
//		System.out.println("new nom de p2: " + p2.getName());
		Person[] tabP = new Person[100];
//		tabP[0] = new Person("Mohammed", 24);
//		tabP[1] = new Person("Hicham", 25);
//		tabP[2] = new Person("Oussama", 33);
//		tabP[3] = new Person("Karim", 28);
//		tabP[4] = new Person("Fateh", 18);
//		Person.print(tabP, 5);
//		tabP[3].setName("Meriem");
//		tabP[3].setAge(21);
//		Person.add(tabP, "Mohammed", 25);
		Person.add(tabP, "ahmed", 5);
		Person.add(tabP, "karim", 33);
		Person.add(tabP, "amin", 27);
		Person.add(tabP, "mouhamed", 15);
		Person.add(tabP, "abduallah", 54);
		Person.print(tabP);
		System.out.println("------------------------------------");
		Person.remove(tabP, "karim");
		Person.print(tabP);
		System.out.println(tabP[2].count);
	}
}
