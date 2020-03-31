import java.util.Scanner;
	public class MyCypherDemo {
		public static void main(String[] args) {

			int cypher=13;
			MyCypher mc1 = new MyCypher(cypher);
			System.out.println("Enter the message: ");
			Scanner sc= new Scanner(System.in);
			String en = sc.nextLine().toLowerCase();
			String s1= mc1.doEncryption(en);
			System.out.println("Encrypted message: " + s1);
			String s2=mc1.doDecryption(s1);
			System.out.println("Decrypted message: " + s2);
		}
}

