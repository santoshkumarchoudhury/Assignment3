package com.epam.assignment.stationarykit.comparator;

import java.util.Comparator;

import com.epam.assignment.stationarykit.item.AbstractStationaryUnits;

public class ComparatorByName implements Comparator<AbstractStationaryUnits> {

	@Override
	public int compare(AbstractStationaryUnits item1, AbstractStationaryUnits item2) {
		if(item1 != null && item2 != null){
			return item1.getItemName().compareToIgnoreCase(item2.getItemName());
		}
		else
		{
			return 0;
		}
	}

}
