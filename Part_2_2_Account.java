package assignment_2;


    import java.util.Date;
import java.util.Date;
import java.util.Scanner;

    public class Part_2_2_Account {
        private int id;
        private double balance;
        private double interestanual;
        private Date dateCreated = new Date();


        public int getId() {
            return id;
        }

        public double getBalance() {
            return balance;
        }

        public double getInterestanual() {
            return interestanual;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setInterestanual(double interestanual) {
            this.interestanual = interestanual;
        }

        void getMonthlyInterestRate()
        {
            System.out.println("ID - "+id);
            System.out.println("BALANCE - "+balance);
            System.out.println("MONTHLY INTEREST RATE - "+interestanual/12);
            System.out.println(dateCreated.toString());
        }

        void getMonthlyInterest()
        {
            System.out.println("ID - "+id);
            System.out.println("BALANCE - "+balance);
            System.out.println("MONTHLY INTEREST _ "+(balance*interestanual)/100 );
            System.out.println(dateCreated.toString());
        }

        Part_2_2_Account()
        {
            id = 0;
            balance = 500;
            interestanual = 7;
        }
        Part_2_2_Account(int n,double m)
        {
            id = n;
            balance = m;
        }

        public static void main(String[] args) {
            Part_2_2_Account a1 = new Part_2_2_Account();
            a1.getMonthlyInterestRate();
            a1.getMonthlyInterest();
        }

    }


