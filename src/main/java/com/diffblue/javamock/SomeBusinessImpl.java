package com.diffblue.javamock;

import java.util.ArrayList;

public class SomeBusinessImpl  {

	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		this.dataService = dataService;
	}

	public byte findTheGreatestFromAllBytes() {
		byte[] data = dataService.retrieveAllBytes();
		byte greatest = Byte.MIN_VALUE;

		if (data.length == 1) {
			return data[0];
		}

		for (byte value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}

	public String findTheBiggestFromAllStrings() {
		String[] data = dataService.retrieveAllStrings();

		int index = 0;
		int elementLength = data[0].length();
		for(int i=1; i < data.length; i++) {
			if(data[i].length() > elementLength) {
				index = i; elementLength = data[i].length();
			}
		}
		return data[index];
	}

	public String findUsingEnhancedForLoop(
			String name) {

		ArrayList<Animals> items = dataService.retrieveAllObjects();

		for (Animals item : items) {
			if (item.getName().equals(name)) {
				return item.getName();
			}
		}
		return null;
	}
}