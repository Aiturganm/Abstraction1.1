public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Triangle(), new Rectangle(), new Square(), new Trapeziod(), new Parallelogram()};
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("shapes[i].gerPerimeter() = " + shapes[i].gerPerimeter());
        }
    }
}