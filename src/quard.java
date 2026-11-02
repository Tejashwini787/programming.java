// Class representing a Point in a 2D coordinate system
class Point {

    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x; // 'this.x' refers to the instance variable, 'x' refers to the parameter
        this.y = y; // 'this.y' refers to the instance variable, 'y' refers to the parameter
    }


    public String getQuadrant() {
        if (this.x > 0 && this.y > 0) {
            return "Quadrant I";
        } else if (this.x < 0 && this.y > 0) {
            return "Quadrant II";
        } else if (this.x < 0 && this.y < 0) {
            return "Quadrant III";
        } else if (this.x > 0 && this.y < 0) {
            return "Quadrant IV";
        } else if (this.x == 0 && this.y == 0) {
            return "the Origin (0,0)";
        } else {
            return "an Axis";
        }
    }


    public void displayPoint() {
        System.out.println("Point Coordinates: (" + this.x + ", " + this.y + ")");
        System.out.println("Position: This point is in " + this.getQuadrant() + ".\n");
    }
}


public class quard {
    public static void main(String[] args) {

        Point point1 = new Point(5, 8);
        Point point2 = new Point(-3, 7);
        Point point3 = new Point(-4, -6);


        point1.displayPoint();
        point2.displayPoint();
        point3.displayPoint();
    }
}

