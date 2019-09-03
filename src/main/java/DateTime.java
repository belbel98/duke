import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The DateTime class formats the DD/MM/YY HHMM format into a more
 * readable format, e.g. 2nd of January 2019 4PM.
 */
public class DateTime {
    private final SimpleDateFormat _formatGiven = new SimpleDateFormat(
            "d/M/yyyy HHmm");
    private final String _formatToShow = " 'of' MMMM yyyy, ha";
    private final SimpleDateFormat _formatter = new SimpleDateFormat(
            _formatToShow);
    private String _dateTime;
    private Date _date;

    /**
     * Constructs a new DateTime object with the given date and time.
     * @param dateTime the date/time string representation in the old format
     * @throws ParseException when the parameter dateTime given is
     * not presented in the given format
     */
    public DateTime(String dateTime) throws ParseException {
        this._dateTime = dateTime;
        this._date = _formatGiven.parse(dateTime);
    }

    /**
     * This method formats the date and time into the more readable format,
     * and returns a string representation of it.
     * @return a string representation of the given date and time in the new format.
     */
    public String getDateTimeString() {
        String[] splitDate = this._dateTime.split("/");
        String suffix = getSuffix(Integer.parseInt(splitDate[0]));
        String dateTime = suffix + _formatter.format(this._date);
        return dateTime;
    }

    private String getSuffix(int d) {
        switch (d % 10) {
        case 1:
            return d + "st";
        case 2:
            return d + "nd";
        case 3:
            return d + "rd";
        default:
            return d + "th";
        }
    }
}
