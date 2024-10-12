package com.syed.corejava;

public class PrimeNo {

	public static void main(String[] args) {
			for (int i = 1; i <= 13; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	static boolean isPrime(int n) {
		int i = 2;
		while (((n%i)!=0) && (i<=(n/2))) {
			i++;
		}
		if (i <= (n / 2)) {
			return false;
		} else {
			return true;
		}
	}
}
