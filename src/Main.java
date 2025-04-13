import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime sysTime = LocalTime.now();
        String currentTime = sysTime.format(formatter);
        LocalTime targetTime = LocalTime.parse("22:05");
        while (true){
            if (currentTime.equals(targetTime.toString())) {
                System.out.println("Beep beep");
                break;
            }
            sysTime = LocalTime.now();
            currentTime = sysTime.format(formatter);
        }
        return;
    }
}