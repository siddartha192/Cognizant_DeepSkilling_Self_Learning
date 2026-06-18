public class EmployeeManagement {
    private Employee[] employees;
    private int cnt;

    public EmployeeManagement(int size){
        employees = new Employee[size];
        cnt = 0;
    }
    
    public void addEmployee(Employee employee){
        if(cnt < employees.length){
            employees[cnt] = employee;
            cnt++;
            System.out.println("Added Successfully");
        }
        else{
            System.out.println("Array Full");
        }
    }

    public Employee searchEmployee(int id){
        for(int i=0;i<cnt;i++){
            if(employees[i].getEmployeeId() == id){
                return employees[i];
            }
        }
        return null;
    }

    public void displayEmployee(){
        for(int i=0;i<cnt;i++){
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int id){
        int idx = -1;
        for (int i = 0; i < cnt; i++) {
            if(employees[i].getEmployeeId() == id){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("Employee Not Found");
            return;
        }

        for(int i=idx;i<cnt-1;i++){
            employees[i] = employees[i+1];
        }
        employees[cnt-1] = null;
        cnt--;
        System.out.println("Employee Deleted");
    }
}
