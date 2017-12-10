package com.rajeshpatkar.components.miscellaneous;
public class PiggyBank{
    private String name="";
    private int balance;
    private int lt;
    public PiggyBank(){
    }
    public PiggyBank(String name,int amount){
        this.name = name;
        this.balance = amount;
        lt = amount;
    }
    public PiggyBank(String name){
        this(name,300);
    }
    public void deposit(int v) {
        balance = balance + v;
        lt = v;
    }

    public void withdraw(int v) {
        if (balance >= v) {
            balance = balance - v;
            lt = -v;
        } else {
            System.out.println("Cannot Withdraw more than the Balance");
        }
    }

    public void statement() {
        System.out.println("Acount Name "+name);
        System.out.println("Balance = " + balance
                + "\n" + "Last Transaction = " + lt);
    }
}
