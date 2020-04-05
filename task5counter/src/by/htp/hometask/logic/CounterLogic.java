package by.htp.hometask.logic;

public class CounterLogic {

	public int increaseValue(int value, int min, int max) {
		int temp;
		temp = value;
		
		temp++;
		
		if(temp > max) {
			return 0;
		}
		return temp;
	}
	
	public int decreaseValue(int value, int min, int max) {
		int temp;
		temp = value;
		
		temp--;
		
		if(temp < min) {
			return 0;
		}
		return temp;
	}
}
