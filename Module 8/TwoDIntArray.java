class TwoDIntArray {
	private static int[][] intar;
		public static void printArrayAsIs() {

		System.out.println("Array elements are");
		for (int i = 0; i < intar.length; ++i) {
		for (int j = 0; j < intar[i].length; ++j) {
		System.out.print(intar[i][j] + " ");

	}

}

		System.out.println();

		System.out.println();

}

	public static void printArrayColumnWise() {

		System.out.println("Array elements column wise");
		for (int j = 0; j < intar[0].length; j++) {
		for (int i = 0; i < intar.length; i++) {
		System.out.print(intar[i][j] + " ");

	}

}

		System.out.println();

		System.out.println();

}


public static void sumDifference() {

	int sum = 0;
	for (int j = 0; j < intar.length; j++) {
	for (int i = 0; i < intar[j].length; i++) {
	if((i%2)==0) {

		sum+=intar[j][i];

	}else if((i%2)!=0 && i!=0){

		sum-=intar[j][i];

		}

	}

}

	System.out.println("sum difference = "+ sum);

}

public static void main(String[] args) {

	int[][] a = { { 10, 13, 26, 34, 60, 90 }, { 25, 46, 57, 88, 77, 91 }, { 29, 30, 41, 52, 82, 92 }, };
	

intar = a;

printArrayAsIs();

printArrayColumnWise();

sumDifference();

}

}
