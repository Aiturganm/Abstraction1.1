public class Trapeziod extends Shape{
    private double a;
    private double b;
    private double c;
    private double d;
    @Override
    public double gerPerimeter() {
        this.a = 3;
        this.b = 4;
        this.c = 2;
        this.d = 2;
        return a+b+c+d;
    }
}
