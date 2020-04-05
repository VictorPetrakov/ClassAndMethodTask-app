package by.htp.hometask.main;

import by.htp.hometask.bean.Counter;
import by.htp.hometask.logic.CounterLogic;
import by.htp.hometask.view.CounterView;

public class CounterDemo {

	public static void main(String[] args) {
		Counter count1  = new Counter(12, 8, 25);
		
		CounterLogic logic = new CounterLogic();
		CounterView view = new CounterView();
		
		
		view.printValue(count1.getValue());
		
		count1.setValue(logic.increaseValue(count1.getValue(), count1.getMin(), count1.getMax()));
		
		view.printValue(count1.getValue());
		
		count1.setValue(logic.decreaseValue(count1.getValue(), count1.getMin(), count1.getMax()));
		
		view.printValue(count1.getValue());

	}

}
