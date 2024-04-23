package ua.com.kneu.group202.example2.clock;

public class Clock {

    private int hour;
    private int minute;

    public Clock() {
    }

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public void nextMinute() {

        minute++;

        if(minute==60){
            hour++;
            minute=0;
        }

        if(hour==24){
            hour=0;
        }

    }
}
