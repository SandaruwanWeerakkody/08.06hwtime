public class TestTime {
    public static void main(String[] args) {
        Time currentTime = new Time(23,59,59);
//        System.out.println("CurrentHour :"+currentTime.getHours());
//        currentTime.nextSecond();
//        currentTime.getTime();
//        currentTime.nextSecond();
//        currentTime.getTime();
//        currentTime.nextMinute();
//        currentTime.getTime();
        currentTime.getTime();
        currentTime.setTime(24,15,23);
        currentTime.getTime();
        currentTime.setMinutes(25);
        currentTime.getTime();
        currentTime.setHours(10);
        currentTime.getTime();
        currentTime.setSecond(69);
        currentTime.getTime();
//        Time currentTime1 = new Time(23,25,59);
//        System.out.println("currentMinute :"+currentTime1.getMinutes());
//        currentTime1.nextMinute();
//        currentTime1.getTime();
//        currentTime1.nextHour();
//        currentTime1.getTime();
//        currentTime1.nextSecond();
//        currentTime1.getTime();
//        currentTime1.nextSecond();
//        currentTime1.getTime();
//        currentTime1.nextMinute();
//        currentTime1.getTime();
//
//        System.out.println(currentTime1.toString());
//        currentTime1.setTime(15,26,9);
//        System.out.println(currentTime1.toString());
//        currentTime1.getTime();
    }
}
