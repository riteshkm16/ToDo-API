package com.example.projects.springboot.todo.modals;

import java.util.Date;

public class Todo {

	private int id;
	private String username;
	private String describe;
	private Date targetDate;
	private boolean isDone;

	public Todo()
	{
		
	}

	public Todo(int id, String username, String describe, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.describe = describe;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", describe=" + describe + ", targetDate=" + targetDate
				+ ", isDone=" + isDone + "]";
	}

	public boolean eauals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Todo other=(Todo)obj;
		if(id!=other.id)
			return false;
		return true;

	}

}
