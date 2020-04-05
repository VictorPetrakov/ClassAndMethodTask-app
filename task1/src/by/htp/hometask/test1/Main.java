package by.htp.hometask.test1;

public class Main {

	public static void main(String[] args) {
		
		int sum;
		int max;
		
		Test1 t1 = new Test1();
		
		t1.setX(3);
		t1.setY(4);
		
		t1.print();
		sum = t1.sumXY();
		max = t1.maxXY();
		
		System.out.println("Сумма х и у равна " + sum + ", наибольшее значение равно " + max);

	}

}
