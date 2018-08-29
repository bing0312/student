/**
 *
 */
package com.student.bean;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author bing_
 *
 */
public class Printteacher {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student studentOne = new Student(1, "zhao", "2018-10-05", 9, 95, 1,123456,"tokyo");
		Student studentTwo = new Student(2, "qian", "2007-06-05", 10, 80, 1,123456,"tokyo");
		Student studentThree = new Student(3, "sun", "2009-01-05", 10, 80, 1,25647,"tokyo");
		Student studentFour = new Student(4, "liu", "2009-04-05", 10, 80, 1,36578,"tokyo");
		PrintStudent(studentOne);
		PrintStudent(studentTwo);
		PrintStudent(studentThree);
		PrintStudent(studentFour);
		// list and map
		// ArrayList<�^> �ϐ��� = new ArrayList<�^>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(studentOne);
		studentList.add(studentTwo);
		studentList.add(studentThree);
		studentList.add(studentFour);

		System.out.println(studentList.get(0).getName());
		System.out.println(studentList.get(1).getName());
		System.out.println(studentList.get(2).getName());
		System.out.println(studentList.get(3).getName());

		// foreach()
		for (Student value : studentList)

		{
			PrintStudent(value);
		}

		// key,value
		HashMap<String, Student> Studentmap = new HashMap<String, Student>();
		Studentmap.put("1", studentOne);
		Studentmap.put("2", studentTwo);
		Studentmap.put("3", studentThree);
		Studentmap.put("4", studentFour);

		PrintStudent(Studentmap.get("1"));
		PrintStudent(Studentmap.get("2"));
		PrintStudent(Studentmap.get("3"));
		PrintStudent(Studentmap.get("4"));

		for (Student stu : Studentmap.values()) {
			PrintStudent(stu);
		}

		System.out.print(averAgeStudent(Studentmap));
		System.out.print(averAgeStudent(studentList));

	}

	/**
	 * �w���̏����������
	 *
	 * @param Student
	 *            return
	 */
	private static void PrintStudent(Student stu) {
		System.out.println(stu.getAge());
		System.out.println(stu.getBirthday());
		System.out.println(stu.getClassid());
		System.out.println(stu.getName());
		System.out.println(stu.getScore());
		System.out.println(stu.getId());
	}

	/**
	 * �w���N��̕��ϒl
	 *
	 * @param Student
	 *            hashmap
	 *
	 */
	private static int averAgeStudent(HashMap<String, Student> stuMap) {
		int sum = 0;
		// foreach(�gfor���j�ł̏�����
		for (Student stu : stuMap.values()) {
			// �w���̔N������o���āA���v����
			sum = sum + stu.getAge();
		}
		return sum / 4;
	}

	/**
	 * �w�����т̕��ϒl
	 *
	 * @param Student
	 *            hashmap
	 *
	 */
	private static int averScoreStudent(HashMap<String, Student> stuMap) {
		int sum = 0;
		// foreach(�gfor���j�ł̏�����
		for (Student stu : stuMap.values()) {
			// �w���̔N������o���āA���v����
			sum = (int) (sum + stu.getScore());

		}
		return sum / 4;
	}

	/**
	 * �w���N��̕��ϒl
	 *
	 * @param Student
	 *            hashmap
	 *
	 */
	private static int averAgeStudent(ArrayList<Student> stuList) {
		int sum = 0;
		// foreach(�gfor���j�ł̏�����
		for (Student stu : stuList) {
			// �w���̔N������o���āA���v����
			sum = sum + stu.getAge();
		}
		return sum / 4;
	}

}
