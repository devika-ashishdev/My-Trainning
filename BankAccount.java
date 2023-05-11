class BankAccount {
static double balance = 0;
public static void deposit(double amount) {
balance=balance+amount;
System.out.println("Amount deposited: " + amount);
}

public static void withdraw(double amount) {
if (balance >= amount) {
balance = balance-amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        deposit(1000);
        checkBalance();
        withdraw(500);
        checkBalance();
        withdraw(800);
        checkBalance();
    }
}