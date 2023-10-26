// Multiplication Practise Program
// Written by Anjali Godara 2023-10-24

import java.util.Scanner; // Import the Scanner class to read text files

public class multiplyPractise {
    public static void main(String[] args) {
        // Scanner 1
        Scanner Number1 = new Scanner(System.in);
        System.out.println("Please input the first number:"); // input number
        int num1 = Number1.nextInt();

        // Scanner 2
        Scanner Number2 = new Scanner(System.in);
        System.out.println("Please input the second number:"); // input number
        int num2 = Number2.nextInt();

        // Multiplies numbers
        int ans = num1 * num2;

        // Scanner 3
        Scanner Number3 = new Scanner(System.in);
        System.out.println("Please input the answer:"); // input number
        int InAns = Number3.nextInt();

        // result
        String result = (ans == InAns) ? "Correct." : "Incorrect. The answer is " + ans;
        System.out.println(result); // prints result

    }
}
