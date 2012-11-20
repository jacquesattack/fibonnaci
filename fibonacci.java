package fibonnaci;

public class fibonacci {
	
	public static void main(String[] args) {
		long fib = getFibonacci(10);
		System.out.println(fib);
	}

	private static long getFibonacci(int i) {
		if(i == 0 || i == 1)
		{
			return 1;
		}
		else
		{
			return getFibonacci(i-1) + getFibonacci(i-2); 
		}
	}

}
