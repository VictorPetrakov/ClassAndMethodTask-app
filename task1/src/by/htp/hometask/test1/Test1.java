package by.htp.hometask.test1;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
//Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение 
//из этих двух переменных.

public class Test1 {

	private int x;
	private int y;

	public void setX(int _x) {
		x = _x;
	}

	public void setY(int _y) {
		y = _y;
	}

	public void print() {
		System.out.println("x = " + x + ", y = " + y);
	}

	public int sumXY() {

		int sum;
		sum = x + y;

		return sum;
	}

	public int maxXY(){

		int max;
		
		max = Math.max(x,y);
		
		return max;
	}
}
