package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    static ArrayList<Tasks> listOfTasks = new ArrayList<>();

    TodoList() {
        //this.listOfTasks =
    }

    public void addToList(Tasks task) {
        System.out.println(task + "  aa");
        listOfTasks.add(task);
        System.out.println(listOfTasks.getFirst());
    }


    public static String showList(ArrayList<Tasks> listOfTasks) {
        String listOfItems = "";
        for (Tasks listOfTask : listOfTasks) {
            listOfItems += listOfTask;

        }
        System.out.println(listOfItems);
        return listOfItems;

    }

    public static String searchForCompletedTasks() {
        ArrayList<Tasks> completedTask = new ArrayList<>();
        for (Tasks listOfTask : listOfTasks) {
            if (listOfTask.isStatusForTask()) {
                completedTask.add(listOfTask);
            }


        }
        return completedTask.toString();
    }
}

