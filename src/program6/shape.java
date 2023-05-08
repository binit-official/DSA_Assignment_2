package program6;

abstract class shape {
    public abstract double area();
}
class triangle extends shape{
    double base;
    double height;
    public triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    @Override
    public double area() {

        return 0.5*base*height;
    }
}
class square extends shape{
    double side;

    public square(double side){
        this.side=side;

    }

    @Override
    public double area() {

        return side*side;
    }
}
class circle extends shape{
    double radius;
    ;
    public circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {

        return Math.PI*radius*radius;
    }
}