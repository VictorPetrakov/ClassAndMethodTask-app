package by.htp.hometask.test2;

public class Main {

	public static void main(String[] args) {

		Test2 t2 = new Test2();
		Test2 t3 = new Test2(2, 3);
		
		System.out.println("x = " + t2.getX());
		System.out.println("y = " + t2.getY());
		
		System.out.println("x = " + t3.getX());
		System.out.println("y = " + t3.getY());
		
		t2.setX(3);
		t2.setY(4);
		
		System.out.println("x = " + t2.getX());
		System.out.println("y = " + t2.getY());

	}

}
