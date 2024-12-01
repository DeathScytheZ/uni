package first_package;

public class Test {
	public static void main(String []args) {
		Date date = new Date(24, 12, 2018);
		Employee e = new Employee("uhe", "ohe", date, 4900);
		Manager m = new Manager("oie", "ihs", date, 8000, "iune");
		Director d = new Director("imad", "ismail", date, 1450.2, "HR", "heise");
		
		e.print();
		System.out.println("----------------------------");
		m.print();
		System.out.println("----------------------------");
		d.print();
	}
}




