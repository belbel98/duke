/**
 * The ToDo class handles all Todo Tasks,
 * which usually includes a description of the ToDo task.
 */
public class ToDo extends Task {

    /**
     * Creates a ToDo object which is also a Task.
     * @param desc Description of the ToDo Task.
     */
    public ToDo(String desc) {
        super(desc);
    }

    /**
     * Returns a string representation of a ToDo object.
     * @return String Returns a string representation of a ToDo object.
     */
    public String toString() {
        String t = String.format("[T][%s]%s",
                this.getStatusIcon(), this.description);
        return t;
    }
}
