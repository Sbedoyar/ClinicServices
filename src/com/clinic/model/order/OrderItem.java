package com.clinic.model.order;

import com.clinic.model.Inventory.Item;

public abstract class OrderItem {
    protected int itemNumber;
    protected Item item;
    
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}
