package com.xworkz.aptitude;

public class Problem1 {

	public static void main(String[] args) {

		int i, j, k = 8;
		int n = 0;
		int m = 5;
		for (i = 0; i <= k; i++) {

			for (j = 0; j <= 5; j++) {
				if (j == 0 || (i == j + 3 && j > 1))

					System.out.print("*");
				else if (i == n && j == m) {
					System.out.print("*");
					n = n + 1;
					m = m - 1;

				} else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}
