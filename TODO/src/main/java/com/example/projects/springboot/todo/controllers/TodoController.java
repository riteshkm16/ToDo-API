package com.example.projects.springboot.todo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projects.springboot.todo.modals.Todo;
import com.example.projects.springboot.todo.services.TodoService;




@RestController
@RequestMapping("/api.todo")
public class TodoController {

	@Autowired
	private TodoService todoService;


	@GetMapping(value="/")
	public String getDefault()
	{
		return todoService.getDefault();
	}


	@GetMapping(value="/docs")
	public String getDocs()
	{
		return todoService.getDocs();
	}

	@GetMapping(value="/init")
	public String getInitialized()
	{
		return todoService.getInitialized();
	}

	@GetMapping(value="/name/{user}")
	public List<Todo> getTodosByUser(@PathVariable String user)
	{
		return todoService.getTodosByUser(user);
	}

	@ResponseBody
	@RequestMapping(value = "/add", headers = {"content-type=application/json" }, 
	consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public String addTodo(@RequestBody Todo todo)
	{
		System.out.println("\n"+todo);
		return todoService.addTodo(todo);
	}   

	@ResponseBody
	@RequestMapping(value = "/edit", headers = {"content-type=application/json" }, 
	consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public String editTodo(@RequestBody Todo todo)
	{
		System.out.println("\n"+todo);
		return todoService.editTodo(todo);	
	}   

	@GetMapping(value="/delete/{id}")
	public String deleteTodo(@PathVariable String id )
	{
		return todoService.deleteTodo(id);	
	}

	@GetMapping(value="/get/{id}")
	public Todo getTodoById(@PathVariable String id )
	{
		return todoService.getTodoById(id);
	}
	
}