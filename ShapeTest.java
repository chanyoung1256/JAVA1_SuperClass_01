package SuperClass_01;

class Shape1
{
    protected int x, y;
    public void draw1()
    {
        System.out.println("Shape Draw");
    }
}

class Rectangle1 extends Shape1
{
    private int width, height;
    public void draw1()
    {
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape1
{
    private int base, height;
    public void draw1()
    {
        System.out.println("Triangle Draw");
    }
}

class Circle extends Shape1
{
    private int radius;
    public void draw1()
    {
        System.out.println("Circle Draw");
    }
}
public class ShapeTest {
    public static void main(String[] args)
    {
        Shape1 s1, s2, s3, s4;

        s1 = new Shape1();
        s2 = new Rectangle1();
        s3 = new Triangle();
        s4 = new Circle();

        s1.draw1();
        s2.draw1();
        s3.draw1();
        s4.draw1();
    }
}
