package program10.student;

import java.util.Scanner;

public class Test extends student {
    public int mark1;
    public int mark2;

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = scanner.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = scanner.nextInt();
    }

    public void output() {
        super.output();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}
