// Even or odd program
// Written by Anjali Godara 2023-10-24

import java.util.Scanner; // Import the Scanner class to read text files

public class evenOrOdd {
      public static void main(String[] args) {

        // Scanner
        Scanner obj = new Scanner(System.in);
        System.out.println("Please input a number:"); // input number
        int num = obj.nextInt();

        // Checks if even or odd
        int num2 = num % 2;
        String result = (num2 == 0) ? "Number is even." : "Number is odd.";
        System.out.println(result); // prints result
    }  
}
