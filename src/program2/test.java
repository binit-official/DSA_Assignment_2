package program2;

public class test {

        public static void main(String[] args) {
            complex c1 = new complex();
            complex c2 = new complex();
            complex c3= new complex();
            c1.setcomplex(4, 9);
            c2.setcomplex(3, 9);
            c3=c3.add(c1,c2);
            c3.showcomplex();


        }


}
