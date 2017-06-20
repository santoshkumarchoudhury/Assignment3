package com.epam.assignment.stationarykit.controller;

import java.util.ArrayList;

import com.epam.assignment.stationarykit.constants.Constants;
import com.epam.assignment.stationarykit.model.Brush;
import com.epam.assignment.stationarykit.model.Clampper;
import com.epam.assignment.stationarykit.model.Clip;
import com.epam.assignment.stationarykit.model.File;
import com.epam.assignment.stationarykit.model.Folder;
import com.epam.assignment.stationarykit.model.Marker;
import com.epam.assignment.stationarykit.model.PaperSheet;
import com.epam.assignment.stationarykit.model.Pen;
import com.epam.assignment.stationarykit.model.Pencil;
import com.epam.assignment.stationarykit.model.Pin;
import com.epam.assignment.stationarykit.model.StickyPad;
import com.epam.assignment.stationarykit.starter.IStarterKit;
import com.epam.assignment.stationarykit.starter.StarterKitImpl;


public class StationaryItemStartUp {

	public static void main(String[] args) {
		
		IStarterKit starterKit = new StarterKitImpl(new ArrayList<>());
		
		starterKit = populateData(starterKit);		
		
		listItemsWithoutSort(starterKit);
		
		sortItemsByName(starterKit);
		
		sortItemsByPrice(starterKit);
		
		sortItemsByNameAndPrice(starterKit);
	}

	private static IStarterKit populateData(IStarterKit starterKit) {
		starterKit.addItems(new Brush(Constants.ITEM_NAME_BRUSH, Constants.ITEM_PRICE_BRUSH));
		starterKit.addItems(new Pin(Constants.ITEM_NAME_PIN, Constants.ITEM_PRICE_PIN));
		starterKit.addItems(new File(Constants.ITEM_NAME_FILE, Constants.ITEM_PRICE_FILE));
		starterKit.addItems(new Pen(Constants.ITEM_NAME_PEN, Constants.ITEM_PRICE_PEN));
		starterKit.addItems(new Pencil(Constants.ITEM_NAME_PENCIL, Constants.ITEM_PRICE_PENCIL));
		starterKit.addItems(new Folder(Constants.ITEM_NAME_FOLDER, Constants.ITEM_PRICE_FOLDER));
		starterKit.addItems(new Clampper(Constants.ITEM_NAME_CLAMPPER, Constants.ITEM_PRICE_CLAMPPER));
		starterKit.addItems(new PaperSheet(Constants.ITEM_NAME_PAPERSHEET,Constants.ITEM_PRICE_PAPERSHEET));
		starterKit.addItems(new Marker(Constants.ITEM_NAME_MARKER, Constants.ITEM_PRICE_MARKER));
		starterKit.addItems(new StickyPad(Constants.ITEM_NAME_STICKYPAD, Constants.ITEM_PRICE_STICKYPAD));
		starterKit.addItems(new Clip(Constants.CLIP_SIZE, Constants.CLIP_BRAND, Constants.ITEM_NAME_CLIP, Constants.ITEM_PRICE_CLIP));
		return starterKit;
	}
	
	private static void listItemsWithoutSort(IStarterKit starterKit) {
		System.out.println(Constants.STAR_SYMBOL);
		System.out.println(Constants.LIST_OF_ITEMS_NOT_SORTED);
		System.out.println(Constants.STAR_SYMBOL);
		System.out.println(((StarterKitImpl) starterKit).getItemsList());
	}
	
	private static void sortItemsByName(IStarterKit starterKit) {
		System.out.println(Constants.NEW_LINE);
		System.out.println(Constants.STAR_SYMBOL);
		System.out.println(Constants.SORT_BY_NAME);
		System.out.println(Constants.STAR_SYMBOL);
		System.out.println(starterKit.orderItemsByName());
		}
	
	private static void sortItemsByPrice(IStarterKit starterKit) {
		System.out.println(Constants.NEW_LINE);
		System.out.println(Constants.STAR_SYMBOL);
		System.out.println(Constants.SORT_BY_PRICE);
		System.out.println(Constants.STAR_SYMBOL);
		System.out.println(starterKit.orderItemsByPrice());
	}
	
	private static void sortItemsByNameAndPrice(IStarterKit starterKit) {
		System.out.println(Constants.NEW_LINE);
		System.out.println(Constants.STAR_SYMBOL);
		System.out.println(Constants.SORT_BY_NAME_AND_PRICE);
		System.out.println(Constants.STAR_SYMBOL);
		System.out.println(starterKit.orderItemsByNameAndPrice());
	}
}
