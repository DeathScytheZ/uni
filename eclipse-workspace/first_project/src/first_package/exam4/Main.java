public class Main{
    public static void main(String[] args){
        Employee[] list = new Employee[3];
        list[0] = new FirstType("itms", 46, 6.3);
        list[1] = new SecondType("mkie", 46, 6.3);
        list[2] = new SalesPeople("kiem", 8000, 95000);

        for(int i = 0; i < 3; i++){
            System.out.println("Name: " + list[i].getName() + ", Salary: " + list[i]. getSalary());
        }
    }
}
