package com.booleanuk.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TodoListTest {
    TodoList todoList;
    Tasks tasks1;
    Tasks tasks2;
    Tasks tasks3;
    Tasks tasks4;


    TodoListTest() {
        todoList = new TodoList();
        tasks1 = new Tasks("task1", false);
        tasks2 = new Tasks("task2", true);
        tasks3 = new Tasks("task3", true);
        tasks4 = new Tasks("task4", true);
    }

    @Test
    public void addTaskTest() {
        todoList.addToList(tasks1);
        Assertions.assertEquals(1, todoList.listOfTasks.size());
        Assertions.assertTrue(todoList.listOfTasks.contains(tasks1));
        Assertions.assertFalse(todoList.listOfTasks.contains(tasks2));
    }

    @Test
    public void showAllTasksTest() {
        todoList.addToList(tasks1);
        Assertions.assertEquals("task1 : false", todoList.showList(todoList.listOfTasks));
    }

    @Test
    public void searchForCompletedTasksTest() {
        todoList.addToList(tasks1);
        todoList.addToList(tasks2);
        Assertions.assertEquals("[task2 : true]", todoList.searchForCompletedTasks());
        Assertions.assertNotEquals("[task1 : false]", todoList.searchForCompletedTasks());
    }

    @Test
    public void searchNotForCompletedTasksTest() {
        todoList.addToList(tasks2);
        todoList.addToList(tasks1);
        Assertions.assertEquals("[task1 : false]", todoList.searchForNotCompletedTasks());
        Assertions.assertNotEquals("[task2 : true]", todoList.searchForNotCompletedTasks());
    }

    @Test
    public void searchForTasksTest() {
        todoList.addToList(tasks2);
        Assertions.assertNull(todoList.searchForTasks(tasks1));
        Assertions.assertEquals(tasks2, todoList.searchForTasks(tasks2));
    }

    @Test
    public void removeTaskTest() {
        todoList.addToList(tasks1);
        Assertions.assertNotEquals(0, todoList.listOfTasks.size());
        todoList.removeTasks(tasks1);
        Assertions.assertEquals(0, todoList.listOfTasks.size());
    }

    @Test
    public void changeStatusOfTaskTest() {
        todoList.addToList(tasks1);
        todoList.addToList(tasks2);
        Assertions.assertNotEquals(tasks1.toString(), todoList.changeStatusOfTask(tasks1)); // change to true
        Assertions.assertNotEquals(tasks2.toString(), todoList.changeStatusOfTask(tasks2)); // change to false
    }

    @Test
    public void alphAscendingTest() {
        todoList.addToList(tasks1);
        todoList.addToList(tasks2);
        todoList.addToList(tasks3);
        todoList.addToList(tasks4);
        Assertions.assertEquals(todoList.listOfTasks.toString(), todoList.alphAscending(todoList.listOfTasks));
    }

    @Test
    public void alphDescendingTest() {
        todoList.addToList(tasks4);
        todoList.addToList(tasks3);
        todoList.addToList(tasks2);
        todoList.addToList(tasks1);
        Assertions.assertEquals(todoList.listOfTasks.toString(), todoList.alphDecending(todoList.listOfTasks));
    }
}
