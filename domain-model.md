| Classes  | Variables                | Methods                                          | Scenarios                                                                                       | Outcomes                                                             |
|----------|--------------------------|--------------------------------------------------|-------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| TodoList | `ArrayList<Tasks> tasks` | `ArrayList<Tasks> addToList(Task task)`          | I want to add tasks to my todo list.                                                            | return that the item has been added to the list                      | // notes - Check if the size got bigger and that it contains the new added item
|          |                          |                                                  |                                                                                                 | Return that it was not possible to add the item to the list          |
|          |                          | `ArrayList<Tasks> showList()`                    | I want to see all the tasks in my todo list.                                                    | Return what contains in the array                                    |
|          |                          | `ArrayList<Tasks> searchForCompletedTasks()`     | I want to be able to get only the complete tasks.                                               | Return all the completed tasks                                       |
|          |                          | `ArrayList<Tasks> searchForNotCompletedTasks()`  | I want to be able to get only the incomplete tasks                                              | Return all the incompleted tasks                                     |
|          |                          | `boolean searchForATask(ArrayList<Task>)`        | I want to search for a task and receive a message that says it wasn't found if it doesnt exist. | return true or false if it exsists or not and the status of the task |
|          |                          | `ArrayList<Tasks> removeTask(Task task)`         | I want to remove tasks from my list                                                             | returns that the taks got deleted                                    |
|          |                          | `ArrayList<Tasks> alphAcending()`                | I want to see all the tasks in my list ordered alphabetically in ascending order                | Returns the list in ascending order                                  |
|          |                          | `ArrayList<Tasks> alphDecending()`               | I want to see all the tasks in my list ordered alphabetically in descending order               | Returns the list in decending                                        |
|          |                          |                                                  |                                                                                                 |                                                                      |
| Tasks    | `String task`            | `String getTask()`                               |                                                                                                 | Returns the tasks                                                    |
|          | `boolean statusForTask`  | `Boolean getDoneWithTask()`                      |                                                                                                 | Returns if the task is done or not                                   |
|          |                          | `String setTask(String task)`                    |                                                                                                 | Sets the task variable                                               |
|          |                          | `boolean setDoneWithTask(boolean statusForTask)` |                                                                                                 | Sets the boolean variable                                            |
|          |                          |                                                  |                                                                                                 |                                                                      |
|          |                          |                                                  |                                                                                                 |                                                                      |
|          |                          |                                                  |                                                                                                 |                                                                      |
|          |                          |                                                  |                                                                                                 |                                                                      |


I want to add tasks to my todo list.
I want to see all the tasks in my todo list.
I want to change the status of a task between incomplete and complete.
I want to be able to get only the complete tasks.
I want to be able to get only the incomplete tasks.
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
I want to remove tasks from my list.
I want to see all the tasks in my list ordered alphabetically in ascending order.
I want to see all the tasks in my list ordered alphabetically in descending order