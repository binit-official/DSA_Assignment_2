package program5;
import java.util.Scanner;
public class Deposit {
    long principal;
    int time;
    double rate;
    static double tot_amt=0;
    Deposit(){
        System.out.println("Enter the principal, time and rate");
        Scanner sc=new Scanner (System.in);
        long p= sc.nextLong();
        int t= sc.nextInt();
        double r= sc.nextDouble();
        this.principal=p;
        this.rate=r;
        this.time=t;

    }
    Deposit(long pr,int tm, double rt){
        this.principal=pr;
        this.time=tm;
        this.rate=rt;

    }
    Deposit(long pr,int tm){
        System.out.println("Enter the rate ");
        Scanner sc=new Scanner (System.in);
        double r=sc.nextDouble();
        this.principal=pr;
        this.time=tm;
        this.rate=r;
    }
    Deposit(long pr,double r){
        System.out.println("Enter the time ");
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        this.principal=pr;
        this.time=t;
        this.rate=r;
    }
    void display(){
        System.out.println("The principal is:-"+principal);
        System.out.println("The Time is:-"+time);
        System.out.println("The Rate is:-"+rate);
    }
    void calc_amt(){
        tot_amt=principal+(principal*rate*time)/100;
        System.out.println("The total amount is:-"+tot_amt);
    }


}
