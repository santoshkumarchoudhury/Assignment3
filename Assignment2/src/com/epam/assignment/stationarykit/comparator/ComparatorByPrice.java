package com.epam.assignment.stationarykit.comparator;

import java.util.Comparator;

import com.epam.assignment.stationarykit.item.AbstractStationaryUnits;

public class ComparatorByPrice implements Comparator<AbstractStationaryUnits> {

	@Override
	public int compare(AbstractStationaryUnits item1, AbstractStationaryUnits item2) {
		if(item1 != null && item2 != null){
			return item1.getItemPrice() - item2.getItemPrice();
		}
		else
		{
			return 0;
		}
	}

}
