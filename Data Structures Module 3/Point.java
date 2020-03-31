public class Point {

private int width; //stores the width of a Point object
private int height; //stores the height of a Point object

Point(int theWidth, int theHeight)
{
   width = theWidth;
   height = theHeight;
}

public int getWidth(){
   //returns the width of a Point object
   return width;
  
}
public int getHeight(){
   //returns the height of a Point object
   return height;
  
}
public void setWidth(int theWidth){
   //assigns the width of a Point
   width = theWidth;
  
}
public void setHeight(int theHeight) {
    //assigns the height of a Point object as follows:
   height = theHeight;
   
   }
}  
