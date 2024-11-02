package first_package;

public class Person2 {
	public static int count = 0;
	private String name;		
	private int age;
	
	public Person2(String name, int age) {
		count++;
		this.name = name;
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
	static void print(Person2[] tabP) {
		for(int i = 0; i < count; i++) {
			System.out.println(tabP[i].getName() + ", " + tabP[i].getAge());
		}
	}
	
	static void add(Person2[] tabP, String name, int age) {
		tabP[count] = new Person2(name, age);
	}
	
	static boolean remove(Person2[] tabP, String name){
		for(int i = 0; i < count; i++){
			if(tabP[i].getName().equals(name)){
				for(int j = i; j < count - 1; j++){
					tabP[j] = tabP[j + 1];
				}	
				tabP[count - 1] = null; 	
				count--;	
				return true;
			}
		}
		return false;
	}
}
