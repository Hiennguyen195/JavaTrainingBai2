package JavaBai2;

import java.util.Scanner;

public class MinuteToYearAndDay {
    public static void main(String[] args) {
        long inputMinute;
        long year;
        long day;

        Scanner sc = new Scanner(System.in);
        System.out.println("In order for the program to work, please enter a number that greater or equal than 1440!");
        System.out.print("Enter an input minute: "); // Nhap input
        inputMinute = sc.nextLong();
        sc.close();

        // 1 year = 525600 minutes ( if every year have 365 days)
        if (inputMinute < 1440) {
            System.out.println("Invalid input, please enter a number greater or equal than 1440!");
        }
        else {
            year = inputMinute / 525600; // Tính năm trước
            day = (inputMinute % 525600) / 1440; // Từ số dư phút tính số ngày
            System.out.format("Year: %d, Day: %d", year, day);
        }
    }
}
