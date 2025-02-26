package JavaBai4;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter numbers: ");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer or 'exit' to stop.");
            }
        }
        sc.close();

        //Tìm phần tử nhỏ thứ 2 của list
        Optional<Integer> secondSmallest = list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();
        if (secondSmallest.isPresent()) {
            System.out.println("The second smallest Integer is " + secondSmallest.get());
        } else {
            System.out.println("There is no second smallest Integer in the list");
        }
        //Tìm phần tử lớn thứ 2 trong list
        Optional<Integer> secondLargest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        if (secondLargest.isPresent()) {
            System.out.println("The second largest Integer is " + secondLargest.get());
        } else {
            System.out.println("There is no second largest Integer in the list");
        }
    }
}
