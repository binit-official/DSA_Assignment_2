package program4;
import java.util.Scanner;
public class product {
    String pid;
    double price;
    public static double totp=0;

    public product(String pid, int price) {
        this.pid=pid;
        this.price=price;
        totp+=price;
    }


    void display(){
        System.out.println("The product ID is "+pid+" and its price is "+price);

    }


}