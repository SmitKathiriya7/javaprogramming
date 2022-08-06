package assignment_2;

public class Part_2_4_CheckingAccount extends Part_2_4_Account{

    private double OverDraft_Limit;

    Part_2_4_CheckingAccount()
    {
        OverDraft_Limit=-50;

    }
    Part_2_4_CheckingAccount(int id,double balance,double OverDraft_Limit)
    {
        super(id, balance);
        this.OverDraft_Limit = OverDraft_Limit;
    }

    public double getOverDraft_Limit() {
        return OverDraft_Limit;
    }

    public void setOverDraft_Limit(double overDraft_Limit) {
        OverDraft_Limit = overDraft_Limit;
    }

    public void withdraw(double amount) {
        if(getBalance()-amount >OverDraft_Limit)
        {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Amount exceeds overdraft limit.");
    }

    public String ToString()
    {
        return super.toString() + "\nOverdraft limit: $" +
                String.format("%.2f", OverDraft_Limit);


    }

}
