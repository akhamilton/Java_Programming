import java.math.BigInteger;

public class LargePower {

	public static void main(String[] args) {
		System.out.println("50 raised to the power of 70 is \n" + largePower(50, 70));
	}

	public static BigInteger largePower(long m, long n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(m + "")); 
		return result;

	}

}
