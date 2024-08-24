package com.BankAccount;

public class MainOfBankAccount {
    public static void main(String[] args) {
        BankAccountToAccessMoney b1 = new BankAccountToAccessMoney(20650010,
                "vishal kumar", 20000);
        b1.withdraw(100);
        b1.deposit(1000);


    }
}
