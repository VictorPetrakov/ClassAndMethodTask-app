package by.htp.hometask.view;

import by.htp.hometask.bean.Student;

public class ViewStudent {

	public void printStudents(Student[] sts) {

		for (Student students : sts) {

			System.out.println(students.getSurname() + " " + students.getName() + " группа " + students.getGroup());
		}
	}
}
