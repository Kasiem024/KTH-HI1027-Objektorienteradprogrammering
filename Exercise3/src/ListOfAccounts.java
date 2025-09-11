import java.util.ArrayList;

/**
 * A class representing a list of bank accounts.
 * If the internal array is full, the array is
 * automatically resized.
 */
public class ListOfAccounts {

    private final ArrayList<Account> accs;

    public ListOfAccounts() {
        accs = new ArrayList<>();
    }

    public void addAccount(Account a) {
        accs.add(a);
    }

    public double getTotalBalance() {
        double total = 0;
        for (Account acc : accs) {
            total = total + acc.getBalance();
        }
        return total;
    }

    public Account findAccount(String name) {
        Account a = null; // initialize
        for (Account acc : accs) {
            if (acc.getName().equals(name)) {
                a = acc;
                break;
            }
        }
        return a;
    }

    /*
     * Return a copy of the private array -
     * "return theList;" would return the address/reference
     * to the private array(!)
     */
    public Account[] getTheAccounts() {
        return accs.toArray(new Account[0]);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("The accounts\n");
        info.append("============\n");
        for (Account acc : accs) {
            info.append(acc.toString()).append("\n");
        }
        return info.toString();
    }
}