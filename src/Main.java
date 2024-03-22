import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        MyLinkedList<Integer> nums = new MyLinkedList<>();

        Employee first = new Employee("Peter",21,3);
        Employee second = new Employee("Alex",32,1);
        Employee third = new Employee("Matt",27,2);

        employees.add(first);
        employees.add(second);
        employees.add(third);

        //К сожалению, сделать сортировку собственного класса
        // MyLinkedList так и не получилось, точно не знаю, из-за чего...
        //Он просто не делает её, в то время как с обычным списком дело идёт как надо.
        // Могу лишь предположить, что для собственного списка не хватает какого-то метода или чего-то
        //в этом роде, в чём не уверен.
        System.out.println("Это сортировка методами Comporator и Comparable");

        for(Employee worker: employees){
            System.out.println(worker.getName());
        }

        System.out.println("");

        Collections.sort(employees, new SalaryComporator());

        for(Employee worker: employees){
            System.out.println(worker.getName());
        }

        System.out.println();

        Collections.sort(employees);

        for(Employee worker: employees){
            System.out.println(worker.getName());
        }

        System.out.println("");
        System.out.println("Это уже использование созданного итератора для собственного подтипа списка списка...");

        nums.add(23);
        nums.add(123);
        nums.add(12);

        for(Integer n: nums){
            System.out.println(n);
        }

    }
}
