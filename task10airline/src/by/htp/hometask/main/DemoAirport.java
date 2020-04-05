package by.htp.hometask.main;

import java.util.List;

import by.htp.hometask.bean.Airline;
import by.htp.hometask.bean.Airport;
import by.htp.hometask.logic.AirportLogic;
import by.htp.hometask.view.*;

public class DemoAirport {

	public static void main(String[] args) {
		Airport domodedovo = new Airport("Домодедово");
		AirportLogic logic = new AirportLogic();
		ViewAirport view = new ViewAirport();

		domodedovo.addAirlineToAirportList(new Airline("Париж", 777, "Ту-167", "10:30", "Понедельник,Среда,Пятница"));
		domodedovo.addAirlineToAirportList(new Airline("Лондон", 161, "Боинг-747", "22:33", "Среда,Пятница"));
		domodedovo.addAirlineToAirportList(new Airline("Нью-Йорк", 100, "Ту-134", "15:37", "Понедельник,Среда,Пятница"));
		domodedovo.addAirlineToAirportList(new Airline("Париж", 756, "Ту-154", "18:30", "Понедельник,Пятница,Воскресенье"));
		domodedovo.addAirlineToAirportList(new Airline("Мадрид", 457, "Ту-167", "14:25", "Понедельник,Среда,Суббота"));
		domodedovo.addAirlineToAirportList(new Airline("Париж", 777, "Ту-167", "10:10", "Суббота,Воскресенье"));

		view.showList(domodedovo.airlineList);

		System.out.println("Список рейсов для заданного пункта назначения:");

		List<Airline> listSortByDestination = logic.getListByDestination(domodedovo.airlineList, "Париж");
		
		view.showList(listSortByDestination);

		System.out.println("Список рейсов для заданного дня недели:");

		List<Airline> listSortByDayOfTheWeek = logic.getListByDayOfTheWeek(domodedovo.airlineList, "Среда");
		
		view.showList(listSortByDayOfTheWeek);

		System.out.println("Список рейсов для заданного дня недели, который вылетает после заданного времени:");

		List<Airline> listSortByDayOfTheWeekAndTimeAway = logic.getListByDayOfTheWeekAndTime(domodedovo.airlineList, "Пятница", "10:00");
		
		view.showList(listSortByDayOfTheWeekAndTimeAway);

	}

}
