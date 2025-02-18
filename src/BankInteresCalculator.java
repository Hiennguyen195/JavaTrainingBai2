import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BankInteresCalculator {
    public static void main(String[] args) {
        BigDecimal monthlyPayment;
        double yearlyInterest;
        int years;

        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly payment: ");
        monthlyPayment = sc.nextBigDecimal();
        System.out.print("Enter yearly interest: ");
        yearlyInterest = sc.nextFloat();
        System.out.print("Enter years: ");
        years = sc.nextInt();
        sc.close();

        //Output
        BigDecimal totalPayment = monthlyPayment.multiply(BigDecimal.valueOf((1 + yearlyInterest))).multiply(BigDecimal.valueOf(years));
        System.out.format("Sau %d năm bạn sẽ có %s vnđ với mức lãi suất là %.2f/năm", years, totalPayment.setScale(2, RoundingMode.HALF_UP).toPlainString(), yearlyInterest);

    }
}
