package com.epam.assignment.stationarykit.model;

import com.epam.assignment.stationarykit.item.AbstractStationaryUnits;

public class Folder extends AbstractStationaryUnits{

	private File fileDetails;
	
	public Folder(String itemName, int itemPrice) {
		super(itemName, itemPrice);
	}
	public File getFileDetails() {
		return fileDetails;
	}
	public void setFileDetails(File fileDetails) {
		this.fileDetails = fileDetails;
	}

}
