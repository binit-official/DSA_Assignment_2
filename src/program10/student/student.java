package program10.student;


import java.util.Scanner;

public class student {
    protected String name;
    protected int roll;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        roll = scanner.nextInt();
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll);
    }
}
