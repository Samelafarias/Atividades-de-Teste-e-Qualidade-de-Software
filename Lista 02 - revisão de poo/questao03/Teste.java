public class Teste
{
    public static void main( String[] args)
    {
        Point A = new Point(0.0,0.0);
        Point B = new Point(0.0,3.0);
        Point C = new Point(3.0,3.0);
        Point D = new Point(3.0,0.0);

        Square fig = new Square(A, B, C, D);

        System.out.println("O quadrado é formado pelos pontos:" + fig);
        System.out.println("A área do quadrado é" +  fig.getArea());

    }
}