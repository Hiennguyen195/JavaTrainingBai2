package JavaCodingChallenges;

import java.util.Scanner;

public class PrimeNumbers {
    Scanner sc = new Scanner(System.in); //Sử dụng Scanner lấy đầu vào từ bàn phím

    public void checkPrimeNumbers() {
        System.out.print("Please enter a number: "); // Nhập số cần check
        int number = sc.nextInt();
        System.out.println("===========================");
        if (number == 2) { //Trong trường hợp đặc biệt khi number == 2
            System.out.format("%d is a Prime number", number);
        }
        else if (number%2 != 0) { //Không chia hết cho 2 là Prime Numbers
            System.out.format("%d is a Prime number", number);
        }
        else { //Các trường hợp còn lại không phải là Prime Numbers
            System.out.format("%d is not a Prime number", number);
        }
    }
}
