package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    static ArrayList<Tasks> listOfTasks  = new ArrayList<>();

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


        return  listOfItems;

    }

    /*public void searchForATask(Tasks task) {
        for(int i = 0; i < listOfTasks.size(); i++) {
            if(listOfTasks.get(i).equals(task)) {
                System.out.println("Found");
            }
            System.out.println("Not found");

        }

    }*/





}
