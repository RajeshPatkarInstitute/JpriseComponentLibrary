package com.rajeshpatkar.components.miscellaneous;

public class PiggyBank{

	private String name="";
    private int balance;
    private int lt;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getLt() {
		return lt;
	}

	public void setLt(int lt) {
		this.lt = lt;
	}

	//Constructors
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
    
    //Deposit
    public void deposit(int v) {
        balance = balance + v;
        lt = v;
    }

    //Withdraw
    public void withdraw(int v) {
        if (balance >= v) {
            balance = balance - v;
            lt = -v;
        } else {
            System.out.println("Cannot Withdraw more than the Balance");
        }
    }

    //Statement
    public void statement() {
        System.out.println("Acount Name "+name);
        System.out.println("Balance = " + balance
                + "\n" + "Last Transaction = " + lt);
    }
}
