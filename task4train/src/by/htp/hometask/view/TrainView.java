package by.htp.hometask.view;

import by.htp.hometask.bean.Train;

public class TrainView {
	
	public void findTrainByNumber(int numberOfTrain, Train[] trains) {

		for (int i = 0; i < trains.length; i++) {

			if (trains[i].getNumberOfTrain() == numberOfTrain) {

				System.out.println(trains[i].getDestination() + " " + trains[i].getNumberOfTrain() + " "
						+ trains[i].getDepartureTime());

			}
		}
	}
	
	public void printTable(Train[] trains) {

		for (int i = 0; i < trains.length; i++) {

			System.out.println(trains[i].getDestination() + " " + trains[i].getNumberOfTrain() + " "
					+ trains[i].getDepartureTime());
		}
	}

}
