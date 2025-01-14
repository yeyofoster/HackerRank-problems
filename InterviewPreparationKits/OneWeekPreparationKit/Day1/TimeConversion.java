package InterviewPreparationKits.OneWeekPreparationKit.Day1;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:45:54PM";
        String result = timeConversion(s);
        System.out.println(result);
    }

    public static String timeConversion(String s) {
        String hours = s.substring(0, 2);
        String minutesSeconds = s.substring(3, 8);
        String meridian = s.substring(8);

        if (meridian.equals("PM") && !hours.equals("12")) {
            hours = String.valueOf(Integer.parseInt(hours) + 12);
        } else if (meridian.equals("AM") && hours.equals("12")) {
            hours = "00";
        }

        if (hours.length() == 1) {
            hours = "0" + hours;
        }

        return hours + ":" + minutesSeconds;
    }
}
