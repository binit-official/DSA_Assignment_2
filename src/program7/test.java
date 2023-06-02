package program7;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         employee e1=new employee("Binit", 22, 890, 2000000);
        employee e2=new employee("Bt", 22, 89, 200000);
        e1.empDis();
        e2.empDis();

    }
}
