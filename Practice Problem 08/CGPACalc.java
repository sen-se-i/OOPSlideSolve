public class CGPACalc {
    public static void main(String[] args) {
        int students = 5;
        int subjects = 5;

        double[][] gradePoints = {
            {4.0, 3.5, 3.0, 4.0, 3.7},
            {3.5, 3.0, 4.0, 3.3, 3.7},
            {2.0, 3.0, 2.5, 3.0, 2.7},
            {4.0, 4.0, 3.7, 4.0, 4.0},
            {3.0, 2.5, 3.5, 3.0, 2.0}
        };

        double[] credits = {3, 4, 3, 2, 3};

        for (int i = 0; i < students; i++) {
            double totalWeightedGrade = 0;
            double totalCredits = 0;
            for (int j = 0; j < subjects; j++) {
                totalWeightedGrade += gradePoints[i][j] * credits[j];
                totalCredits += credits[j];
            }
            double cgpa = totalWeightedGrade / totalCredits;
            System.out.println("Student " + (i + 1) + " CGPA: " + cgpa);
        }
    }
}
