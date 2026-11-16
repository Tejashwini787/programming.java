
class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        System.out.println("Default Constructor Called.");
    }


    public Time(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = (totalSeconds % 3600) % 60;
        System.out.println("Single Parameter Constructor (Total Seconds) Called.");
    }


    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        System.out.println("Three Parameter Constructor (Hr, Min, Sec) Called.");
    }


    public void displayTime() {

        System.out.println("Time -> " + String.format("%02d", hours) + ":"
                + String.format("%02d", minutes) + ":"
                + String.format("%02d", seconds));
        System.out.println("---------------------------------------");
    }
}


public class timing{
    public static void main(String[] args) {

        Time time1 = new Time();
        time1.displayTime();


        Time time2 = new Time(7385);
        time2.displayTime();


        Time time3 = new Time(10, 45, 30);
        time3.displayTime();
    }
}

