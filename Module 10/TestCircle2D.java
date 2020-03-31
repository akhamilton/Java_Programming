public class TestCircle2D {

public static void main(String arg[])

{

Circle2D c1 = new Circle2D(2, 2, 5.5);

System.out.println("Area: " + c1.getArea() + " sq units");

System.out.println("Perimeter: " + c1.getPerimeter() + " units");

System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));

System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)));

}

}
