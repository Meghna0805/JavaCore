package PractisePrograms.Collections.UsingComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mghna", 900000, 22));
        employees.add(new Employee("Himashu", 50000, 87));
        employees.add(new Employee("Jacob", 60000, 34));
        employees.add(new Employee("Monica", 200000, 27));
        employees.add(new Employee("Cam", 70000, 92));

        Collections.sort(employees);
        System.out.println("Sorted list of employees(by salary-natural ordering)");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
