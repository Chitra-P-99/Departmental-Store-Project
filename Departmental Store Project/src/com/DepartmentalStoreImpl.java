package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStoreImpl implements DepartmentalStore
{
	Scanner ip=new Scanner(System.in);
	// Key -->Product Id ,Values ->> Product() Instance

	Map<Integer,Product> m=new LinkedHashMap<>();
	int totalbill=0;

	@Override
	public void addProduct()
	{
		m.put(1, new Product("Chocolate",10,10));
		m.put(2, new Product("Chips",20,10));
		m.put(3, new Product("Biscuits",50,10));
		m.put(4, new Product("Rice",10,50));

	}

	@Override
	public void displayProduct()
	{
		Set<Integer> keys=m.keySet();
		for(int key:keys)
		{
			Product p=m.get(key);
			System.out.println("Enter "+key+" To Order "+p.getName());
			System.out.println("Available Quantity :"+p.getQuantity());
			System.out.println("Cost :"+p.getCost());
			System.out.println("--------------------------");
		}
	}

	@Override
	public void buyProduct()
	{
		System.out.println("Enter Your Choice :");
		int choice=ip.nextInt();
		Product p=m.get(choice);
		if(p!=null)
		{
			System.out.println("Enter The Quantity :");
			int quantity=ip.nextInt();//accepting Quantity from the user
			if(quantity<=p.getQuantity())
			{
				//Calculate Product Cost
				int productCost=quantity*p.getCost();
				
				//Calculate Avaliable quantity
				p.setQuantity(p.getQuantity()-quantity);
				
				//Calculating Total Bill
				totalbill=totalbill+productCost;
				
				System.out.println("Ordered Product :"+p.getName());
				System.out.println("Product Cost :"+productCost);
				System.out.println("Total Bill As of Now :"+totalbill);
				
			}
			
			
			else
				try {
					throw new InvalidQuantityException("Invalid Quantity :"+p.getName()+" is not Avalilable");
				    }
			     catch(Exception e) {
			
				System.out.println(e.getMessage());
			        }
		}
		else
		{
			try {
				throw new InvalidChoiceException("Please Enter Valid Choice :");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void checkOut()
	{
		System.out.println("Total Bill : Rs."+totalbill);
		System.out.println("Thank You For Shopping");
	}
}
