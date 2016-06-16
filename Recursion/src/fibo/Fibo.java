package fibo;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibo {
	
	static Map<Integer, BigInteger> fibos = new HashMap<Integer, BigInteger>();
	
	public static void main(String[] args) {
		
		System.out.println("The 8th Fibonacci number: " + fibonacci(8));
		System.out.println("**************************");
		int n = 50;
		long aT = System.currentTimeMillis();
		System.out.println("The " +n+ "th Fibonacci number: " +fibonacci(n));
		long oT = System.currentTimeMillis();
		System.out.println((oT-aT)/1000 + " seconds for " + n + " iterations.");
		System.out.println("**************************");
		fibos.put(1, BigInteger.ONE);
		fibos.put(2, BigInteger.ONE);
		aT = System.currentTimeMillis();
		System.out.println("The " +n+ "th Fibonacci number: " +smartFibonacci(n));
		oT = System.currentTimeMillis();
		System.out.println((oT-aT)/1000 + " seconds for " + n + " iterations.");
		// cf. https://oeis.org/A000045/b000045.txt
	}
	
	/**
	 * exponential runtime
	 * O(2^n)
	 * @param x
	 * @return
	 */
	public static BigInteger fibonacci(int x) {
		if (x == 1) {
			return BigInteger.ONE;
		} else if (x == 2) {
			return BigInteger.ONE;
		} else {
			return fibonacci(x-1).add(fibonacci(x-2));
		}
	}
	
	public static BigInteger smartFibonacci(int x){
		if (x == 1) {
			return BigInteger.ONE;
		} else if (x == 2) {
			return BigInteger.ONE;
		} else {
			BigInteger f1;
			if (fibos.containsKey(x-1)) {
				f1 = fibos.get(x-1);
			} else {
				f1 = smartFibonacci(x-1);
				fibos.put(x-1, f1);
				System.out.println(x-1 + "th fibonacci number " + f1 + " added");
			}
			BigInteger f2;
			if (fibos.containsKey(x-2)) {
				f2 = fibos.get(x-2);
			} else {
				f2 = smartFibonacci(x-2);
				fibos.put(x-2, f2);
				System.out.println(x-2 + "th fibonacci number " + f2 + " added");
			}
			return f1.add(f2);
		}
	}
	
	

}
