package by.htp.hometask.view;

import java.util.List;

import by.htp.hometask.bean.Airline;

public class ViewAirport {

	public void showList(List<Airline> airlineList) {
		for (Airline c : airlineList) {
			System.out.println(c);
		}
	}

}
