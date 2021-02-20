package extraExercise;
import java.util.Scanner;


class LetterGrades
{
    public static void main(String[] args)
    {
    int total = 0; // sum of grades
    int gradeCounter = 0; // number of grades entered
    int aCount = 0; // count of A grades
    int bCount = 0; // count of B grades
    int cCount = 0; // count of C grades
    int dCount = 0; // count of D grades
    int fCount = 0; // count of F grades

    Scanner input = new Scanner(System.in);

         System.out.printf("%s%n%s%n %s%n %s%n",
                 "Enter the integer grades in the range 0-100.",
                 "Type the end-of-file indicator to terminate input:",
                 "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                 "On Windows type <Ctrl> z then press Enter");

    // loop until user enters the end-of-file indicator
         while(input.hasNext())

    {
        int grade = input.nextInt(); // read grade
        total += grade; // add grade to total
        ++gradeCounter; // increment number of grades
    }
}
    }