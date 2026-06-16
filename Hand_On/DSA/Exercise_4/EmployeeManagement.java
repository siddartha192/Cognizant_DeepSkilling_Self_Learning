package Exercise_4;

public class EmployeeManagement {
    private Employee[] employees;
    int cnt;
    public EmployeeManagement(int size){
        employees = new Employee[size];
        cnt = 0;
    }
    public void addElement(Employee employee){
        if(cnt<employees.length){
            employees[cnt] = employee;
            cnt++;
            System.out.println("Added Successfully");
        }
        else{
            System.out.println("Array Full");
        }
    }

    public Employee searchEmployee(int id){

    }

    public void displayEmployee(){

    }

    public void deleteEmployee(int id){

    }
}
