/**
 *
 */
package com.student.bean;

/**
 * @author bing_ student��Bean�N���X
 *
 */
public class Student { // id
	private int id;
	//
	private String name;
	// ���N����
	private String birthday;
	// �N��
	private int age;
	// ����
	private double score;
	// ����id
	private int classid;

	private int mynumber;

	private String address;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score セットする score
	 */
	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * @return classid
	 */
	public int getClassid() {
		return classid;
	}

	/**
	 * @param classid セットする classid
	 */
	public void setClassid(int classid) {
		this.classid = classid;
	}

	/**
	 * @return mynumber
	 */
	public int getMynumber() {
		return mynumber;
	}

	/**
	 * @param mynumber セットする mynumber
	 */
	public void setMynumber(int mynumber) {
		this.mynumber = mynumber;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param string セットする address
	 */
	public void setAddress(String string) {
		this.address = string;
	}

	/**
	 * @param id
	 * @param name
	 * @param birthday
	 * @param age
	 * @param score
	 * @param classid
	 * @param mynumber
	 * @param address
	 */
	public Student(int id, String name, String birthday, int age, double score, int classid, int mynumber,
			String address) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.score = score;
		this.classid = classid;
		this.mynumber = mynumber;
		this.address = address;
	}

	/**
	 *
	 */
	public Student() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + ", score=" + score
				+ ", classid=" + classid + ", mynumber=" + mynumber + ", address=" + address + "]";
	}


}
