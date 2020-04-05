package by.htp.hometask.main;

import by.htp.hometask.bean.Student;
import by.htp.hometask.logic.StudentLogic;
import by.htp.hometask.view.ViewStudent;

public class StudentDemo {

	public static void main(String[] args) {
		int size;

		size = 10;

		Student[] student = new Student[size];

		student[0] = new Student("Ivan", "Ivanov", 65, new int[] { 5, 6, 10, 9, 8 });
		student[1] = new Student("Petr", "Petrov", 45, new int[] { 9, 9, 10, 9, 8 });
		student[2] = new Student("Ivan", "Letov", 31, new int[] { 5, 6, 10, 9, 8 });
		student[3] = new Student("Alexandr", "Semenov", 65, new int[] { 5, 6, 10, 9, 8 });
		student[4] = new Student("Svetlana", "Lubimova", 80, new int[] { 10, 9, 10, 9, 9 });
		student[5] = new Student("Anna", "Fialkova", 12, new int[] { 10, 10, 10, 9, 10 });
		student[6] = new Student("Stepan", "Lesnoy", 65, new int[] { 8, 10, 10, 9, 8 });
		student[7] = new Student("Roman", "Krukov", 45, new int[] { 3, 6, 10, 7, 8 });
		student[8] = new Student("Vladislav", "Kazanik", 65, new int[] { 4, 6, 10, 9, 8 });
		student[9] = new Student("Anton", "Korotkiy", 45, new int[] { 10, 10, 10, 9, 10 });
		
		StudentLogic stlogic = new StudentLogic();
		ViewStudent stview = new ViewStudent();

		stview.printStudents(stlogic.findALevelStudent(student));
	}

}
