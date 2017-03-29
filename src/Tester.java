import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        boolean isPM = "PM".equalsIgnoreCase(time.substring(time.length() - 2));
        time = time.substring(0, time.length() - 2);
        int hour = Integer.parseInt(time.split(":")[0]);
        if (isPM && hour != 12) {
            hour += 12;
        } else if (!isPM) {
            if (hour == 12)
                hour = 0;
        }
        String hr = (hour == 0) ? "00" : (hour + "");
        System.out.print(hr + ":" + time.split(":")[1] + ":" + time.split(":")[2]);
    }
}
