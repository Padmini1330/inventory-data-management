package com.bridgelabz.inventorydatamanagement;

import java.util.Scanner;

import com.bridgelabz.linkedlistproblems.MyLinkedList;

public class InventoryManagementMain 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		MyLinkedList<InventoryProperties> node=new MyLinkedList<InventoryProperties>();
		System.out.println("Enter the number of Inventories to be added:");
		int number=scanner.nextInt();
		for(int index=0;index<number;index++)
		{
			System.out.println("Enter name:");
			String name=scanner.next();
			System.out.println("Enter weight:");
			int weight=scanner.nextInt();
			System.out.println("Enter price per Kg:");
			double pricePerKg=scanner.nextDouble();
			double value=weight * pricePerKg;
			InventoryProperties inventory=new InventoryProperties(name, weight, pricePerKg, value);
			InventoryNode newNode=new InventoryNode(inventory);
			node.add(newNode);
		}
		node.printMyNodes();

	}

}
