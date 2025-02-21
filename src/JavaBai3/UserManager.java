package JavaBai3;

import java.util.HashSet;
import java.util.Scanner;

public class UserManager {
    static HashSet<User> usersList = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    // Thêm user
    public void addUser(User user) {
        usersList.add(user);
    }
    // Xóa user
    public void removeUser(User user) {
        usersList.remove(user);
    }
    // Hiển thị thông tin user
    public void showUsersInfo() {
        for (User user : usersList) {
            System.out.println("-----");
            System.out.println(user);
        }
    }
    // Kiểm tra email trùng trong UserList
    public void checkDuplicateEmail() {
        System.out.println("Please enter an email address: ");
        String email = scanner.nextLine();

        // Kiểm tra email trong danh sách
        boolean exists = false;
        for (User user : usersList) {
            if (user.getEmail().equalsIgnoreCase(email)) {  // So sánh email
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("❌ Email address already exists!");
        } else {
            System.out.println("✅ Email address is available!");
        }
    }


}
