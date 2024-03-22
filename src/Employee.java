import java.util.ArrayList;

public class Employee implements Comparable<Employee> {
    private String name;
    private Integer age;
    private Integer salary;

    public Employee(String name,Integer age, Integer salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Integer getAge(){
        return age;
    }
    public Integer getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.age - o.getAge();
    }
}
