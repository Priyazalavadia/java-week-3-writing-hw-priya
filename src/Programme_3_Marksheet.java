import java.util.Scanner;

public class Programme_3_Marksheet {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner Scan = new Scanner(System.in);
        System.out.print("\nEnter Student Name      \t \t:\t");
        String name = Scan.next();
        System.out.print("Enter Student Roll Number \t\t:\t");
        int rollNum = Scan.nextInt();
        System.out.print("Enter Marks of Subject Maths \t:\t");
        int mathsMarks = Scan.nextInt();
        if (mathsMarks < 0 || mathsMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks \t\t:\t");
            mathsMarks = Scan.nextInt();
        }
        System.out.print("Enter Marks of Subject Science \t:\t");
        int scienceMarks = Scan.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks \t\t:\t");
            scienceMarks = Scan.nextInt();
        }
        System.out.print("Enter Marks of Subject Science \t:\t");
        int englishMarks = Scan.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks \t\t:\t");
            englishMarks = Scan.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        Scan.close();
    }
    //calculating the sum
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
      //Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks){
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35){
            return "Fail";
        }else {
            return "Pass";

        }
    }
    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result){
        String grade = null;
        if(result.equalsIgnoreCase("Pass"));{
            if(percentage >=80) {
                grade = "A+";
            }else if (percentage >=60){
                grade = "A";
            } else if (percentage >=50) {
                grade = "B";
            }else if (percentage >= 35) {
                grade = "C";
            }
      //  } else {
            grade = "-";
        }
        return grade;
    }

    //Printing the Marks Sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scieceMarks, int englishMarks, double total, double percentage, String result, String grade){
        System.out.println("-----------------------------------");
        System.out.println("|---------------------------------|");
        System.out.println("|    Mark Sheet                   |");
        System.out.println("|_________________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Math:" + scieceMarks + "                   |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}



