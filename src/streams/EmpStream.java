package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpStream {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, 15000);
        Employee employee2 = new Employee(1, 20000);
        Employee employee3 = new Employee(1, 25000);
        Employee employee4 = new Employee(1, 30000);
        Employee employee5 = new Employee(1, 35000);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        List<Employee> collect = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println("Decrising: "+ collect);
        List<Employee> collectTop3 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();
        System.out.println("Top 3: "+ collectTop3);
        List<Employee> collectNonTop = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(3).toList();
        System.out.println("Non hightest 3: "+ collectNonTop);

        Long totalSalary = employees.stream().map(Employee::getSalary).reduce(0L, Long::sum);
        System.out.println("totalSalary: "+ totalSalary);

        int[] array = {1, 5, 3, 7};
        var sum = Arrays.stream(array).sum();
        System.out.println("Sum: "+ sum);
    }

}

class Employee{
    int id;
    long salary;

    public Employee(int id, long salary) {
        this.id = id;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}
