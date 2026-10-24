class BankAccount{
    int balance = 1000;

    synchronized void withdraw(int amount){
        System.out.println();
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);

        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawel Successfull!");

            System.out.println("Balance: " + balance);
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }
}

class BankThread extends Thread{
    BankAccount acc;
    int amt;

    BankThread(BankAccount account, int amount){
        this.acc = account;
        this.amt = amount;
    }

    public void run(){
        acc.withdraw(amt);
    }
}

public class multiThreadBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        BankThread t1 = new BankThread(account, 700);
        BankThread t2 = new BankThread(account, 500);

        t1.setName("Aristo");
        t2.setName("Ace");

        t1.start();
        t2.start();
    }
}