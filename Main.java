public class Main {
    public static void main(String[] args)
    {
        Account acc = new Account(1122,20000);
        acc.setAnnualIR(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println(acc.getBalance());
        System.out.println(acc.getMonthlyInterest());
        System.out.println(acc.getDateCreated());
    }
}