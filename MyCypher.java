public class MyCypher {
	private int cypher;
		public MyCypher(int cypher) {
			this.cypher = cypher;
}

		public int getCypher() {
			return cypher;
}
		public String doEncryption(String s) {

			String encrypted = "";
			char[] array = s.toCharArray();
			for (int i = 0; i < array.length; i++) {

			char shift = s.charAt(i);
			if (shift >= 'a' && shift <= 'z') {
				shift = (char) (shift + cypher);
			if (shift > 'z')
				shift = (char)(shift - 'z' + 'a' - 1);
}
				
encrypted+=shift;
} 
return encrypted;
}
		public String doDecryption(String s) {
			
				String decrypt = "";
				char[] array = s.toCharArray();
				for (int i = 0; i < array.length; i++) {
				char alphabet=array[i];
				if(alphabet >= 'a' && alphabet <= 'z') {

alphabet = (char) (alphabet - cypher);
  
if(alphabet < 'a' ) {

alphabet = (char) (alphabet-'a'+'z'+1);
}
}
decrypt+=alphabet;
}
return decrypt;
}
}
