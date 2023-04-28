package program5;

public class Test {
    public static void main(String[] args) {
        Deposit d1=new Deposit();
        d1.display();
        d1.calc_amt();

        Deposit d2=new Deposit(100000,4,5.6);
        d2.display();
        d2.calc_amt();

        Deposit d3=new Deposit(80000,2.4);
        d3.display();
        d3.calc_amt();

        Deposit d4=new Deposit(30000,6);
        d4.display();
        d4.calc_amt();




    }
}
