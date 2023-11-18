public class Parallelogram extends Shape{
    private double base;
    private double height;
    @Override
    public double gerPerimeter() {
        this.base = 5;
        this.height =3;
        return 2*(base+height);
    }
}
