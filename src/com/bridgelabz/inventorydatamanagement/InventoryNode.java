package com.bridgelabz.inventorydatamanagement;

import com.bridgelabz.linkedlistproblems.*;

public class InventoryNode implements INode<InventoryProperties>
{
	
	InventoryProperties key;
	InventoryNode next;
	
	public InventoryNode(InventoryProperties key) 
	{
		this.key=key;
		next=null;
	}
	
	@Override
	public InventoryProperties getKey() 
	{
		return this.key;
	}

	@Override
	public INode<InventoryProperties> getNext() 
	{
		return this.next;
	}

	@Override
	public void setKey(InventoryProperties key) 
	{
		
		this.key=key;
	}

	@Override
	public void setNext(INode next) 
	{
		this.next=(InventoryNode) next;
		
	}

	
}
