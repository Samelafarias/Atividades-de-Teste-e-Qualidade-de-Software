public abstract class Quadrilateral
{
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Quadrilateral( Point A, Point B, Point C, Point D )
    {
        if( A == B || A == C || A == D || B == C || B == D || C == D )
            throw new IllegalArgumentException("Quadrilatero possui vertices conicidentes");
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public Point getA()
    {
        return A;
    }
    public Point getB()
    {
        return B;
    }
    public Point getC()
    {
        return C;
    }
    public Point getD()
    {
        return D;
    }            

    public String toString() {

        return String.format("A%s - B%s - C%s - D%s", A, B, C, D);
    }

    public abstract double getArea();
}