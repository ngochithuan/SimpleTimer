import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.awt.Toolkit;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime sysTime = LocalTime.now();
        String currentTime = sysTime.format(formatter);


        String inputTime = "";
        Scanner scanner = new Scanner(System.in);
        while (!inputTime.equals("stop")){
            System.out.println("Pick a time");
            inputTime = scanner.next();
            LocalTime targetTime = LocalTime.parse(inputTime);
            while (true){
                if (currentTime.equals(targetTime.toString())) {
                    System.out.println("Beep beep");
                    Toolkit.getDefaultToolkit().beep();
                    break;
                }
                sysTime = LocalTime.now();
                currentTime = sysTime.format(formatter);
            }
        }

        scanner.close();
        return;
    }
}