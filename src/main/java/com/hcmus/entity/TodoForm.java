package com.hcmus.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;

public class TodoForm {
	@NotBlank
	private String title;
	
	private Date dueDate;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
}
