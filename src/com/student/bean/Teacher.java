/**
 *
 */
package com.student.bean;

/**
 * @author bing_
 *
 */
public class Teacher {
	//先生のid
	private int id	;
	//先生の氏名
	private String teachername;
	//先生の授業
	private String course	;
	/**
	 * @param id
	 * @param teachername
	 * @param course
	 */
	public Teacher(int id, String teachername, String course) {
		this.setId(id);
		this.setTeachername(teachername);
		this.setCourse(course);
	}
	/**
	 *
	 */
	public Teacher() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setscore1(String chinese) {
		// TODO 自動生成されたメソッド・スタブ

	}
	void setscore(String chinese) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
