import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        double total = 0;
        double highest = students.get(0).marks;
        double lowest = students.get(0).marks;

        String highestStudent = students.get(0).name;
        String lowestStudent = students.get(0).name;

        for (Student student : students) {

            total += student.marks;

            if (student.marks > highest) {
                highest = student.marks;
                highestStudent = student.name;
            }

            if (student.marks < lowest) {
                lowest = student.marks;
                lowestStudent = student.name;
            }
        }

        double average = total / students.size();

        System.out.println("\n========== STUDENT GRADE REPORT ==========");

        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks);
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Average Marks : %.2f%n", average);
        System.out.println("Highest Marks : " + highest + " (" + highestStudent + ")");
        System.out.println("Lowest Marks  : " + lowest + " (" + lowestStudent + ")");

        sc.close();
    }
}