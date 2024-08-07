public class Time {
    private int hours;
    private int minutes;
    private int second;

    Time(){
        hours=05;
        minutes=45;
        second=15;
    }
    Time(int hours){
        this.hours=hours;
        minutes=45;
        second=15;
    }
    Time(int hours,int minutes){
        this.hours=hours;
        this.minutes=minutes;
        second=15;
    }
    Time(int hours,int minutes,int second){
        this.hours=hours;
        this.minutes=minutes;
        this.second=second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setTime(int hours,int minutes,int second){
        this.hours=hours;
        this.minutes=minutes;
        this.second=second;
    }
    public void getTime(){
        System.out.println("hours:"+hours+" minutes:"+minutes+" second:"+second);
    }
    public String toString() {
        return "Time{"+"hours="+hours+",minutes="+minutes+",second="+second+'}';
    }
    public void nextSecond(){
        second++;
        if (second>=60){
            second=0;
            minutes++;
            if(minutes>=60){
                minutes=0;
                hours++;
                if(hours>=24){
                    hours=0;
                }
            }
        }
    }
    public void nextMinute(){
        minutes++;
        if(minutes>=60){
            minutes=0;
            hours++;
            if(hours>=24){
                hours=0;
            }
        }
    }
    public void nextHour(){
        hours++;
        if(hours>=24){
            hours=0;
        }
    }
}
