package JavaBai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();

        System.out.print("Nhập số lượng phần tử muốn nhập: ");
        int n = sc.nextInt();

        System.out.println("Nhập vào các chuỗi");
        for (int i = 0; i < n; i++) {
            stringList.add(sc.next());
        }
        System.out.println("List đã nhập: " + stringList);
        sc.close();

        //Nối tất cả string trong list lại thành một chuỗi duy nhất ngăn cách nhau bằng dấu phẩy
        String joinedString = stringList.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Chuỗi đã join là: " + joinedString);
    }
}
