package com;

public class Product {
	
	private String name;
	private int quantity;
	private int cost;
	
	public Product(String name,int quantity,int cost)
	{
		this.cost=cost;
		this.name=name;
		this.quantity=quantity;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public int getCost() {
		return cost;
	}
	
	public String toString()
	{
		return "Product Name :"+name+" Quantity :"+quantity+" Cost :"+cost;
	}

}
