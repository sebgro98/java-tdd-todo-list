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
        //return  listOfTasks;
    }


    public static String showList(ArrayList<Tasks> listOfTasks) {
        StringBuilder listOfItems = new StringBuilder();
        for (Tasks listOfTask : listOfTasks) {
            listOfItems.append(listOfTask);

        }
        System.out.println(listOfItems);
        return listOfItems.toString();

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

    public static String searchForNotCompletedTasks() {
        ArrayList<Tasks> notCompletedTask = new ArrayList<>();
        for (Tasks listOfTask : listOfTasks) {
            if (!(listOfTask.isStatusForTask())) {
                notCompletedTask.add(listOfTask);
            }


        }
        return notCompletedTask.toString();
    }

    public static Tasks searchForTasks(Tasks task) {

        for (Tasks listOfTask : listOfTasks) {
            if(task.equals(listOfTask)) {
                return task;
            }
        }
        System.out.println("Your task did not exist");
        return null;
    }

    public static void removeTasks(Tasks task) {
        for (Tasks listOfTask : listOfTasks) {
            if(task.equals(listOfTask)) {
                listOfTasks.remove(listOfTask);
            }
        }
    }

}

