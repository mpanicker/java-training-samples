package com.genius.samples.oops.encapsulation;

class Account {
    private int account_number;
    private int account_balance;

    public Account() {
    }

    public Account(int balance) {
        this.account_balance = balance;
    }

    public static void main(String[] args) {

        Account a = new Account(1000);
        //a.account_balance is not accesible

        //a hacker cannot reduce my balance
        a.deposit(-100); //this will not work

        //we can only show the account balance through a public method
        a.showData(); //only this is possible
    }

    public void showData() {
        //code to show data
        System.out.println("My Account Balance is:"+account_balance);
    }

    public void deposit(int amt) {
        if (amt < 0) {
            System.out.println("Error!! Operation not allowed");
        } else
            account_balance = account_balance + amt;
    }
}