package duke.task;

public class DeadlineException extends Exception{
    private static String _noDesc = " OOPS!!! The description of a deadline cannot be empty.";
    private static String _noDate = " OOPS!!! The date of a deadline cannot be empty.";
    private static String _either = " OOPS!!! The description or date of an event cannot be empty.";
    private String _error;
    private int _type; // 1 = empty desc, 2 = no date, 3 = either

    /**
     * Constructs a EventException object.
     * @param msg the message linked to the exception.
     * @param type the type of error that is to be handled in this class.
     */
    public DeadlineException(String msg, int type) {
        this._error = msg;
        this._type = type;
    }

    /**
     * Gets the error message tied to the exception found.
     * @return String Returns a string of error message for the exception
     * found in the Deadline object.
     */
    public String getMessage() {
        if (this._type == 1) {
            return _noDesc;
        } else if (this._type == 2){
            return _noDate;
        } else {
            return _either;
        }
    }
}
