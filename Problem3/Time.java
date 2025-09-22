package Problem3;

public class Time {
    // Inititalize the arguments
    private int hour;
    private int minute;
    private int second;

    

    public Time(int hour, int minute, int second) { // Create the time
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() { // get the hour
        return hour; 
    }

    public int getMinute() { // get the minute
        return minute;
    }

    public int getSecond() { // get the second
        return second;
    }

    public void setHour(int hour) { // set the hour
        this.hour = hour;
    }

    public void setMinute(int minute) { // set the minute
        this.minute = minute;
    }

    public void setSecond(int second) { // set the second
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) { // set the whole time
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() { // return the time as a readable string
        return String.format("%02d:%02d:%d", hour, minute, second);
    }

    public Time nextSecond() { // increment the time by one second
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() { // decrement the time by one second
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
