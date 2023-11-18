public class Rectangle extends Shape{
    private double length;
    private double width;
    @Override
    public double gerPerimeter() {
        this.length = 4;
        this.width = 6;
        return 2*(length+width);
    }
}
