public class Main{
    public static void main(String[] args){
        Person p1 = new Person("hinm", 38);
        Person p2 = new Person("khiw", 13);
        Student s1 = new Student("ikns", 89, 2015);
        Student s2 = new Student("kmsow", 17, 2020);
        Worker w1 = new Worker("sihen", 29, 8000);
        Worker w2 = new Worker("itru", 59, 10000);
        System.out.println(p1.superior(p1, p2));
        System.out.println(w1.superior(w1, w2));
        System.out.println(s1.superior(s1, s2));
        System.out.println("\n");
        System.out.println(p1.superior(p1, w2));
        System.out.println(w1.superior(s1, w2));
        System.out.println(s1.superior(s1, p1));
    }
}
