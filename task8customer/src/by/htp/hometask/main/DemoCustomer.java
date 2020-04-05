package by.htp.hometask.main;

import java.util.List;

import by.htp.hometask.bean.Customer;
import by.htp.hometask.bean.Shop;
import by.htp.hometask.logic.CustomerLogic;
import by.htp.hometask.view.ViewCustomer;

public class DemoCustomer {

	public static void main(String[] args) {
		Shop supermarket = new Shop("Supermarket");
		CustomerLogic logic = new CustomerLogic();
		ViewCustomer view = new ViewCustomer();

		supermarket.addCustomerToShopList(new Customer(0, "Иванов", "Иван", "Украина", 11_22_33_44, 12345));
		supermarket.addCustomerToShopList(new Customer(1, "Петров", "Петр", "Россия", 22_33_44_55, 23456));
		supermarket.addCustomerToShopList(new Customer(2, "Семенов", "Дмитрий", "Беларусь", 33_44_55_66, 34567));
		supermarket.addCustomerToShopList(new Customer(3, "Летвинов", "Семен", "Беларусь", 44_55_66_77, 45678));
		supermarket.addCustomerToShopList(new Customer(4, "Путинов", "Алексей", "Украина", 55_66_77_88, 56789));
		supermarket.addCustomerToShopList(new Customer(5, "Смолов", "Олег", "Россия", 66_77_88_99, 67898));

		view.viewCustomer(supermarket.customersList);

		System.out.println("\nсортировка по фамилии:");

		List<Customer> listSortByName = logic.getListBySurname(supermarket.customersList);
		
		view.viewCustomer(listSortByName);

		System.out.println("\nсортировка по номеру карты в задданом диапазоне:");

		List<Customer> listSortByDiapazonCreditCard = logic.getListByBankAccountNumber(supermarket.customersList, 33_44_55_66, 66_77_88_99);
		
		view.viewCustomer(listSortByDiapazonCreditCard);
		
	}

}
