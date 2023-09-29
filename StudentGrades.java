package BasicPrograms;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
    	
//    	2.Question:
//    		Write a Java switch case program to take the students names and marks of 10 students as input and display their grades according to the below conditions:
//    		 * If marks above 90 then “A” grade
//    		 * If marks between 90-80 then “B” grade
//    		 * If marks between 80-70 then “C” grade
//    		 * If marks between 70-60 then “D” grade
//    		 * If marks between 45-60 then “E” grade 
//    		 * Else “F”
    	
        Scanner scanner = new Scanner(System.in);

        String[] stdNames = new String[10];
        int[] stdMarks = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the Name of Student " + (i + 1) + ": ");
            stdNames[i] = scanner.nextLine();

            System.out.print("Enter the Marks of student " + (i + 1) + ": ");
            stdMarks[i] = scanner.nextInt();

            scanner.nextLine();
        }

        System.out.println("Student Grades:");
        for (int i = 0; i < 10; i++) {
            System.out.print(stdNames[i] + ": ");
            int marks = stdMarks[i];

            char grade;
            switch (marks / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    if (marks >= 45 && marks <= 60) {
                        grade = 'E';
                    } else {
                        grade = 'F';
                    }
                    break;
            }
            System.out.println("Grade :"+grade);
        }

    }
}
