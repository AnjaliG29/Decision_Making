// Insurance program
// Written by Anjali Godara 2023-10-24

import java.util.Scanner; // Import the Scanner class to read text files

public class insuranceProgram {
    public static void main(String[] args) {
        int price = 500; // Variable for how much this is going to cost

        // Age Scanner
        Scanner obj1 = new Scanner(System.in);
        System.out.println("How old are you: "); // input age
        int age = obj1.nextInt();

        // Calculates price based on age
        if (age < 18) {
            System.out.println("You are not eligible for insurance.");
        } else {

            if (age < 25) {
                price += 100;}
            
            // History Scanner
            Scanner obj2 = new Scanner(System.in);
            System.out.println("Number of previous accidents: "); // input history
            int hist = obj2.nextInt();

            // Calculates price based on history
            if (hist > 5) {
                System.out.println("You are not eligible for insurance.");
            } else {
                
                // Convert number of accidents to money owed
                    if (true) {
                        switch (hist) {
                            case 0: 
                                price += 0;
                                break;
                            case 1: 
                                price += 50;
                                break;
                            case 2: 
                                price += 125;
                                break;
                            case 3: 
                                price += 225;
                                break;
                            case 4: 
                                price += 375;
                                break;
                            case 5: 
                                price += 575;
                                break;
                            }
                    }
                    System.out.println("Your total is: " + price); // Output
                }
        }   
        }
    }