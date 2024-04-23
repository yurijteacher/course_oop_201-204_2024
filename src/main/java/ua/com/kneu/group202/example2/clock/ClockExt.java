package ua.com.kneu.group202.example2.clock;

public class ClockExt extends Clock{

    private int second;


    public ClockExt(int second) {
        this.second = second;
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    @Override
    public String toString() {
        return "ClockExt{" +
                super.toString() +
                ", second=" + second +
                '}';
    }


    public void nextSecond(){
        second++;

        if(second==60){
            super.nextMinute();
            second=0;

        }

    }
}
