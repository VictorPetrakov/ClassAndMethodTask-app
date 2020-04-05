package by.htp.hometask.bean;

import java.util.ArrayList;

public class Airport {

	private String nameAirport;
	public ArrayList<Airline> airlineList = new ArrayList<>();

	public Airport() {

	}

	public Airport(String nameAirport) {
		this.setNameAirport(nameAirport);
	}

	public String getNameAirport() {
		return nameAirport;
	}

	public void setNameAirport(String nameAirport) {
		this.nameAirport = nameAirport;
	}

	public void addAirlineToAirportList(Airline airline) {
		airlineList.add(airline);
	}

	public ArrayList<Airline> getAirlineList() {
		return airlineList;
	}

	public void setAirlineList(ArrayList<Airline> airlineList) {
		this.airlineList = airlineList;
	}
	

}
