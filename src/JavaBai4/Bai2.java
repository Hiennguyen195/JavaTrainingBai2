package JavaBai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<Integer>();

        System.out.println("Enter numbers: ");
        while (true) {
            String input = sc.next(); // Đọc từng phần tử nhập vào

            if (input.equalsIgnoreCase("exit")) { // Kiểm tra nếu nhập 'exit'
                break;
            }

            try {
                int number = Integer.parseInt(input); // Chuyển đổi input thành số nguyên
                numbersList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer or 'exit' to stop.");
            }
        }
        sc.close();

        System.out.println("List of numbers: " + numbersList);

        //Tính tổng của các phần tử là số chẵn
        int sumEven = numbersList.stream()
                                 .filter(n -> n % 2 == 0)
                                 .mapToInt(n -> n)
                                 .sum();
        System.out.println("Sum of even numbers: " + sumEven);

        //Tính tổng của các phần tử là số lẻ
        int sumOdd = numbersList.stream()
                                .filter(n -> n % 2 != 0)
                                .mapToInt(n -> n)
                                .sum();
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
