package com.epam.assignment.stationarykit.starter;

import java.util.List;

import com.epam.assignment.stationarykit.item.AbstractStationaryUnits;

public interface IStarterKit {

	public void addItems(AbstractStationaryUnits items);
	
	public List<AbstractStationaryUnits> orderItemsByPrice();
	
	public List<AbstractStationaryUnits> orderItemsByName();
	
	public List<AbstractStationaryUnits> orderItemsByNameAndPrice();
}
