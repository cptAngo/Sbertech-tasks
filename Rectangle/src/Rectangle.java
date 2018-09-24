public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        System.out.println(r.getArea());
    }
}
