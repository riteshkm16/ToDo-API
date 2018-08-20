package com.projects.springboot.modals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToDo {

	private int toDoId;
	private String userName;
	private String title;
	private String content;
	private Date creationDate;
	private boolean isDone;
	
	
	
	public int getToDoId() {
		return toDoId;
	}
	public void setToDoId(int toDoId) {
		this.toDoId = toDoId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

}
