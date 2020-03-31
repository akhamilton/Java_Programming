public class TestAll
{
   public static void main (String[] args)
   {

   Circle c1 = new Circle(5);
  
   Point p1 = new Point(5,5);
   Point p2 = new Point(5,7);
  
   Square s1 = new Square(p1);
  
   Rectangle r1 = new Rectangle(p2);
  
   System.out.println("The radius of c1 : "+c1.getRadius());
  
   System.out.println("The area of c1 : "+c1.getArea());
  
   System.out.println("The perimeter of c1 : "+c1.getPerimeter());
  
   System.out.println("The side length of s1 : "+s1.getSideLength());
  
   System.out.println("The area of s1 : "+s1.getArea());
  
   System.out.println("The perimeter of s1 : "+s1.getPerimeter());
  
   System.out.println("The width of r1 : "+r1.getWidth());
  
   System.out.println("The height of r1 : "+r1.getHeight());
  
   System.out.println("The area of r1 : "+r1.getArea());
  
   System.out.println("The perimeter of r1 : "+r1.getPerimeter());
   }
}
