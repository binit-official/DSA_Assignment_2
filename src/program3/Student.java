package program3;

import java.util.Scanner;

public class Student {
    int Roll;
    String name;
    double DSA_Mark;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student");
        name=sc.nextLine();
        System.out.println("Enter the roll of the student ");
        Roll= sc.nextInt();
        System.out.println("Enter the DSA mark of the student");
        DSA_Mark= sc.nextDouble();
    }
    void showdata(){
        System.out.println("Name of the student is "+name);
        System.out.println("Roll of the student is "+Roll);
        System.out.println("DSA Mark of the student is "+DSA_Mark);

    }
}
