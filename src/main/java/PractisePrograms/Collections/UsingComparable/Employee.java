package PractisePrograms.Collections.UsingComparable;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;
    private int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.salary, this.salary);
    }

    @Override
    public String toString() {
        return name + "("+ age+")"  + " - "+salary;
    }
}
