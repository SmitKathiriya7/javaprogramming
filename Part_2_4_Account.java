package assignment_2;
import java.util.Date;

public class Part_2_4_Account {
    private int id;
    private double balance;
    private static double InterestRate;
    private Date dateCreated;

    Part_2_4_Account() {
        //defalt constucter

    }

    Part_2_4_Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        InterestRate = 0;
        dateCreated = new Date();
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

    public static double getInterestRate() {
        return InterestRate;
    }

    public static void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void Deposit(double a)
    {
        balance =balance+a;

    }
    public void withdraw(double b)
    {
        balance =balance-b;

    }
    public String toString() {
        return "\nAccount ID: " + id
                + "\nDate: " + getDateCreated()
                + "\nBalance IS: " + String.format("%.4f", balance) ;

    }


}
