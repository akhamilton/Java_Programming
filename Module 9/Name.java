 public class Name
 {
     // Private instance variables:
     
     private String first;
     private String middle;
     private String last;
 
     // Public Constructors:
      
     public Name ( String theFirst, String theMiddle, String theLast )
     {
         first = theFirst;
         middle = theMiddle;
         last = theLast;
     }
     
     // Returns first name:
     
     public String getFirst ()
     {
         return first;
     }
          
      // Returns middle name:
     
     public String getMiddle ()
     {
         return middle;
     }
      
     // Returns last name:
     
     public String getLast ()
     {
         return last;
     }
 
     // Prints the values of a name object:
      
     public void print ()
     {
       System.out.print(getFirst() + " " );
       System.out.print(getMiddle() + " " );
       System.out.println(getLast() );
     }
 }
