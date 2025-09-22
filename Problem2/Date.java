package Problem2;

public class Date {
    // Inititalize the arguments
    private int day;
    private int month;
    private int year;

    

    public Date(int day, int month, int year) { // Create the date
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { // Get the day
        return day;
    }

    public int getMonth() { // get the month
        return month;
    }

    public int getYear() { // get year
        return year;
    }

    public void setDay(int day) { // set the day
        this.day = day;
    }

    public void setMonth(int month) { // set the month
        this.month = month;
    }

    public void setYear(int year) { // set year
        this.year = year;
    }

    public String toString() { // convert the date to a readable string
        return String.format("%02d/%02d/%d", day, month, year);
    }
}
