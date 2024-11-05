package second_package;

public class Test {
    public static void main(String [] args){
        Student s = new Student("yasin", 14, 3);
        Worker w = new Worker("ayman", 45, 50000);
        System.out.println(s.superior(w));
    }
}
