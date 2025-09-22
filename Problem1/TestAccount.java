package Problem1;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("1", "John Doe", 5000); // Initialize acc1
        Account acc2 = new Account("2", "James Smith", 4000); // Inititalize acc2

        System.out.println(acc1.getBalance()); // Get initial balance of acc1
        System.out.println(acc2.getBalance()); // Get initial balance of acc2

        acc1.transferTo(acc2, 1000); // Transfer 1000 from acc1 to acc2
        System.out.println(); // Line for blank space

        System.out.println(acc1.getBalance()); // Get changed balance of acc1
        System.out.println(acc2.getBalance()); // Get changed balance of acc1
    }
    
}
