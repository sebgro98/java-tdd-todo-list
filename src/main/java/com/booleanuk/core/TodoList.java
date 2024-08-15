package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TodoList {

    ArrayList<Tasks> listOfTasks = new ArrayList<>();

    public void addToList(Tasks task) {
        listOfTasks.add(task);

    }


    public String showList(ArrayList<Tasks> listOfTasks) {
        StringBuilder listOfItems = new StringBuilder();
        for (Tasks listOfTask : listOfTasks) {
            listOfItems.append(listOfTask);

        }
        System.out.println(listOfItems);
        return listOfItems.toString();

    }

    public String searchForCompletedTasks() {
        ArrayList<Tasks> completedTask = new ArrayList<>();
        for (Tasks listOfTask : listOfTasks) {
            if (listOfTask.isStatusForTask()) {
                completedTask.add(listOfTask);
            }


        }
        return completedTask.toString();
    }

    public String searchForNotCompletedTasks() {
        ArrayList<Tasks> notCompletedTask = new ArrayList<>();
        for (Tasks listOfTask : listOfTasks) {
            if (!(listOfTask.isStatusForTask())) {
                notCompletedTask.add(listOfTask);
            }


        }
        return notCompletedTask.toString();
    }

    public Tasks searchForTasks(Tasks task) {

        for (Tasks listOfTask : listOfTasks) {
            if(task.equals(listOfTask)) {
                return task;
            }
        }
        System.out.println("Your task did not exist");
        return null;
    }

    public void removeTasks(Tasks task) {
        listOfTasks.removeIf(listOfTask -> listOfTask.equals(task));
    }

    public String changeStatusOfTask(Tasks task) {

        for (Tasks listOfTask : listOfTasks) {
            if(task.equals(listOfTask)) {
                if(!listOfTask.isStatusForTask()) {
                    listOfTask.setStatusForTask(true);
                } else listOfTask.setStatusForTask(false);
            }
            }

        return task.toString();
    }

    public String alphAscending(ArrayList<Tasks> tasks) {
        listOfTasks.sort((task1, task2) -> task1.getTask().compareToIgnoreCase(task2.getTask()));
        
        return tasks.toString();
    }

    public String alphDecending(ArrayList<Tasks> tasks) {
        listOfTasks.sort((task1, task2) -> task1.getTask().compareToIgnoreCase(task2.getTask()));
        Collections.reverse(listOfTasks);
        return tasks.toString();
    }

}

