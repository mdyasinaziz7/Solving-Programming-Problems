package net.properbd.assignment04;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		
		System.out.println("Enter a number: ");
		int n = k.nextInt();
		int divisorCount = 0;
		
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				divisorCount++;
			}
		}
		System.out.println(divisorCount);
		
		k.close();
	}

}
