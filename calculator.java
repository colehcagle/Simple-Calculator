
/**
 * This program is a simple calculator that will take two numbers from the user and output the result of the selected operand.
 *
 * @author Cole Cagle
 * @version 02/17/2022
 */
//Tells the program to take input from the keyboard.
import java.util.Scanner;

//Creates the class.
public class calculator {
        //Creates the main method.
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
            //Defining the variables. 
        double num1;
        double num2;
        double result;
        char operand;
        
            //Prompt user to enter values and pick an operand.
        System.out.println("Enter the first number.");
        num1 = scan.nextDouble();
        System.out.println("Enter the second number.");
        num2 = scan.nextDouble();
            System.out.print("\nEnter an operator (+, -, *, /): ");
            operand = scan.next().charAt(0);
            
            //Tells the program what operands are valid and how to perform the calculations.
            switch(operand) {
                case '+': result = num1 + num2;
                    break;
                    case '-': result = num1 - num2;
                        break;
                    case '*': result = num1 * num2;
                        break;
                    case '/': result = num1 / num2;
                        break;
                default: System.out.printf("Error! Enter a valid operand.");
                    return;
         }
         
         //Tells the program to output the result to the user.
         System.out.print("\nThe result is: \n");
         System.out.printf(num1 + " " + operand + " " + num2 + " = " + result);
    }
}