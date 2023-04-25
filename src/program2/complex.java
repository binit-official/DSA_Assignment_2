package program2;

public class complex {
    int real;
    int img;

    void setcomplex(int r, int i) {
        this.real = r;
        this.img = i;
    }

    void showcomplex() {
        System.out.println(real + "+" + img + "i");
    }

    public static complex add(complex c1, complex c2) {
        complex res = new complex();
        res.real = c1.real + c2.real;
        res.img = c1.img + c2.img;
        return res;

    }


}