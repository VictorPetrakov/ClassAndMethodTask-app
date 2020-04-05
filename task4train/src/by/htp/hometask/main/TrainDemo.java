package by.htp.hometask.main;

import by.htp.hometask.bean.Train;
import by.htp.hometask.logic.TrainLogic;
import by.htp.hometask.view.TrainView;

public class TrainDemo {

	public static void main(String[] args) {
		int size;
		size = 5;

		Train[] trains = new Train[size];

		trains[0] = new Train("Minsk", 254, "17:50");
		trains[1] = new Train("Moskva", 181, "12:30");
		trains[2] = new Train("Gomel", 14, "8:45");
		trains[3] = new Train("Minsk", 254, "10:24");
		trains[4] = new Train("Minsk", 777, "06:50");
		
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();
		

		trains = logic.sortTrainByNumber(trains);

		view.printTable(trains);

		System.out.println();

		view.findTrainByNumber(254, trains);

		System.out.println();

		logic.sortTrainByDestination(trains);

		view.printTable(trains);

	}

}
