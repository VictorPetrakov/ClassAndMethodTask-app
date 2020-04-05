package by.htp.hometask.logic;

import by.htp.hometask.bean.Train;

public class TrainLogic {
	
	public Train[] sortTrainByNumber(Train[] trains) {

		for (int i = trains.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (trains[j].getNumberOfTrain() > trains[j + 1].getNumberOfTrain()) {

					Train temp;
					temp = trains[j];
					trains[j] = trains[j + 1];
					trains[j + 1] = temp;
				}
			}
		}

		return trains;
	}

	public Train[] sortTrainByDestination(Train[] trains) {

		for (int i = trains.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				int var;
				var = trains[j].getDestination().compareTo(trains[j + 1].getDestination());

				if (var > 0) {

					Train temp;
					temp = trains[j];
					trains[j] = trains[j + 1];
					trains[j + 1] = temp;
				}
				if (trains[j].getDestination().equals(trains[j + 1].getDestination())) {

					int var1;
					var1 = trains[j].getDepartureTime().compareTo(trains[j + 1].getDepartureTime());

					if (var1 > 0) {

						Train temp;
						temp = trains[j];
						trains[j] = trains[j + 1];
						trains[j + 1] = temp;
					}
				}
			}
		}

		return trains;

	}

}
