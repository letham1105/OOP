package lesson5;
class Account{
    private double balance;
    private long id;
    // constructor
    public Account (double balanceVal, long idVal){
        balance = balanceVal;
        id = idVal;
    }
    public void withdraw (double sum){
        balance -= sum;
    }
    public void deposit (double sum){
        balance +=sum;
    }
    public void details (){
        System.out.println("\nid=" +id);
        System.out.println("balance=" + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account acc1;
        acc1 = new Account(100,123123);
        System.out.println("\ncreating new account");
        acc1.details();
        System.out.println("\ndeposit 2000");
        acc1.deposit(2000);
        acc1.details();
        System.out.println("\nwithdrawing 1000");
        acc1.withdraw(1000);
        acc1.details();
    }
}
