package PractisePrograms.Collections.UsingComparable;

public class Student implements Comparable<Student> {
    String name;
    double cgpa;

    Student(String name,double cgpa) {
        this.name = name;
        this.cgpa = cgpa;

    }
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.cgpa, this.cgpa);
    }

    @Override
    public String toString() {
        return name+ " - "+cgpa;
    }
}
