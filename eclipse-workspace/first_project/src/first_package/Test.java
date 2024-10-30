package first_package;

public class Test {
	public static void main(String []args) {
		Book b1 = new Book("My book", "Me");
		Book b2 = new Book("My Second book", "Me");
		System.out.println(b1.getTitle());
		System.out.println(b1.getId());
		System.out.println(Book.getNumberOfBooks());
		System.out.println(b2.getTitle());
		System.out.println(b2.getId());
		System.out.println(Book.getNumberOfBooks());

	}
}




