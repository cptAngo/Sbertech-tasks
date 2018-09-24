public class Triangle {
    private double foundation;
    private double height;

    public Triangle(double foundation, double height) {
        this.foundation = foundation;
        this.height = height;
    }

    public double getArea() {
        return foundation*height*0.5;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(5.3, 1.3);
        System.out.println(t.getArea());
    }
}
