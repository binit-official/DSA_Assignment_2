package program4;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        product p1=new product("sanitary pad",100);
        product p2=new product("Biscuit",50);
        product p3=new product("Washing powder",30);
        product p4=new product("soap",70);
        product p5=new product("perfume",300);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        System.out.println("Your total amount to be paid is:  ₹"+product.totp);


    }
}
