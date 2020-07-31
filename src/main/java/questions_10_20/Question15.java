package questions_10_20;

import java.util.Calendar;

public class Question15 {
    public static void main(String[] args) {
        System.out.println(getDateAndTime());
    }
    public static String getDateAndTime(){
        Calendar c  = Calendar.getInstance();
        return "" + c.getTime().toString();
    }
}
