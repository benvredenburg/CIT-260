// source code for BankAccount class
// name: Benjamin Vredenburg
// last modified: 11/05/2021
// course: CIT-260

package week08;

public class BankAccount {
    // Define data members.
    private int accountNumber;
    private double balance;

    /**
     * The no-arg constructor.
     */
    public BankAccount() {
        // define default variables for BankAccount.
        accountNumber = 0;
        balance = 0;
    }

    /**
     * The parameterized constructor.
     * @param accountNumber int
     * @param balance double
     */
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * The getAccountNumber getter method
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * The getBalance getter method.
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * The makeDeposit method.
     * @param deposit double
     * @return deposit
     */
    public double makeDeposit(double deposit) {
        balance += deposit;
        return deposit;
    }

    /**
     * The makeWithdrawal method.
     * @param withdrawal double
     * @return withdrawal
     */
    public double makeWithdrawal(double withdrawal) {
        balance -= withdrawal;
        return withdrawal;
    }
}
