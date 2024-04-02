package ua.com.kneu.group201.example3.clock;

public class ClockExt extends Clock {

    private int second = 0;

    public ClockExt(int second) {
        this.second = second;
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    public void nextSecond(){
        second++;
        if(second == 60){
            second = 0;
            nextMinute();
        }
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", second=" + second +
                '}';
    }
}
