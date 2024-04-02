package ua.com.kneu.group204.example2.clock2;

public class ClockExt extends Clock{

    private int second = 0;

    public ClockExt(int second) {
        this.second = second;
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    public void nextSecond(){

       // second = second + 1;

        second++;

        if(second==60){
            second=0;
            nextMinute();
        }
    }


    @Override
    public String toString() {
//        return "ClockExt{" +
//                super.toString() +
//                ", second=" + second +
//                '}';

        return getHour() + ":"+getMinute()+":"+second;
    }
}
