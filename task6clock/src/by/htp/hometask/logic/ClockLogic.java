package by.htp.hometask.logic;

import by.htp.hometask.bean.Clock;

public class ClockLogic {

	public void changeHours(Clock clock, int hours) {

		if (hours < 0) {
			hours = 0;
		}

		if (hours >= 24) {

			hours = hours % 24;

			clock.setHours(clock.getHours() + hours);

			if (clock.getHours() >= 24) {

				clock.setHours(clock.getHours() % 24);
			}
		} else {
			clock.setHours(clock.getHours() + hours);
		}

	}

	public void changeMin(Clock clock, int min) {

		if (min < 0) {
			min = 0;
		}

		if (min >= 60) {

			clock.setHours(clock.getHours() + (min / 60));

			min = min % 60;

			clock.setMin(clock.getMin() + min);

			if (clock.getMin() > 60) {

				clock.setHours(clock.getHours() + (clock.getMin() / 60));
				clock.setMin(clock.getMin() % 60);

			}
		} else {

			clock.setMin(clock.getMin() + min);

			if (clock.getMin() > 60) {

				clock.setHours(clock.getHours() + (clock.getMin() / 60));
				clock.setMin(clock.getMin() % 60);

			}
		}

	}

	public void changeSec(Clock clock, int sec) {

		if (sec >= 60) {

			clock.setMin(clock.getMin() + (sec / 60));

			sec = sec % 60;

			clock.setSec(clock.getSec() + sec);

			if (clock.getSec() > 60) {

				clock.setMin(clock.getMin() + (clock.getSec() / 60));

				clock.setSec(clock.getSec() % 60);

			}
		} else {

			clock.setSec(clock.getSec() + sec);

			if (clock.getSec() > 60) {

				clock.setMin(clock.getMin() + (clock.getSec() / 60));
				clock.setSec(clock.getSec() % 60);

			}
		}

	}

}
