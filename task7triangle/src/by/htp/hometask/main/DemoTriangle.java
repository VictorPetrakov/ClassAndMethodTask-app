package by.htp.hometask.main;

import by.htp.hometask.bean.Triangle;
import by.htp.hometask.logic.TriangleLogic;
import by.htp.hometask.view.ViewTriangle;

public class DemoTriangle {

	public static void main(String[] args) {

		Triangle tr1 = new Triangle(1, 1, 5, 1, 3, 5);
		TriangleLogic logic = new TriangleLogic();
		ViewTriangle view = new ViewTriangle();

		tr1 = logic.checkTriangle(tr1);

		double sideA;
		double sideB;
		double sideC;

		double area;
		double perimetr;
		double semiperimetr;

		sideA = logic.sideOfTriangle(tr1.getX1(), tr1.getX2(), tr1.getY1(), tr1.getY2());
		sideB = logic.sideOfTriangle(tr1.getX1(), tr1.getX3(), tr1.getY1(), tr1.getY3());
		sideC = logic.sideOfTriangle(tr1.getX2(), tr1.getX3(), tr1.getY2(), tr1.getY3());

		perimetr = logic.perimetrTriangle(sideA, sideB, sideC);

		view.printValue(perimetr);

		semiperimetr = perimetr / 2;

		area = logic.areaTriangle(semiperimetr, sideA, sideB, sideC);

		view.printValue(area);

		logic.findPointMedian(tr1.getX1(), tr1.getX2(), tr1.getX3(), tr1.getY1(), tr1.getY2(), tr1.getY3());

	}
}
