package demo02;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {//取款
        if (balance < amount) {
            System.out.println("余额不足，取款失败");
        }
        else {
            balance -= amount;
            System.out.print("成功取出" + amount );
            System.out.println("余额为" + balance);
        }

    }

    public void deposit(double amount) {//存款
        if(amount > 0) {
            balance += amount;
            System.out.print("成功存入" + amount);
            System.out.println("余额为" + balance);
        }
        else {
            System.out.println("存款失败");
        }
    }
}
