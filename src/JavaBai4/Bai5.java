package JavaBai4;

import java.util.*;
import java.util.stream.Collectors;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới sau nextInt()

        System.out.println("Nhập các chuỗi:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }

        System.out.println("Danh sách vừa nhập: " + list);
        scanner.close();
        
        //Tạo map để nhóm các list theo độ dài sử dụng groupingBy()
        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::length));
        //In ra từng list theo độ dài tương ứng
        map.forEach((length, group) ->
                System.out.println("Độ dài " + length + ": " + group));

    }
}
