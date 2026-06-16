package Exercise_4;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement manager[] = new EmployeeManagement[10];
        manager.addEmployee(new Employee(101,"Siddhu","Developer",10000));
        manager.addEmployee(new Employee(102,"Shiva","Manager",12000));
        manager.addEmployee(new Employee(103,"Santhosh","Tester",9000));
        manager.displayEmployee();
        
    }
}
