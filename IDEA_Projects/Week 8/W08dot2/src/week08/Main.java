// source code for W08dot2
// name: Benjamin Vredenburg
// last modified: 11/05/2021
// course: CIT-260

package week08;

public class Main {

    public static void main(String[] args) {
        // Tell user what this program does.
        System.out.print("\nThis program tests the BankAccount class by ...\n");

    // Create a BankAccount object with an account number of 123 and an initial
        // balance of $5.00.
        BankAccount bA123 = new BankAccount(123, 5.00);
        System.out.format("...Creating account number " + bA123.getAccountNumber() + " and an " +
                "initial balance of $" + "%.2f%n", bA123.getBalance());

    // Make a deposit of $10.50 into the account.
        System.out.format("...Making a deposit of " + "$%.2f%n", bA123.makeDeposit(10.50));

    // Make a deposit of $3.25 into the account.
        System.out.format("...Making a deposit of " + "$%.2f%n", bA123.makeDeposit(3.25));

    // Make a withdrawal of $1.50 from the account.
        System.out.format("...Making a withdrawal of " + "$%.2f%n", bA123.makeWithdrawal(1.50));

    // Display the current balance in the account.
        System.out.format("The balance in account number " + bA123.getAccountNumber() + " " +
                "is $%.2f%n", bA123.getBalance());

    // Output a goodbye message.
        System.out.println("\nThank you for banking with us today.");
    }
}
