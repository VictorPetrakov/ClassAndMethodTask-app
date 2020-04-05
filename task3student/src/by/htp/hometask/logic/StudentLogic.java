package by.htp.hometask.logic;

import by.htp.hometask.bean.Student;

public class StudentLogic {

	public Student[] findALevelStudent(Student[] student) {

		Student[] aLevelStudent = new Student[student.length];

		int i = 0;
		for (Student students : student) {

			if (isAStudent(students)) {

				aLevelStudent[i] = students;
				i++;
			}
		}
		if (i == student.length) {
			return aLevelStudent;
		}

		Student[] result = new Student[i];

		for (i = 0; i < result.length; i++) {
			result[i] = aLevelStudent[i];
		}

		return result;
	}

	public static boolean isAStudent(Student st) {

		int[] marks;
		marks = st.getMarks();

		for (int mark : marks) {
			if (mark != 9 && mark != 10) {
				return false;
			}
		}
		return true;

	}

}
