package com.ahsanburney;

public class Main {

    public static void main(String[] args) {
       // BankAccount bobsAccount = new BankAccount("12345",0,"Bob-Brown","bob@gmail.com",123456789 );

        BankAccount bobsAccount = new BankAccount();

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhoneNumber());

        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(50.0);
        bobsAccount.withdrawFunds(50.0);

        bobsAccount.depositFunds(51);
        bobsAccount.withdrawFunds(100);
    }
}
