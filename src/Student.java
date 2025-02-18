public class Student {
    private String studentName;
    private int studentExamPoints;

    public Student(String studentName, int studentExamPoints) {
        this.studentName = studentName;
        this.studentExamPoints = studentExamPoints;
    }
    public String getStudentName() {
        return studentName;
    }
    public int getStudentExamPoints() {
        return studentExamPoints;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentExamPoints(int studentExamPoints) {
        this.studentExamPoints = studentExamPoints;
    }

    @Override
    public String toString() {
        return "Student {" +
                "Student Name: '" + studentName + '\'' +
                ", Points: " + studentExamPoints +
                '}';
    }

    public void showInfo() {
        System.out.println(toString());
    }
}
