package com.epam.assignment.stationarykit.item;

import com.epam.assignment.stationarykit.constants.Constants;

public abstract class AbstractStationaryUnits {

	private String itemName;
	private int itemPrice;

	public AbstractStationaryUnits(String itemName, int itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 10;
		int result = 2;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + Float.floatToIntBits(itemPrice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		AbstractStationaryUnits stationaryItem = (AbstractStationaryUnits) obj;
		if(stationaryItem != null){
			if (itemName == null) {
				if (stationaryItem.itemName != null)
					return false;
			} else if (!itemName.equals(stationaryItem.itemName))
				return false;
			if (Float.floatToIntBits(itemPrice) != Float.
					floatToIntBits(stationaryItem.itemPrice))
				return false;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "\n Item Name"+ Constants.TO_STRING_SYMBOL  + itemName 
				+ "\t  \t \t Item Price"+ Constants.TO_STRING_SYMBOL + itemPrice;
	}
}
