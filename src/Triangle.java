public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    @Override
    public double gerPerimeter() {
        this.a = 5;
        this.b = 7;
        this.c = 3;
        return a+b+c;
    }
}
