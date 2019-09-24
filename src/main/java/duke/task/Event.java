package duke.task;

import java.text.ParseException;

/**
 * The Event class represents any tasks that have a description, and an event date in nature.
 */
public class Event extends Task {
    private String date;
    private DateTime dateTime;

    /**
     * Creates an Event object, which is also a Task.
     * @param description a description of the Event Task
     * @param date the date the Event will be held on
     */
    public Event(String description, String date) {
        super(description);
        if (!DateTime.isDateFormatted(date)) {
            try {
                this.dateTime = new DateTime(date);
                this.date = this.dateTime.getDateTimeString();
            } catch (ParseException e) {
                System.err.println("Cant parse Date: " + date);
            }
        } else {
            this.date = date;
        }
    }

    /**
     * Returns a string representation of an Event object.
     * @return a string representation of an Event object
     */
    public String toString() {
        return String.format("[E][%s] %s(at: %s)",
                this.getStatusIcon(), this.description, this.date);
    }

    /**
     * Returns a string representation of the Event object to be saved
     * into the hard disk file for the Duke program.
     * @return the data representation of the Event Task
     */
    public String toData() {
        return String.format("E | %s | %s | %s",
                this.getStatusIcon(), this.description, this.date);
    }
}
