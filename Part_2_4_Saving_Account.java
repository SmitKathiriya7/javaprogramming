package assignment_2;

public class Part_2_4_Saving_Account extends Part_2_4_Account  {

    Part_2_4_Saving_Account()
    {
        super();

    }

    Part_2_4_Saving_Account(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount)
    {
        if (amount<getBalance())
        {
            setBalance(getBalance()-amount);
        }
        else{
            System.out.println("This is Saving Account sd it cannot posible to overdraft");
        }
    }
}
