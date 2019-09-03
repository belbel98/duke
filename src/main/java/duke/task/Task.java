package duke.task;

/**
 * Task is an abstract class that handles its conctrete subclasses,
 * ToDo, Deadline, and Event.
 *
 * A Task can have a status which can be marked as done, a method to
 * get its status icon and description, as well as its String representation.
 */
public abstract class Task {
    protected String _description;
    protected boolean _isDone;

    /**
     * Constructs a Task object (which cannot be initialised on its own)
     * @param description a Description of the Task.
     */
    public Task(String description) {
        this._description = description;
        this._isDone = false;
    }

    /**
     * Gets the status icon of the Task, of whether it has been marked
     * as done or not.
     * @return Returns a "O" representing a Task that is marked done,
     * and a "X" if a Task is not marked as done.
     */
    public final String getStatusIcon() {
        return (_isDone ? "O" : "X");
    }

    /**
     * Marks the Task as done.
     */
    public final void markAsDone() {
        this._isDone = true;
    }

    /**
     * Gets the Description of the Task Object.
     * @return String Returns a description of the current Task.
     */
    public final String getDesc() {
        return this._description;
    }

    /**
     * Returns a string representation of the Task object
     * @return String Returns a String representation of the Task object.
     */
    @Override
    public abstract String toString();

    /**
     * Returns a string representation of the Task object to be saved
     * into the hard disk file for the Duke program.
     * @return String Returns a the data representation of the Task.
     */
    public abstract String toData();
}