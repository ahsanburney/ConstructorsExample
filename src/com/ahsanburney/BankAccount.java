package com.ahsanburney;

/**
 * Created by Kulsum on 5/28/2017.
 */
public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this("56789",0,"default","default",0);
        System.out.println("default constructor called");


    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
      this.accountNumber=accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+ depositAmount + " made. New balance is = "+this.balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if(balance - withdrawalAmount <= 0){
            System.out.println("Only "+this.balance+" available.Withdrawal not processed");
        }else {
            this.balance -=withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+ "processed.Remaining balance = " + this.balance );
        }
    }
}
