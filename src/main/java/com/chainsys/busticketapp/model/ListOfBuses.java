package com.chainsys.busticketapp.model;

public class ListOfBuses {

	public int BusNo;
	public String BusName;
	public String BusSource;
	public String BusDestination;
	public String Class;

	@Override
	public String toString() {
		return "ListOfBuses [BusNo=" + BusNo + ", BusName=" + BusName + ", BusSource=" + BusSource + ", BusDestination="
				+ BusDestination + ", Class=" + Class + "]";

	}

}