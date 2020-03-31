public class Employee 
{
  // Private instance variables:
  
  private Name name;
  private Address address;
  private String social;
  
  //  Public Constructors:
  
  public Employee ( Name theName, Address theAddress, String theSocial )
  {
    name = theName;
    address = theAddress;
    social = theSocial;
  }

  // Returns Name:
   
  private Name getName ()
  {
    return name;
  }

  // Returns Address:
   
  private Address getAddress ()
  {
    return address;
  }

  // Returns SSN:
  
  private String getSocial ()
  {
    return social;
  }

  // Prints values of the Employee object:
  
  public void print ()
  {
    name.print();
    address.print();
    System.out.println(social);
  }
}  
