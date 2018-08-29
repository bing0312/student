/**
 *
 */
package com.student.bean;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author a
 *
 */
public class PrintStudent {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student studentOne = new Student();
		studentOne.setAge(10000);
		studentOne.setBirthday("1979-60-30");
		studentOne.setClassid(6);
		studentOne.setId(16);
		studentOne.setName("張勇");
		studentOne.setScore(100);
		studentOne.setAddress("tokyo");


		// int id, String name, String birthday, int age, int score, int classid
		// id name birthday age score classid
		// 2 qian 2007/06/05 10 80 1 ​​
		Student studentTwo = new Student(2, "qian", "2007-06-05", 100, 80, 1,123456,"tokyo");

		Student studentThree = new Student(3, "sun", "2007-06-05", 1000, 80, 1,25647,"tokyo");
		Student studentFour = new Student(4, "qian", "2007-06-05", 99, 80, 1,36578,"tokyo");
		Student studentFive = new Student(5, "hua", "2012-03-06", 85, 80, 1,54789,"tokyo");
		Student studentSix = new Student(6, "lin", "2007-06-09", 26, 80, 1,67784,"tokyo");
		Student studentSeven = new Student(7, "ai", "2006-03-15", 2000, 80,1,165789,"tokyo");
		Student studentEight = new Student(8, "sala", "2013-02-10", 386, 80, 1,69785,"tokyo");
		Student studentNine = new Student(9, "huang", "2015-05-14", 78, 80, 1,657841,"tokyo");

		// map
		//key,value
		HashMap<String, Student> Studentmap = new HashMap<String, Student>();
		Studentmap.put("1", studentOne);
		Studentmap.put("2", studentTwo);
		Studentmap.put("3", studentThree);
		Studentmap.put("4", studentFour);
		Studentmap.put("5", studentFive);
		Studentmap.put("6", studentSix);
		Studentmap.put("7", studentSeven);
		Studentmap.put("8", studentEight);
		Studentmap.put("9", studentNine);

		System.out.println("学生の年齢の平均値：" + averAgeStudentMap(Studentmap));
		System.out.println("学生の年齢の最大値：" + maxAgeStudentMap(Studentmap));
		System.out.println("学生の年齢の最小値：" + minAgeStudentMap(Studentmap));

		// list
		// ArrayList<型> 変数名 = new ArrayList<型>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(studentOne);
		studentList.add(studentTwo);
		studentList.add(studentThree);
		studentList.add(studentFour);
		studentList.add(studentFive);
		studentList.add(studentSix);
		studentList.add(studentSeven);
		studentList.add(studentEight);
		studentList.add(studentNine);


		System.out.println("学生の年齢の平均値：" + averAgeStudentList(studentList));
		System.out.println("学生の年齢の最大値：" + maxAgeStudentList(studentList));
		System.out.println("学生の年齢の最小値：" + minAgeStudentList(studentList));
		System.out.println("学生の年齢の平均値：" + averAgeStudentList(studentList));
		System.out.println("学生の年齢の最大値：" + maxAgeStudentList(studentList));
		System.out.println("学生の年齢の最小値：" + minAgeStudentList(studentList));

	}

	/**
	 *
	 * @param studentOne（student
	 *            クラス） return なし
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
	 * 学生の情報をhashmapで印刷する
	 *
	 * @param Studet
	 *            hashmap return 学生年齢の平均値
	 *
	 */
	private static void printstudentbymap(HashMap<String, Student> stuMap) {

		// foreach（拡張for文）での書き方
		for (Student stu : stuMap.values()) {
			// 学生の年齢を取り出して、合計する
			System.out.println(stu);
		}

		// 学生年齢の平均値を返す

	}

	/**
	 * 学生年齢の最大値を算出する
	 *
	 * @param Studet
	 *            hashmap return 学生年齢の最大値
	 *
	 */
	private static int maxAgeStudentMap(HashMap<String, Student> stuMap) {

		int max = 0;

		// foreach（拡張for文）での書き方
		for (Student stu : stuMap.values()) {
			if (max < stu.getAge()) { // 最大値
				max = stu.getAge();
			}
			System.out.println(stu);
		}
		// 学生年齢の最大値を返す
		return max;

	}

	/**
	 * 学生年齢の平均値を算出する
	 *
	 * @param Studet
	 *            hashmap return 学生年齢の平均値
	 *
	 */
	private static int averAgeStudentMap(HashMap<String, Student> stuMap) {

		// foreach（拡張for文）での書き方
		int sum = 0;

		for (Student stu : stuMap.values()) {
			// 学生の年齢を取り出して、合計する
			sum = sum + stu.getAge();
			System.out.println(stu);
		}
		return sum / stuMap.size();

		// 学生年齢の平均値を返す

	}

	/**
	 * 学生年齢の最小値を算出する
	 *
	 * @param Studet
	 *            hashmap return 学生年齢の最小値
	 *
	 */
	@SuppressWarnings("unused")

	private static int minAgeStudentMap(HashMap<String, Student> stuMap) {

		int min = stuMap.get("1").getAge();

		// foreach（拡張for文）での書き方
		for (Student stu : stuMap.values()) {

			if (min > stu.getAge()) {
				// 最小値
				System.out.println("min:" + min);
				min = stu.getAge();
				System.out.println("stu.getAge():" + stu.getAge());
			}

		}
		// 学生年齢の最小値を返す
		return min;

	}

	/**
	 *
	 * @param studentList
	 * @return学生の年齢の最小値
	 */
	private static int minAgeStudentList(ArrayList<Student> studentList) {
		// TODO 自動生成されたメソッド・スタブ
		// foreach（拡張for文）での書き方
		int min = studentList.get(0).getAge();

		// 学生の1個ずつ取り出す
		for (Student stu : studentList) {

			// 学生の1個ずつ渡してPrintStudentメソッドを呼び出し、表示処理
			if (min > stu.getAge()) {
				min = stu.getAge();
			}
		}
		return min;
	}
/**
 *
 * @param studentList
 * @return学生の年齢の最大値
 */
	private static int maxAgeStudentList(ArrayList<Student> studentList) {
		// TODO 自動生成されたメソッド・スタブ
		// foreach（拡張for文）での書き方
		int max = 0;

		// 学生の1個ずつ取り出す
		for (Student stu : studentList) {

			// 学生の1個ずつ渡してPrintStudentメソッドを呼び出し、表示処理
			if (max < stu.getAge()) {
				max = stu.getAge();
			}
		}
		return max;
	}

	private static int averAgeStudentList(ArrayList<Student> studentList) {
		// TODO 自動生成されたメソッド・スタブ
				// foreach（拡張for文）での書き方
				int sum = 0;

				// 学生の1個ずつ取り出す
				for (Student stu : studentList) {

					// 学生の1個ずつ渡してPrintStudentメソッドを呼び出し、表示処理
			sum=sum+stu.getAge();
				}
				return sum/studentList.size();
	}

	/**
	 * 学生の1個ずつ渡してPrintStudentメソッドを呼び出し、表示処理
	 *
	 * @param studentList
	 */
	private static void printstudentbyList(ArrayList<Student> studentList) {

		// foreach（拡張for文）での書き方
		// 学生の1個ずつ取り出す
		for (Student value : studentList) {

			// 学生の1個ずつ渡してPrintStudentメソッドを呼び出し、表示処理
			PrintStudent(value);
		}

	}
}