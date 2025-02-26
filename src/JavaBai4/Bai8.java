package JavaBai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Nhập các phần tử muốn cho vào list: ");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("quit")) {
                break;
            }

            try {
                int u = Integer.parseInt(input);
                list.add(u);
            } catch (NumberFormatException e) {
                System.out.println("invalid input");
            }
        }
        sc.close();
        System.out.println("Input list: " + list);

        // Sử dụng Optional và Stream API để tìm ra số chẵn đầu tiên trong dãy nhập vào
        Optional<Integer> firstEvenNumber = list.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        if (firstEvenNumber.isPresent()) { //Sử dụng isPresent() để kiểm tra sự tồn tại của số chẵn đầu tiên
            System.out.println("Số chẵn đầu tiên là " + firstEvenNumber.get());
        } else {
            System.out.println("Không phù hợp!");
        }
    }
}
