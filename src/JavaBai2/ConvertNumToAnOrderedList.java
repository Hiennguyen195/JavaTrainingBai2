package JavaBai2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ConvertNumToAnOrderedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNum;

        System.out.println("Enter an number: "); // Nhập chuỗi cần sắp xếp
        inputNum = sc.nextLine();
        String[] numArr = inputNum.split("");

        List<String> numList = new ArrayList<>(Arrays.asList(numArr)); //Chuyển List sang ArrayList
        numList.sort(null);
//        Collections.sort(numList); //Sắp xếp các phần tử trong ArrayList
        System.out.println("Sorted list: " + numList); //In ra list được sắp xếp
        System.out.println("Output: " + String.join(",", numList)); //In ra một chuỗi phân cách bằng dấu phẩy
        sc.close();
    }
}
