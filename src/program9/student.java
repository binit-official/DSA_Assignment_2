package program9;

import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    String course;

    void input_Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter course: ");
        course = scanner.nextLine();
    }

    void display_Student() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Exam extends Student {
    int mark1;
    int mark2;
    int mark3;

    void input_Marks() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        mark1 = scanner.nextInt();

        System.out.print("Enter mark 2: ");
        mark2 = scanner.nextInt();

        System.out.print("Enter mark 3: ");
        mark3 = scanner.nextInt();
    }

    void display_Result() {
        System.out.println("Marks: ");
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
    }
}





