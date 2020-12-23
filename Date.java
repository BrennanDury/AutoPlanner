import java.util.Calendar;

public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int date;

    public Date(Calendar cal) {
        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH);
        this.date = cal.get(Calendar.DATE);
    }

    public int compareTo(Date other) {
        int cmp = Integer.compare(this.year, other.year);
        if (cmp != 0) {
            return cmp;
        }
        cmp = Integer.compare(this.month, other.month);
        if (cmp != 0) {
            return cmp;
        }
        cmp = Integer.compare(this.date, other.date);
        return cmp;
    }
}
