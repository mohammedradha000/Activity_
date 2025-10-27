package activity.two;

import java.util.Scanner;

public class ActivityTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Student name please:");
        String studentname = input.nextLine();

        System.out.println("Semester:");
        int semester_ = input.nextInt();

        ActivityTwo_class Student1 = new ActivityTwo_class(studentname, semester_);
        Student1.output();

        ActivityTwo_class Student2 = new ActivityTwo_class(studentname, semester_);
        Student2.output();
    }
}