 public class Address {
 
     // Private instance variables
 
     private String street;
     private String city;
     private String state;
     private String zip;
 

     // Public Constructor:
    
     public Address (String theStreet, String theCity, String theState, String theZip)
     {
         street = theStreet;
         city = theCity;
         state = theState;
         zip = theZip;
     }
 

     // Return street:
     
     public String getStreet ()
     {
         return street;
     }
 

     // Returns city:
      
     public String getCity ()
     {
         return city;
     }
 

     // Returns state:
     
     public String getState ()
     {
         return state;
     }
 

     // Returns zip:
      
     public String getZip ()
     {
         return zip;
     }
 

     // Prints address object to screen:
     
     public void print ()
     {
         System.out.print( getStreet() + ", " );
         System.out.print( getCity() + ", " );
         System.out.print( getState() + ", " );
         System.out.println( getZip() );
     }
 
}
