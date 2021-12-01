/** This class contains the list of predifined todos to display and also three methods to addtodos , delete a todo, and retrive the available todo **/
package com.learn.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
private static List<todo> todos=new ArrayList();
static
{
	todos.add(new todo("Learn web application"));
	todos.add(new todo("Learn Spring"));
	todos.add(new todo("Learn Spring MVC"));
	
}
/**
 * @return the todos
 */
public static List<todo> getTodos() {
	return todos;
}

public static void addTodos(String newtodo){
	todos.add(new todo(newtodo));
}
public static void deleteTodos(todo newtodo) {
	todos.remove(newtodo);
}


}
