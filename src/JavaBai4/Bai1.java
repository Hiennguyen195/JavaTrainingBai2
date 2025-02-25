package JavaBai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới sau nextInt()

        List<String> list = new ArrayList<String>();
        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        System.out.println("Danh sách vừa nhập: " + list);

        System.out.print("Bạn muốn chuyển thành UpperCase hay LowerCase, gõ U hoặc L tương ứng: ");
        String option = scanner.nextLine();
        scanner.close();

        if (option.equals("U") || option.equals("u")) {

            // Chuyển tất cả chuỗi thành chữ hoa
            List<String> upperCaseList = list.stream()
                                             .map(String::toUpperCase) // Chuyển từng phần tử thành chữ hoa
                                             .toList(); // Thu thập kết quả vào List

            System.out.println("Danh sách theo UpperCase: " + upperCaseList);
        } else if (option.equals("L") || option.equals("l")) {

            // Chuyển tất cả chuỗi thành chữ thường
            List<String> lowerCaseList = list.stream()
                                             .map(String::toLowerCase) // Chuyển từng phần tử thành chữ thường
                                             .toList(); // Thu thập kết quả vào List

            System.out.println("Danh sách theo LowerCase: " + lowerCaseList);
        } else {

            // Khi input không phải U hoặc L
            System.out.println("Bạn nhập sai rồi, mời bạn nhập lại");
        }
    }
}
