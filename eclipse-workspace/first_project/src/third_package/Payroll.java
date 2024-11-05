package third_package;

public class Payroll {
    public static void main(String [] args){
        Employee [] employeeList = new Employee[10];
        employeeList[0] = new FirstTypeEmployee("uje", "hils", 54, 5);
        employeeList[1] = new SecondTypeEmployee("kiw", "eows", 39, 10);
        employeeList[2] = new Salespeople("nss", "lwis", 2000, 4000);

        for(int i = 0; i < 3; i++){
            System.out.println(employeeList[i].getName() + " " + employeeList[i].getSurname() + " " + employeeList[i].getSalary());
        }
    }
}
