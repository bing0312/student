/**
 *
 */
package com.student.bean;

/**
 * @author bing_
 *
 */
public class Teacher {
	//�搶��id
	private int id	;
	//�搶�̎���
	private String teachername;
	//�搶�̎���
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
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
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
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}
	void setscore(String chinese) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
