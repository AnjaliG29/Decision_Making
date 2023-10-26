// Grading program
// Written by Anjali Godara 2023-10-24

import java.util.Scanner; // Import the Scanner class to read text files

import java.util.HashMap; // import the HashMap class

public class gradingProgram {
    public static void main(String[] args) {
        
        HashMap<String, String> Grading = new HashMap<String, String>(); // Hash map

        while (true) { // While loop
            
            // Name Scanner
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Please input a name:"); // input string
            String name = obj1.nextLine();

            // Grade Scanner
            Scanner obj2 = new Scanner(System.in);
            System.out.println("Please input a grade:"); // input number
            int num = obj2.nextInt();

            // Check if grade is between 0 and 100
            if (-1 < num && 101 > num) {
                String grade = "";
                
                // Converts number to grade
                if (num < 50) {
                    grade = "F";
                } else if (num < 60) {
                    grade = "D";
                } else if (num < 70) {
                    grade = "C";
                } else if (num < 80) {
                    grade = "B";
                } else if (num < 90) {
                    grade = "A";
                } else {
                    grade = "A+";
                }

                Grading.put(name, grade); // Adds grade to hash 

                // Continue Scanner
                Scanner obj3 = new Scanner(System.in);
                System.out.println("Do you want to continue? (yes or no)"); // input true or false
                String decision = obj3.nextLine();
                
                // Switch to decide if to continue or not
                switch(decision) {
                    case "yes":
                        continue;
                    case "no": 
                        break;
                }

            } else {
                System.out.println("Invalid input, please try again."); // Writes Error
                continue; 
            }
            System.out.println(Grading);
        }
    }
}