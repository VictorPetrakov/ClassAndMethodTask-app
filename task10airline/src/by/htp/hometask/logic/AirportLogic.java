package by.htp.hometask.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.hometask.bean.Airline;

public class AirportLogic {

	public List<Airline> getListByDestination(List<Airline> airlineList, String destination) {

		List<Airline> list = new ArrayList<>();
		for (Airline c : airlineList) {
			if (c.getDestination().equals(destination)) {
				list.add(c);
			}
		}

		return list;
	}
	
	public List<Airline> getListByDayOfTheWeek(List<Airline> airlineList, String dayOfTheWeek) {

		List<Airline> list = new ArrayList<>();
		for (Airline c : airlineList) {
			if (c.getDayOfTheWeek().contains(dayOfTheWeek)) {
				list.add(c);
			}
		}

		return list;
	}
	
	public List<Airline> getListByDayOfTheWeekAndTime(List<Airline> airlineList, String dayOfTheWeek, String time) {

		List<Airline> list = new ArrayList<>();
		for (Airline c : airlineList) {
			if (c.getDayOfTheWeek().contains(dayOfTheWeek)) {
				if (c.getTimeAway().compareTo(time) > 0) {
					list.add(c);
				}
			}
		}

		return list;
	}
}
