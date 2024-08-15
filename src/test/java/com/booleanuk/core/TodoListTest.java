package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    TodoList todoList;
    TodoListTest() {
        todoList = new TodoList();
    }
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskTest() {
        Assertions.assertEquals(todoList.tasks.size() + 1, todoList.addToList(Task task));
    }


}
