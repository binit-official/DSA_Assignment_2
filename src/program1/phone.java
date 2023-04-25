package program1;

import java.util.Scanner;

public class phone {
    int area_code;
    int exchange;
    int number;

    public void input(){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter area code: ");
        this.area_code = sc.nextInt();
        System.out.print("Enter exchange code: ");
        this.exchange = sc.nextInt();
        System.out.print("Enter number: ");
        this.number = sc.nextInt();
    }
    public void display(){
        System.out.println("your number is ("+area_code+") "+exchange+"-"+number);

    }
}
