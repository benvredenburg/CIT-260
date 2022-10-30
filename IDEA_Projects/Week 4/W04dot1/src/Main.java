// source code for W04dot1
// name: Benjamin Vredenburg
// last modified: 10/08/2021
// course: CIT-260

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // Create Scanner object
    Scanner input = new Scanner(System.in);

	// Tell user what the program does.
    System.out.println("\nThis program converts a hexadecimal digit into a four digit binary number.");

    // Prompt user to enter a single hexadecimal digit (0 - 9 or A - F).
    System.out.print("Enter a hexadecimal number (0-9 or A-F): ");

    // Gets the user's input and saves it. If the value is not a valid hexadecimal digit
    // tell the user and terminate the program.
    String hexadecimal = input.nextLine().trim();

    if(hexadecimal.length() > 1) {
        System.out.println("Error: You must enter just one digit.");
        System.exit(1);
    }

    char hexDigit = hexadecimal.charAt(0);

    if(hexDigit < '0' || hexDigit > '9') {
        if(hexDigit < 'A' || hexDigit > 'F') {
            System.out.println("\n" +hexadecimal + " is not a hexadecimal digit.\nGoodbye.");
            System.exit(2);
        }
    }

    // Converts the hexadecimal digit into a four digit binary number.
    // *You may not use any of the conversion methods built into Java, such as toBinaryString(), to do this.
    String binary = "";
    switch(hexadecimal) {
        case "0":
//            hexDigit = '0';
            binary = "0000";
            break;
        case "1":
//            hexDigit = 1;
            binary = "0001";
            break;
        case "2":
//            hexDigit = 2;
            binary = "0010";
            break;
        case "3":
//            hexDigit = 3;
            binary = "0011";
            break;
        case "4":
//            hexDigit = 4;
            binary = "0100";
            break;
        case "5":
//            hexDigit = 5;
            binary = "0101";
            break;
        case "6":
//            hexDigit = 6;
            binary = "0110";
            break;
        case "7":
//            hexDigit = 7;
            binary = "0111";
            break;
        case "8":
//            hexDigit = 8;
            binary = "1000";
            break;
        case "9":
//            hexDigit = 9;
            binary = "1001";
            break;
        case "A":
//            hexDigit = 10;
            binary = "1010";
            break;
        case "B":
//            hexDigit = 11;
            binary = "1011";
            break;
        case "C":
//            hexDigit = 12;
            binary = "1100";
            break;
        case "D":
//            hexDigit = 13;
            binary = "1101";
            break;
        case "E":
//            hexDigit = 14;
            binary = "1110";
            break;
        case "F":
//            hexDigit = 15;
            binary = "1111";
            break;
    }

    // Outputs the four digit binary number, including any leading zeros.
    System.out.println("\nThe binary value is " + binary + ".");

    // Outputs a goodbye message.
    System.out.println("Goodbye.");
    }
}
