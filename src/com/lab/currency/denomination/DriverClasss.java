package com.lab.currency.denomination;

import java.util.Scanner;

public class DriverClasss {
	
	public static void main(String[] args) {

		System.out.println("Enter the size of currency denominations");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println("Enter the currency denominations value");

		int denomination[] = new int[n];
		for (int i = 0; i < n; i++) {
			denomination[i] = scan.nextInt();
		}

		MergeSort.sort(denomination, 0, denomination.length - 1);

		System.out.println("Enter the amount you want to pay");
		int sum = scan.nextInt();

		int count[] = new int[denomination.length];

		for (int i = 0; i < denomination.length; i++) {
			if (sum >= denomination[i]) {
				int x = sum / denomination[i];
				sum = sum - (denomination[i] * x);
				count[i] = x;
			}

		}
		if (sum > 0) {
			System.out.println("Not possible to pay the amount");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0)
					System.out.println(denomination[i] + ":" + count[i]);
			}
		}
	}

}
