import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {

       // Taking Student Input According his/her number of subjects
         try (
            Scanner studentInput = new Scanner(System.in)) {
            System.out.print("Enter the Number of Subjects : ");
            // Assign Students Marks
            int totalMarks= 0;

            for(int i=1; i <= totalMarks; i++){

                // Taking Student Marks and Adding in totalMarks
                System.out.println("Enter Your Marks out of 100 in Subject " + i + ": ");
                int marks = studentInput.nextInt();
                totalMarks+= marks;

            }
        }

        // Calculating the Percentage

        // double studentPercentage = (double) 
    }
}