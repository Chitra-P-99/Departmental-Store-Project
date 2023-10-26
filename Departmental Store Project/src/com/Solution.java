package com;

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		DepartmentalStore d=new DepartmentalStoreImpl();
		System.out.println("Welcome to JSP Departmental Store :");
		System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*\n");
		d.addProduct();
		int n=1;
		while(n==1) {

			d.displayProduct();
			d.buyProduct();

			System.out.println("\nPress 1 to continue to add into cart \nPress 2 to CheckOut Bill");
			n=ip.nextInt();
		}
		d.checkOut();
	}

}
