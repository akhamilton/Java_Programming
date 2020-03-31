public class Circle implements FigureGeometry
{
private float radius;//stores the radius of a Circle object
public Circle(float theRadius)
{
radius = theRadius;
}
public float getRadius(){
return radius;
  
}
public float getArea(){
return getRadius() * getRadius() * PI;
}
public float getPerimeter(){
   return getRadius() * 2 * PI;
  
}
public void setRadius(float theRadius){
   radius = theRadius;
}
}
