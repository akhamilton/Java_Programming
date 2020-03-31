public class TestEmployee {

public static void main(String [] theArgs) {
	Name eName = new Name("John", "H.", "Doe");
    Address eAddy = new Address("123 Sunset Boulevard" ,"Beverly Hills","CA","99999");
    String eSocial = "123-45-6789";
    
    Employee johnDoe = new Employee(eName, eAddy, eSocial);
    
    System.out.println("Employee:");
    johnDoe.print();
  }
}
