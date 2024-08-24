package com.BankAccount;

public class BankAccountToAccessMoney {

    private long accountNo;
    private String accountHolderName;
    private long balance;
    public BankAccountToAccessMoney(long accountNo, String accountHolder,
                                    long balance)
    {
        this.accountHolderName =accountHolder;
        this.accountNo=accountNo;
        this.balance=balance;
    }

    public void withdraw(long amount)
    {
           if(amount<=balance)
           {
               System.out.println("Current Balance Is = "+(balance-=amount) );
           }
           else{
               System.out.println("Not Sufficient money, the money is = "+balance);
           }

    }
    public void deposit(long cash)
    {
        if(cash <=0) {
            System.out.println("invalid cash, not deposited = "+cash);
        }
        else {
            balance += cash;
            System.out.println("cash is deposited current balance is = " + balance);
        }
    }


}
