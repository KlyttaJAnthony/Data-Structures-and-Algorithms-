/*bank.java
 *coming back to OOP syntax
 */


class BankAccount{
    private double balance;

    public BankAccount(double openingBalance){
        balance = openingBalance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public void display(){
        System.out.println("balance=" + balance);
    }
//the main method can also be ran outside of the BankAccount class in a separate file.
    public static void main(String[] args){
        BankAccount BA1 = new BankAccount(100.00);
        System.out.println("Before txns, ");
        BA1.display();
        BA1.deposit(74.35);
        BA1.withdraw(20.00);
        System.out.println("After txns, ");
        BA1.display();

    }
}
