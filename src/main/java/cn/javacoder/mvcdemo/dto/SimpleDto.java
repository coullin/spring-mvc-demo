package cn.javacoder.mvcdemo.dto;

public class SimpleDto {
	private String cname;
	private int score;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public SimpleDto() {
	}
	
	public SimpleDto(String cname, int score) {
		super();
		this.cname = cname;
		this.score = score;
	}

}
