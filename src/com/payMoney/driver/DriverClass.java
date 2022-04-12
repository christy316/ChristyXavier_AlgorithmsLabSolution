package com.payMoney.driver;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Enter the size of transactiona array");
			int size = scan.nextInt();
			int i;
			int transaction[] = new int[size];

			System.out.println("Enter the array element");
			for (i = 0; i < size; i++) {
				transaction[i] = scan.nextInt();
			}
			System.out.println("Enter the total no of targets that needs to be achieved");
			int tragetNo = scan.nextInt();

			while (tragetNo-- > 0) {

				System.out.println("Enter the target value");
				int traget = scan.nextInt();

				int sum = 0;
				boolean flag = false;
				for (i = 0; i < size; i++) {
					sum += transaction[i];
					if (sum >= traget) {
						flag = true;
						break;
					}

				}

				if (flag) {
					System.out.println("Target achived after " + (i + 1) + " transactions");
				} else {
					System.out.println("Given target is not achieved");
				}
			}

		}

	}

}
