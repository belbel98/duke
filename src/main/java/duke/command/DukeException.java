package duke.command;

/**
 * Handles any command that is not understandable by Duke.
 */
public class DukeException extends Exception {
    private static String _message = " OOPS!!! I'm sorry, but I don't know what that means :-(";
    private String _error;

    /**
     * Constructs a DukeException object.
     * @param msg the message linked to the exception.
     */
    public DukeException(String msg) {
        this._error = msg;
    }

    /**
     * Gets the error message tied to the exception found.
     * @return String Returns a string of error message for any
     * unrecognisable command for Duke.
     */
    public String getMessage() {
        return this._message;
    }
}
