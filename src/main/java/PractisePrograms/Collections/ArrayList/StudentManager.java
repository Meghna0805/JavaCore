package PractisePrograms.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<String> students;
    private  Scanner scanner;

    public StudentManager() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start(){
        while(true){
            System.out.println("\n---- Student Manager Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Update Student");
            System.out.println("5. Search Student");
            System.out.println("6. Clear All Students");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1: addStudent(); break;
                case 2: viewStudent(); break;
                case 3: removeStudent(); break;
                case 4: updateStudent(); break;
                case 5: searchStudent(); break;
                case 6: clearStudent(); break;
                case 7: System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private void addStudent(){
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        students.add(name);
        System.out.println("Student added");
    }
    private void viewStudent(){
        if(students.isEmpty()){
            System.out.println("No students found");
        }else{
            System.out.println("List of students: ");
            for(String s : students){
                System.out.println(s);
            }
        }
    }
    private void removeStudent(){
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        if(students.remove(name)){
            System.out.println("Student removed");
        }else {
            System.out.println("Student not found");
        }
    }
    private void updateStudent(){
        System.out.println("Enter student name: ");
        String currname = scanner.nextLine();
        if(students.contains(currname)){
            System.out.println("Enter new name: ");
            String newName = scanner.nextLine();
            int index = students.indexOf(currname);
            students.set(index, newName);
            System.out.println("Student updated");
        }else{
            System.out.println("Student not found");
        }
    }
    private void searchStudent(){
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        if(students.contains(name)){
            System.out.println("Student found");
        }
        else{
            System.out.println("Student not found");
        }
    }
    private void clearStudent(){
        students.clear();
        System.out.println("Student cleared");
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.start();
    }
}
