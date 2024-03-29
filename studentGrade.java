package StudentGradeCalculator;
import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's Calculate the Students Grade.");
        System.out.print("Enter the name of the Student:");
        String name = scanner.nextLine();


        final int mark;
        System.out.println("Enter the 5 subjects marks.");
        System.out.println(" Enter the Tamil mark:");
        int Tamilmark = scanner.nextInt();
        System.out.println("Enter the English mark:");
        int Englishmark = scanner.nextInt();
        System.out.println("Enter the Maths mark:");
        int Mathsmark = scanner.nextInt();
        System.out.println("Enter the Science mark:");
        int Sciencemark = scanner.nextInt();
        System.out.println("Enter the SocialScience mark:");
        int SocialSciencemark = scanner.nextInt();

        System.out.println("Calculate the Total Marks.");
        int totalmark = 500;
        totalmark = (Tamilmark + Englishmark + Mathsmark + Sciencemark + SocialSciencemark);
        System.out.println("The total marks:" + totalmark);

        System.out.println("Calculate Average Percentage.");
        double Percentage = (totalmark / 5);
        System.out.print(" Average Percentage is " + Percentage + "%");

        System.out.println("\n Calculate the Grade.");
        double AveragePercentage = (totalmark/5);

        if (AveragePercentage >= 90) {
            System.out.println("EXCELLENT!! YOUR GRADE IS O") ;
        }
        else if (AveragePercentage >= 80) {
            System.out.println("AWESOME!! YOUR GRADE IS A+");
        }
        else if (AveragePercentage >= 70) {
            System.out.println("VERY NICE!! YOUR GRADE IS A");
        }
        else if (AveragePercentage >= 60) {
            System.out.println("GOOD JOB!! YOUR GRADE IS B+");
        }
        else if (AveragePercentage >= 50) {
            System.out.println("GOOD!! YOUR GRADE IS B");
        }
        else {
            System.out.println("TRY HARD!! YOUR GRADE IS D");
        }
        System.out.println("Display the Result");
        System.out.println(" Name : " + name);
        System.out.println(" Total Mark : " + totalmark);
        System.out.println(" Percentage : " + Percentage);
        
    
        scanner.close();
        
    }
    
}
