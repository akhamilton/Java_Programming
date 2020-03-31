
public class TestPassArray {
	public static void main(String[] args) {
		String[] a = {"Amanda", "Hamilton"};
		   
		       System.out.println("Before invoking swap");
		       System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		       
		       swap(a[0], a[1]);
		       
		       System.out.println("After invoking swap");
		       System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		   
		       System.out.println("Before invoking swapFirstTwoInArray");
		       System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		       swapFirstTwoInArray(a);
		       System.out.println("After invoking swapFirstTwoInArray");
		       System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		     }
		   
		     public static void swap(String n1, String n2) {
		    	 String temp = n1;
		       n1 = n2;
		       n2 = temp;
		     }
		   
		     public static void swapFirstTwoInArray(String[] array) {
		    	 String temp = array[0];
		       array[0] = array[1];
		       array[1] = temp;
		     }
}
