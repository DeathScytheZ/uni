package second_package;

public class Test {
    public static void main(String [] args){
        Student s = new Student("yasin", 25, 3);
        Student t = new Student("mohamed", 24, 2);
        Worker w = new Worker("ayman", 45, 50000);
        Worker v = new Worker("ahmad", 36, 90000);
        s.superior(t);
        System.out.println("------------------");
        w.superior(v);
        System.out.println("------------------");
        w.superior(t);
    }
}

