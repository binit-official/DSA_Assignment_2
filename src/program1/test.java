package program1;

public class test {
    public static void main(String[] args) {
        phone p1=new phone();
        phone p2=new phone();
        p1.exchange=767;
        p1.area_code=212;
        p1.number=8900;
        p2.input();
        System.out.println("My number is ("+p1.area_code+") "+p1.exchange+"-"+p1.number);
        p2.display();

    }
}
