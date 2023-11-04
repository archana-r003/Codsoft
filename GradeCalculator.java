import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        String[] subjectNames = new String[numSubjects];
        String[] subjectCodes = new String[numSubjects];
        double[] marksObtained = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject code  " + (i + 1) + ": ");
            subjectCodes[i] = scanner.next();
            System.out.print("Enter subject name  " + (i + 1) + ": ");
            subjectNames[i] = scanner.next();
            System.out.print("Enter marks obtained for " + subjectNames[i] + " (out of 100): ");
            marksObtained[i] = scanner.nextDouble();
        }

        double totalMarks = 0;
        for (double marks : marksObtained) {
            totalMarks += marks;
        }

        double averagePercentage = (totalMarks / (numSubjects * 100)) * 100;

        String grade = "";
        if (averagePercentage >= 90) {
            grade = "O";
        } else if (averagePercentage >= 85) {
            grade = "A+";
        } else if (averagePercentage >= 75) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 65) {
            grade = "B";
        }  else {
            grade = "F";
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade be Calculated: " + grade);

        scanner.close();
    }
}
