package ua.com.kneu.group204.example2.clock2;

public class ClockExt2 extends ClockExt {

    private int ms=0;

    public ClockExt2(int second) {
        super(second);
    }

    public ClockExt2(int hour, int minute, int second) {
        super(hour, minute, second);
    }


    public void nextMs(){
        ms+=100;

        if(ms==1000){
            ms=0;
            nextSecond();
        }
    }
}
