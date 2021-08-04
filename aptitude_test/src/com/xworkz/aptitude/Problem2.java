package com.xworkz.aptitude;

public class Problem2 {

	public static void main(String[] args) {

		int row = 5;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if (i + j <= row + (row / 2) + 1 && j - i <= row / 2 && i - j <= row / 2
						&& i + j >= row - (row / 2) + 1)

					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
