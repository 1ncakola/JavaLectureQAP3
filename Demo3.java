public class Demo3 {
    public static void main(String[] args) {
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println("Point: " + p1);

        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("Before move: " + mp1);
        mp1.move();
        System.out.println("After move: " + mp1);
    }
}
