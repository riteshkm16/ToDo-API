package com.example.projects.springboot.todo.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


import com.example.projects.springboot.todo.modals.Todo;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();

	private static int todoCount = 1;



	static {
		todos.add(new Todo(1, "user", "Learn Java(By Default todo)", new Date(),false));
	}





	/////////////////////////////////////////////////



	public String getDefault()
	{
		return "This is Simple TODO API";
	}


	public String getDocs()
	{
		return "Documentation here";
	}

	public String getInitialized()
	{
		return "initialize";
	}

	public List<Todo> getTodosByUser(String user)
	{
		List<Todo> Todos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUsername().equals(user))
				Todos.add(todo);
		}
		return Todos;
	}

	public String addTodo(Todo todo)
	{
		System.out.println("\n"+todo);

		Todo savedTodo=new Todo();
		savedTodo.setId(++todoCount);
		savedTodo.setUsername(todo.getUsername());
		savedTodo.setDescribe(todo.getDescribe());
		savedTodo.setDone(false);
		savedTodo.setTargetDate(new Date());
		if(todos.add(savedTodo))	
			return "success 200";
		else
			return "failure";
	}   

	public String editTodo(Todo todo)
	{

		
			
		return "yet to come";
	}   

	public String deleteTodo(String id )
	{
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId()==Integer.parseInt(id)) {
				iterator.remove();
			}
		}

		return "";
	}

	public Todo getTodoById(String id )
	{
		Todo todoo=null;
		for (Todo todo : todos) {
			if (todo.getId()==Integer.parseInt(id))
			{
				todoo=todo;
				break;
			}
		}
		return todoo;
	}




}
