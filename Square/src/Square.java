public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }

    public static void main(String[] args) {
        Square s = new Square(5.32);
        System.out.println(s.getArea());
    }
}
