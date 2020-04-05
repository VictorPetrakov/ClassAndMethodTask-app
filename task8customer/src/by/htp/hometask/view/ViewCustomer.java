package by.htp.hometask.view;

import java.util.List;

import by.htp.hometask.bean.Customer;

public class ViewCustomer {
	
	public void viewCustomer(List<Customer> customersList) {
		for (Customer c : customersList) {
			System.out.println(c);
		}
	}
}
