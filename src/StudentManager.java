import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    public static void main(String[] args) {

        Student[] students = new Student[100];
        List<Student> studentList = new ArrayList<>();

        // Nhap vao danh sach sinh vien bao gom ten va diem so
        studentList.add(new Student("Student A", 7));
        studentList.add(new Student("Student B", 4));
        studentList.add(new Student("Student C", 9));
        studentList.add(new Student("Student D", 6));
        studentList.add(new Student("Student E", 8));
        studentList.add(new Student("Student F", 10));

        //In ra danh sach hoc sinh
        for (int i = 0; i < studentList.size(); i++) {
            Student std = studentList.get(i);
            System.out.println(std.getName() + ": " + std.getScore());
        }
        System.out.println("============================");

        //Tim sinh vien co diem cao nhat
        int point = 0;
        String name = "";
        for (Student std : studentList) {
            if (std.getScore() > point) {
                point = std.getScore();
                name = std.getName();
            }
        }
        System.out.format("Học sinh có điểm cao nhất là %s với %d điểm\n", name, point);

        System.out.println("============================");
        //In ra danh sach theo thu tu giam dan theo point

        //CÁCH 1: Sử dụng hàm lambda cho Java 8+, không phải ghi đè phương thức compare()
//        studentList.sort((s1, s2) -> {
//            return Integer.compare(s2.getScore(), s1.getScore()); // Sắp xếp giảm dần
//        });

        //CÁCH 2: Nhanh nhất, gọn nhất, dễ đọc nhất, sử dụng reversed() cho hiệu suất nhanh nhất
        studentList.sort(Comparator.comparing(Student::getScore).reversed());

        //CÁCH 3: Cơ bản nhất, phải ghi đè phương thức compare()
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return Integer.compare(s2.getScore(), s1.getScore());
//            }
//        });

        System.out.println("Danh sách học sinh theo điểm giảm dần:");
        for (Student s : studentList) {
            System.out.println(s.getName() + ": " + s.getScore());
        }

        System.out.println("============================");//Phân chia hai bài

        //Quản lý học lực của sinh viên
        for (Student std1 : studentList) {
            Grade grade = Grade.fromScore(std1.getScore());
            System.out.println(std1.getName() + ": " + std1.getScore() + " Học lực: " + grade.name());
        }
    }
}