package JavaBai4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng mới sau nextInt()

        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        System.out.println("Danh sách vừa nhập: " + list);
        sc.close();

        //Danh sách theo thứ tự tâng dần theo alphabetical order
        List<String> ascendingList = list.stream()
                                         .sorted()
                                         .toList();

        System.out.println("Ascending list: " + ascendingList);
        //Danh sách theo thứ tự giảm dần theo alphabetical order
        List<String> descendingList = list.stream()
                                          .sorted(Comparator.reverseOrder())
                                          .toList();
        System.out.println("Descending list: " + descendingList);
    }
}
