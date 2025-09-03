/*
 * An enhanced version of Account3
 * - using the "this" keyword to distinguish between data members
 *   and local variables
 * - overloading the constructor
 * - handling illegal values in deposit/withdraw by throwing an
 *   exception, i.e. terminating the execution
 */
public class Account {

    // private fields
    private double balance;
    private final String name;
    private final Long accNum;

    // constructors, called when an object/instance is created
    public Account(String name, Long accNum, double balance) {
        this.name = name;
        this.balance = balance;
        this.accNum = accNum;
    }

    // access methods
    public double getBalance() {
        return balance; // return a copy of the value
    }

    public String getName() {
        return name;
    }

    public Long getAccNum() {
        return accNum;
    }

    // mutator methods
    public void deposit(double amount) {
        if (amount < 0) {
            // unexpected - terminate execution
            throw new IllegalArgumentException();
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }

    // other methods
    @Override
    public String toString() {
        String info = "name: " + name + ", number: " + accNum + ", balance: ";
        info += String.format("%.2f", balance);
        return info;
    }
}
