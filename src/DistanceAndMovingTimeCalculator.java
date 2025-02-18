import java.util.Scanner;

public class DistanceAndMovingTimeCalculator {
    public static void main(String[] args) {
        double distance;
        int hour;
        int minute;
        int second;

        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        distance = sc.nextInt();
        System.out.print("Enter hour: ");
        hour = sc.nextInt();
        System.out.print("Enter minute: ");
        minute = sc.nextInt();
        System.out.print("Enter second: ");
        second = sc.nextInt();
        sc.close();

        // 1h = 60m = 3600s
        double timeInSeconds = (hour * 3600) + (minute * 60) + second;
        double speedInMeterPerSecond = distance / timeInSeconds; // Calculate m/s
        double speedInKilometerPerHour = (distance/1000) / (timeInSeconds / 3600); //Calculate km/h

        //Output
        System.out.format("Speed in m/s: %.8f m/s\n", speedInMeterPerSecond );
        System.out.format("Speed in km/h: %.8f km/h\n", speedInKilometerPerHour );
    }
}
