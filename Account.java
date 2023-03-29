import java.util.Date;

public class Account
{
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();

    public Account()
    {}
    public Account(int ID, double Bal)
    {
        id=ID;
        balance = Bal;
    }

    public int getId()
    {
        return id;
    }
    public void setId()
    {
        this.id=id;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance()
    {
        this.balance=balance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setAnnualIR(double ir)
    {
        annualInterestRate=ir;
    }
    public Date getDateCreated()
    {
        return dateCreated;
    }

    public double getMonthlyIR()
    {
        return (annualInterestRate/100)/12;
    }
    public double getMonthlyInterest()
    {
        double mIR;
        mIR=getMonthlyIR();
        return balance*mIR;
    }
    public double withdraw(int amount)
    {
        balance-=amount;
        return balance;
    }
    public double deposit(int amount)
    {
        balance+=amount;
        return balance;
    }
}
