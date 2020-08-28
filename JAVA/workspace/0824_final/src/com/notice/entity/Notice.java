package com.notice.entity;

import java.util.Date;

public class Notice {//모델 클래스
	private int no;
	private String title;
	private String content;
	private String name;
	private String writeday;

	public Notice() {}

	public Notice(int no, String title, String content, String name, String writeday) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.name = name;
		this.writeday = writeday;
	}

	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the writeday
	 */
	public String getWriteday() {
		return writeday;
	}

	/**
	 * @param writeday the writeday to set
	 */
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}

	@Override
	public String toString() {
		return "Notice [no=" + no + ", title=" + title + ", content=" + content + ", name=" + name + ", writeday="
				+ writeday + "]";
	}
	
	
	
	
	
}
