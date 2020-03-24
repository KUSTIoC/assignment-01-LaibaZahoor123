

public class Time {
    private int sec;
    private int min;
    private int hour;

    public Time(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d",sec,min,hour);
    }


 
    
    
}
