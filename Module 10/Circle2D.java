public class Circle2D {

private double x;

private double y;

private double radius;

public Circle2D()

{

this.x = 0;

this.y = 0;

this.radius = 1.0;

}

public Circle2D(double x, double y, double radius) {

this.x = x;

this.y = y;

this.radius = radius;

}

public double getX()

{

return this.x;

}

public double getY()

{

return this.y;

}

public double getRadius()

{

return this.radius;

}

public double getPerimeter()

{

return 2*Math.PI*this.radius;

}

public double getArea()

{

return Math.PI*(this.radius*this.radius);

}

public boolean contains(double x, double y)

{

double d = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));

if(d < this.radius)

return true;

else

return false;

}

public boolean contains(Circle2D circle)

{

double d = Math.sqrt(Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2));

if(d + circle.radius < this.radius)

return true;

else

return false;

}

public boolean overlaps(Circle2D circle)

{

double d = Math.sqrt(Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2));

if(d <= circle.radius + this.radius)

return true;

else

return false;

}

}
