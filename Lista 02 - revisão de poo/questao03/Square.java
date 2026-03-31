public class Square extends Quadrilateral
{
    public Square( Point A, Point B, Point  C, Point D )
    {
        /*Terinamento de exssesão */
        super(A, B, C, D);
    }

@Override
public double getArea()
{
    double lado = getA().distanceTo(getB()); 

    return Math.pow(lado, 2.0);
}
}