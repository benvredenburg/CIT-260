// source code for W06dot2
// name: Benjamin Vredenburg
// last modified: 10/21/2021
// course: CIT-260

public class Main {

    public static void main(String[] args) {

    // Create constant variables for loops.
        double tempCelsius = 40;
        double tempFahrenheit = 120;

	// Tell the user what the program does.
        System.out.println("\nThis program creates two temperature tables showing the conversions\n" +
                "between Celsius and Fahrenheit in a specified range.\n");

    // Create the table headers.
        System.out.print("\nCelsius        Fahrenheit     |    Fahrenheit     Celsius \n");
        System.out.print("----------------------------------------------------------\n");

    // Create loopCount variables for the loop.
        int loopCount = 0;

    // Create a loop to create the tables.
        do{
        // Show the user input for Celsius. (adjusted on each loop)
            System.out.printf("%7.1f", tempCelsius);
        // Show the calculated Fahrenheit temperature, formatted to 1 decimal, aligned to right.
            System.out.printf("%18.1f", celsiusToFahrenheit(tempCelsius));
        // Create a gap and divider for the two tables.
            System.out.print("     |");
        // Show the user input for Fahrenheit. (adjusted on each loop)
            System.out.printf("%14.1f", tempFahrenheit);
        // Show the calculated Celsius temperature, formatted to 2 decimals, aligned to right.
            System.out.printf("%12.2f", fahrenheitToCelsius(tempFahrenheit));
        // Adjust tempCelsius down by one.
            tempCelsius--;
        // Adjust tempFahrenheit down by ten.
            tempFahrenheit -= 10;
        // Adjust the loop count up by one.
            loopCount++;
            System.out.println();
        }
        // Continue the loop until loop count reaches 10.
        while (loopCount < 10);

    // Output a goodbye message
        System.out.print("\n\nHave a wonderful day.\n");
    }

    // Create method for converting Celsius to Fahrenheit
    /***
     * This method takes a provided temperature in Celsius and converts it to Fahrenheit
     * @param tempCelsius
     * @return
     */
    public static double celsiusToFahrenheit(double tempCelsius){

        return tempCelsius * 1.8 + 32;
    }

    // Create method for converting Fahrenheit to Celsius
    /***
     * This method takes a provided temperature in Fahrenheit and converts it to Celsius.
     * @param tempFahrenheit
     * @return
     */
    public static double fahrenheitToCelsius(double tempFahrenheit){

        return (tempFahrenheit - 32) * 5 / 9;
    }
}
