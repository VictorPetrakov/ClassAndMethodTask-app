package by.htp.hometask.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.htp.hometask.bean.Customer;

public class CustomerLogic {

	public List<Customer> getListBySurname(List<Customer> customersList) {
		List<Customer> list = new ArrayList<>(customersList);
		Collections.sort(list, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getSurname().compareToIgnoreCase(o2.getSurname());
			}
		});
		return list;
	}
	
	public List<Customer> getListByBankAccountNumber(List<Customer> customersList, int diapazonStart, int diapazonEnd) {
		List<Customer> list = new ArrayList<>();
		for (Customer c : customersList) {
			if (c.getNumberOfCard() >= diapazonStart && c.getNumberOfCard() <= diapazonEnd) {
				list.add(c);
			}
		}
		return list;
	}
}
