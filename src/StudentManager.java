import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
    public static void main(String[] args) {

        Student[] students = new Student[100];
        List<Student> studentList = new ArrayList<>();

        // Nhap vao danh sach sinh vien bao gom ten va diem so
        studentList.add(new Student("Student A", 7));
        studentList.add(new Student("Student B", 20));
        studentList.add(new Student("Student C", 9));
        studentList.add(new Student("Student D", 6));
        studentList.add(new Student("Student E", 8));
        studentList.add(new Student("Student F", 10));

        //In ra danh sach hoc sinh
        for (int i = 0; i < studentList.size(); i++) {
            Student std = studentList.get(i);
            std.showInfo();
        }

        //Tim sinh vien co diem cao nhat
        int point = 0;
        String name = "";
        for (Student std : studentList) {
            if (std.getStudentExamPoints() > point) {
                point = std.getStudentExamPoints();
                name = std.getStudentName();
            }
        }
        System.out.format("The student that have the highest point is: %s with %d points",name, point);
    }
}
