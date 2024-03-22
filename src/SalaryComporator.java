import java.util.Comparator;

public class SalaryComporator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return e1.getSalary().compareTo(e2.getSalary());
    }

}
