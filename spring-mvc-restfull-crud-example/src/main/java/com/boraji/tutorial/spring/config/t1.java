package com.boraji.tutorial.spring.config;

import java.util.*;

class TestClass {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

//System.out.println(N);

		int[] a = new int[N]; // Reading input from STDIN

// Writing output to STDOUT

		for (int i = 0; i < N; i++) {

			int e = s.nextInt();

			a[i] = e;

		}

// Write your code here

		int j, k;
		boolean flag = true;

		for (int i = 0; i < N; i++) {

			j = i + 1;

			while (j < N) {

				flag = false;

				if (a[i] < a[j]) {

					k = j + 1;

					while (k < N) {

						flag = false;

						if (a[j] > a[k]) {

							System.out.print(a[k] + " ");

							flag = true;

							break;

						} else {

							k = k + 1;

						}

					}

					if (flag == false) {

						System.out.print(-1 + " ");

					}

					break;

				} else {

					j = j + 1;

				}

			}

			if (flag == false) {

				System.out.print(-1 + " ");

			}

		}

	}

}
