package bt5;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("Length: " + l1.getLength());
        System.out.println("Gradient (radians): " + l1.getGradient());

        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
        System.out.println("Length: " + l2.getLength());
        System.out.println("Gradient (radians): " + l2.getGradient());


        l2.setEndXY(10, 10);
        System.out.println("After modifying end point: " + l2);
        System.out.println("New length: " + l2.getLength());
    }
}
