package com.rajeshpatkar.components.miscellaneous;
class PiggyBank{
    private String name="tom";
    private int balance=100;
    private int lt=100;
    PiggyBank(){
        name = "Ravi";
    }
    PiggyBank(String name,int amount){
        this.name = name;
        this.balance = amount;
        lt = amount;
    }
    PiggyBank(String name){
        this(name,300);
    }
    void deposit(int v) {
        balance = balance + v;
        lt = v;
    }

    void withdraw(int v) {
        if (balance >= v) {
            balance = balance - v;
            lt = -v;
        } else {
            System.out.println("Cannot Withdraw more than the Balance");
        }
    }

    void statement() {
        System.out.println("Acount Name "+name);
        System.out.println("Balance = " + balance
                + "\n" + "Last Transaction = " + lt);
    }
}
