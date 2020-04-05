package by.htp.hometask.logic;

import by.htp.hometask.bean.Triangle;

public class TriangleLogic {
	
	public double areaTriangle(double p1, double sideA, double sideB, double sideC) {

		double s;

		s = Math.sqrt(p1 * (p1 - sideA) * (p1 - sideB) * (p1 - sideC));

		return s;

	}

	public double sideOfTriangle(double x1, double x2, double y1, double y2) {
		double a;

		a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		return a;

	}

	public double perimetrTriangle(double sideA, double sideB, double sideC) {

		double p;

		p = sideA + sideB + sideC;

		return p;
	}

	public double[] findPointMedian(double x1, double x2, double x3, double y1, double y2, double y3) {

		double[] point = new double[2];

		point[0] = (x1 + x2 + x3) / 3.0;
		point[1] = (y1 + y2 + y3) / 3.0;

		System.out.println("Координаты точки пересечения медиан x = " + point[0] + " , y = " + point[1]);

		return point;

	}

	public Triangle checkTriangle(Triangle tr1) {
		double sideA;
		double sideB;
		double sideC;

		sideA = sideOfTriangle(tr1.getX1(), tr1.getX2(), tr1.getY1(), tr1.getY2());
		sideB = sideOfTriangle(tr1.getX1(), tr1.getX3(), tr1.getY1(), tr1.getY3());
		sideC = sideOfTriangle(tr1.getX2(), tr1.getX3(), tr1.getY2(), tr1.getY3());

		if ((sideA + sideB > sideC) || (sideA + sideC > sideB) || (sideB + sideC > sideA)) {
			return tr1;
		} else {
			System.out.println("Треуголььник с такими координатами не существует!!");
			tr1 = new Triangle();
		}
		return tr1;
	}

}
