package bt5;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("Length: " + l1.getLength());
        System.out.println("Gradient (radians): " + l1.getGradient());

        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println("Length: " + l2.getLength());
        System.out.println("Gradient (radians): " + l2.getGradient());


        l2.setEndXY(10, 10);
        System.out.println("After changing end point: " + l2);
        System.out.println("New Length: " + l2.getLength());
    }
}
