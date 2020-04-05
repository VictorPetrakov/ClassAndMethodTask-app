package by.htp.hometask.main;

import by.htp.hometask.bean.Clock;
import by.htp.hometask.logic.ClockLogic;
import by.htp.hometask.view.ViewTime;

public class ClockDemo {

	public static void main(String[] args) {
		
		Clock clock1 = new Clock(10, 12, 53);
		ClockLogic logic = new ClockLogic();
		ViewTime view = new ViewTime();
		
		view.printTime(clock1);
		
		logic.changeHours(clock1, 25);
		logic.changeMin(clock1, 50);
		logic.changeSec(clock1, 50);
		
		view.printTime(clock1);
		
		

	}

}
