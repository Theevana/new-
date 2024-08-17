import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject");
        int Subjects = sc.nextInt();

        if (Subjects <= 0) {
            System.out.println("Please enter a valid number of Subjects");
            return;
        }
        int totalMarks = 0;
        int maxMarks = 100;

        for (int i = 1; i <= Subjects; i++) {
            System.out.println("Enter marks obtained in Subjects " + i + " (out of 100):");
            int marks = sc.nextInt();

            if (marks < 0 || marks > maxMarks) {
                System.out.println("Marks should be in the range of 1 to 100 . Please enter valid marks");
                i--;
            } else {
                totalMarks += marks;
            }
        }

        double averagePercentage = (double) totalMarks / (Subjects * maxMarks) * 100;
        System.out.println("Total marks : " + totalMarks);
        System.out.println("Average Percentage : " + averagePercentage + "%");

        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "c";
        } else {
            grade = "F";
        }
        System.out.println("Grade : " + grade);

    }

}
