package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    TodoList todoList = new TodoList();;
    Tasks tasks1;
    Tasks tasks2;

    TodoListTest() {
        this.tasks1 = new Tasks("task1", false);
        this.tasks2 = new Tasks("task2", true);


    }
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskTest() {
        todoList.addToList(tasks1);
        Assertions.assertEquals(1, TodoList.listOfTasks.size());
        Assertions.assertTrue(TodoList.listOfTasks.contains(tasks1));
        Assertions.assertFalse(TodoList.listOfTasks.contains(tasks2));
    }

    @Test
    public void showTasksTest() {
        todoList.addToList(tasks1);
        Assertions.assertEquals("task1 : false", TodoList.showList(TodoList.listOfTasks));
    }

    @Test
    public void searchForCompletedTasks() {
        todoList.addToList(tasks1);
        Assertions.assertEquals("[task2 : true]", TodoList.searchForCompletedTasks());
    }


}
