package ua.com.kneu.group204.example2.clock2;

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
        return "ClockExt{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public void nextMinute(){

        minute++;
        if(minute==60){
            minute = 0;
            hour++;
        }

        if(hour==24){
            hour=0;
        }
    }
}
