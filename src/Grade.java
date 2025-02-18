
public enum Grade {
    EXCELLENT(8.5, 10.0),
    GOOD(7.0,8.4),
    AVERAGE(5.0,6.9),
    WEAK(0.0,4.9);

    private final double minScore;
    private final double maxScore;

    //Constructor
    Grade(double minScore, double maxScore) {
        this.minScore = minScore;
        this.maxScore = maxScore;
    }
    //Enum chỉ có getter
    public double getMinScore() {
        return minScore;
    }
    public double getMaxScore() {
        return maxScore;
    }

    // Phương thức để lấy Grade từ điểm số
    public static Grade fromScore(double score) {
        for (Grade grade : Grade.values()) {
            if (score >= grade.minScore && score <= grade.maxScore) {
                return grade;
            }
        }
        return WEAK; // Nếu điểm không hợp lệ, mặc định là yếu
    }
}
