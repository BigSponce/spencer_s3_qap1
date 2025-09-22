package Problem1;

public class Account {
        // Inititalize the arguments
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) { // Create a new account without a balance
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) { // Create a new account with a balance
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() { // Get the ID
        return id;
    }

    public String getName() { // Get the name from the account
        return name;
    }

    public int getBalance() { // Get the balance of an account
        return balance;
    }

    public int credit(int amount) { // Add an amount to the balance
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) { // Check if the amount is over the balance and output a message if it does exceed
        if (amount <= balance) {
            this.balance  -= amount;
            
        } else {
            System.out.println("Amount exceeded balance.");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount) { // Transfer an amount between accounts
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance.");
        }
        return this.balance;
    }

    public String toString() { // Turns the account info into a readable string
        return ("Account ID: " + id + ", Name: " + name + ", Balance: " + balance);
    }
}