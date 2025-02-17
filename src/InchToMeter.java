import java.util.Scanner;

public class InchToMeter {
    public static void main(String[] args) {

        double input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input inches: ");
        input = sc.nextDouble();
        System.out.format("Output meters: %.4f", input * 0.0254);
    }
}
