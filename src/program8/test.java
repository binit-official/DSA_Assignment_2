package program8;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the person");
        String name=sc.nextLine();
        person p1=new person(name);
        p1.display();
        p1.count();
    }
}
