public class Main{
    public static void main(String[] args){
        Person p = new Person("hes", "ies", "8/4/1483");
        Employee e = new Employee("ksie", "nsds", "2/4/2003", 9000);
        Manager m = new Manager("opooew", "klnme", "nlsi", 8000, "isnl");
        Director d = new Director("kmme", "owns", "kjow", 10000, "ionmssa", "inslie");
        p.print();
        System.out.println("---------------------------------------------");
        e.print();
        System.out.println("---------------------------------------------");
        m.print();
        System.out.println("---------------------------------------------");
        d.print();
    }


}
