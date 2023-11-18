public class Square extends Shape{
    private double a;
    @Override
    public double gerPerimeter() {
        this.a = 6;
        return 4*a;
    }
}
