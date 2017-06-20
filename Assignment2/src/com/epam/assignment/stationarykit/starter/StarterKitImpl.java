package com.epam.assignment.stationarykit.starter;

import java.util.Collections;
import java.util.List;

import com.epam.assignment.stationarykit.comparator.ComparatorByName;
import com.epam.assignment.stationarykit.comparator.ComparatorByNameAndPrice;
import com.epam.assignment.stationarykit.comparator.ComparatorByPrice;
import com.epam.assignment.stationarykit.item.AbstractStationaryUnits;

public class StarterKitImpl implements IStarterKit{

	private List<AbstractStationaryUnits> stationaryItemsList;
	
	
	public StarterKitImpl(List<AbstractStationaryUnits> stationaryItemsList) {
		this.stationaryItemsList = stationaryItemsList;
	}
	
	@Override
	public void addItems(AbstractStationaryUnits stationaryItems) {
		stationaryItemsList.add(stationaryItems);
	}

	public List<AbstractStationaryUnits> getItemsList() {
		return stationaryItemsList;
	}

	public void setListOfStationaryItem(List<AbstractStationaryUnits> listOfStationaryItem) {
		this.stationaryItemsList = listOfStationaryItem;
	}

	@Override
	public List<AbstractStationaryUnits> orderItemsByPrice() {
		Collections.sort(stationaryItemsList, new ComparatorByPrice());
		return getItemsList();
	}

	@Override
	public List<AbstractStationaryUnits> orderItemsByName() {
		Collections.sort(stationaryItemsList, new ComparatorByName());
		return getItemsList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AbstractStationaryUnits> orderItemsByNameAndPrice() {
		Collections.sort(stationaryItemsList, new ComparatorByNameAndPrice<AbstractStationaryUnits>());
		return getItemsList();
	}
	
	

}
