package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    static ArrayList<Tasks> listOfTasks  = new ArrayList<>();

    TodoList() {
       //this.listOfTasks =
    }

    public void addToList(Tasks task) {
        //Tasks tasks = new Tasks(task);
        //tasks.setTask(task);
        //tasks.setStatusForTask(statusForTask);
        listOfTasks.add(task);
        //searchForATask("task1");
        System.out.println(listOfTasks.getFirst());
    }

    /*public void searchForATask(String name) {
        for(int i = 0; i < listOfTasks.size(); i++) {
            if(listOfTasks.get(i).(name)) {
                System.out.println("Found");
            }
            System.out.println("Not found");

        }

    } */





}
