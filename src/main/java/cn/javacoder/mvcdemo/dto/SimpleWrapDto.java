package cn.javacoder.mvcdemo.dto;

import java.util.List;

public class SimpleWrapDto {
	private String name;
	private Character sex;
	private String grade;
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<SimpleDto> getList() {
		return list;
	}

	public void setList(List<SimpleDto> list) {
		this.list = list;
	}

	private List<SimpleDto> list;
}
