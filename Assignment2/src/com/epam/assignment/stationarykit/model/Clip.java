package com.epam.assignment.stationarykit.model;

import com.epam.assignment.stationarykit.item.AbstractStationaryUnits;

public class Clip extends AbstractStationaryUnits{
	
	private int itemSize;
	private String itemBrandName;
	
	public Clip(int itemSize, String itemBrandName, String itemName, int itemPrice) {
		super (itemName, itemPrice);
		this.setItemSize(itemSize);
		this.setItemBrandName(itemBrandName);
	}

	public String getItemBrandName() {
		return itemBrandName;
	}

	public void setItemBrandName(String stationaryBrand) {
		this.itemBrandName = stationaryBrand;
	}

	public int getItemSize() {
		return itemSize;
	}

	public void setItemSize(int itemSize) {
		this.itemSize = itemSize;
	}
	
}
