package by.htp.hometask.view;

import by.htp.hometask.bean.Clock;

public class ViewTime {
	
	public void printTime(Clock clock) {
		
		System.out.println(clock.getHours() + " часов " + clock.getMin() + " минут " + clock.getSec() + " секунд");
		
	}

}
