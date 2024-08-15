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
    public void showAllTasksTest() {
        todoList.addToList(tasks1);
        Assertions.assertEquals("task1 : false", TodoList.showList(TodoList.listOfTasks));
    }

    @Test
    public void searchForCompletedTasks() {
        todoList.addToList(tasks1);
        todoList.addToList(tasks2);

        Assertions.assertEquals("[task2 : true]", TodoList.searchForCompletedTasks());
        Assertions.assertNotEquals("[task1 : false]", TodoList.searchForCompletedTasks());
    }

    @Test
    public void searchNotForCompletedTasks() {
        todoList.addToList(tasks2);
        todoList.addToList(tasks1);
        Assertions.assertEquals("[task1 : false]", TodoList.searchForNotCompletedTasks());
        Assertions.assertNotEquals("[task2 : true]", TodoList.searchForNotCompletedTasks());
    }

    @Test
    public void searchForTasksTest() {
        todoList.addToList(tasks2);
        Assertions.assertEquals(null,TodoList.searchForTasks(tasks1));
        Assertions.assertEquals(tasks2,TodoList.searchForTasks(tasks2));
    }

    @Test
    public void removeTaskTest() {
        todoList.addToList(tasks1);
        Assertions.assertNotEquals(0, TodoList.listOfTasks.size());
        TodoList.removeTasks(tasks1);
        Assertions.assertEquals(0, TodoList.listOfTasks.size());
    }

    @Test
    public void changeStatusOfTask() {
        todoList.addToList(tasks1);
        Assertions.assertNotEquals(tasks1, TodoList.changeStatusOfTask(tasks1));
    }

}
