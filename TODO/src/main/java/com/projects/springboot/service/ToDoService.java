package com.projects.springboot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.projects.springboot.modals.ToDo;

@Service
public class ToDoService {
	
	private static List <ToDo> toDos=new ArrayList<>(); 
	private static int toDoCount=0;
	
	public List<ToDo> retrieveToDos(String user)
	{
		List <ToDo> toDosForUser=new ArrayList <>();
		for(ToDo toDo:toDos)
		{
			if(toDo.getUserName().equals(user)){
				toDosForUser.add(toDo);
			}
		}
		return toDosForUser;
	}
	
	public String addToDo(ToDo toDo)
	{
		toDo.setToDoId(++toDoCount);
		if(toDos.add(toDo))
		{
			return "ToDo inserted succeessfully";
		}
		else
			return "Error in adding ToDo";		
	}
	
	
	public String deleteToDo(int id)
	{
		Iterator<ToDo> iterator=toDos.iterator();
		while(iterator.hasNext()) {
			ToDo toDo=iterator.next();
			if(toDo.getToDoId()==id)
			{
				iterator.remove();
				return "ToDo deleted successfully";
			}
		}
		return "Record not found";
	}
	
	
	
	
	
	
	
	
}
