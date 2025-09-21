class BankAccount {
    double Balance;

    BankAccount(double initialBalance){
        Balance = initialBalance;
    }
    void deposit(double amount){
        Balance += amount;
        System.out.println("Deposited amount :" + amount);
    }
    void withdraw(double amount){
        if(amount <= Balance){
            Balance -= amount;
            System.out.println("Withdraw amount :" + amount);
        }
        else{
            System.out.println("insaficiant Balance ");
        }
    }
    void displayBalance(){
        System.out.println("Total Balance :"+ Balance);
    }

    
}
class SavingAccount extends BankAccount{
    double interestRate;
    SavingAccount(double initialBalance, double interestRate){
        super(initialBalance);
        this.interestRate = interestRate;
    }
    
    void addinterest(){
        double interest = Balance * interestRate/100;
        Balance += interest;
        System.out.println("interest "+ interest);

    }
}
public class Main_Example {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(1000, 5);
        s1.displayBalance();
        s1.deposit(500);
        s1.withdraw(200);
        s1.addinterest();
        s1.displayBalance();

    }
    
}
