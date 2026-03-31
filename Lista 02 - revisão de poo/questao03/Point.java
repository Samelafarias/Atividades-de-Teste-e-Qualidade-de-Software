public class Point {
    private double X;
    private double Y;

    public Point(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double distanceTo(Point A) {
        return Math.sqrt(Math.pow(this.X - A.getX(), 2.0) + Math.pow(this.Y - A.getY(), 2.0));
    }

    public String toString() {
        return String.format("(%.2f;%.2f)", X, Y); 
    }
}