package com.bridgelabz.inventorydatamanagement;

public class InventoryProperties {

	public String name;
	public int weight;
	public double pricePerKg;
	public double value;
	
	public InventoryProperties(String name, int weight, double pricePerKg, double value) {
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public double getPrice() {
		return pricePerKg;
	}

	public double getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setPrice(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "InventoryProperties [name=" + name + ", weight=" + weight + ", pricePerKg=" + pricePerKg + ", value=" + value
				+ "]";
	}
}
