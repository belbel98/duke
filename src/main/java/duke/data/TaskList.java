package duke.data;

import duke.task.Task;

import java.util.ArrayList;

/**
 * Manages the list of tasks that the user has added.
 */
public class TaskList {
    private ArrayList<Task> _tasks;

    /**
     * Creates a new TaskList object.
     */
    public TaskList() {
        this._tasks = new ArrayList<>();
    }

    /**
     * Creates a new TaskList object by importing an old TaskList.
     * @param taskList an existing TaskList object, which is to be imported into new TaskList.
     */
    public TaskList(TaskList taskList) {
        this._tasks = taskList.getList();
    }

    /**
     * Adds a Task object to the current TaskList.
     * @param task the Task object that is to be added
     */
    public void addTask(Task task) {
        this._tasks.add(task);
    }

    /**
     * Removes the Task with the given index from the current TaskList.
     * @param index the index number of the Task to be removed from the list
     */
    public void removeTask(int index) {
        this._tasks.remove(index);
    }

    /**
     * Marks the Task with the given index from the current TaskList.
     * @param index the index number of the Task to be marked as done
     */
    public void markTaskAsDone(int index) {
        this._tasks.get(index).markAsDone();
    }

    /**
     * Gets the Task object with the given index index number from the list.
     * @param index the index number of the Task
     * @return the Task object with the given index
     */
    public Task getTask(int index) {
        return this._tasks.get(index);
    }

    /**
     * Gets the size of the current TaskList.
     * @return the number of tasks in the TaskList
     */
    public int getSize() {
        return this._tasks.size();
    }

    /**
     * Gets an ArrayList of the Task objects.
     * @return an ArrayList of the Task objects
     */
    public ArrayList<Task> getList() {
        return this._tasks;
    }
}
