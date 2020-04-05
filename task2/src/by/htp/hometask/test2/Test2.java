package by.htp.hometask.test2;

// 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор, 
//инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса. 

public class Test2 {

	private int x;
	private int y;

	public Test2() {

	}

	public Test2(int _x, int _y) {
		this.x = _x;
		this.y = _y;

	}

	public void setX(int _x) {
		this.x = _x;

	}

	public int getX() {
		return x;

	}

	public void setY(int _y) {

		this.y = _y;
	}

	public int getY() {
		return y;

	}

}
