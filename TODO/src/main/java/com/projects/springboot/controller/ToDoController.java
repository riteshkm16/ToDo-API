package com.projects.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projects.springboot.modals.ToDo;
import com.projects.springboot.service.ToDoService;

@Controller
public class ToDoController {

	@Autowired
	private ToDoService toDoService;
	
	@RequestMapping("/User/{UserName}")
	public List<ToDo> getToDoListForUser(String User)
	{
		return toDoService.retrieveToDos(User);	
	}
	
	@RequestMapping("/home")
	public String sayHello() {
		return "Hello ToDo Api";
	}
	
	
}
