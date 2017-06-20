package com.epam.assignment.stationarykit.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.epam.assignment.stationarykit.item.AbstractStationaryUnits;

public class ComparatorByNameAndPrice<T> implements Comparator<AbstractStationaryUnits> {
	 
    private final List<ComparatorByNameAndPrice<AbstractStationaryUnits>> comparator;
 
    public ComparatorByNameAndPrice(List<ComparatorByNameAndPrice<AbstractStationaryUnits>> comparator) {
        this.comparator = comparator;
    }

	public ComparatorByNameAndPrice(@SuppressWarnings("unchecked") ComparatorByNameAndPrice<AbstractStationaryUnits>... comparator) {
        this(Arrays.asList(comparator));
    }
 
    @Override
    public int compare(AbstractStationaryUnits item1, AbstractStationaryUnits item2) {
        for (ComparatorByNameAndPrice<AbstractStationaryUnits> comparator : comparator) {
        	if(comparator != null){
        		int result = comparator.compare(item2, item1);
                if (result != 0) {
                    return result;
                }
        	}
        }
        return 0;
    }
    
}
