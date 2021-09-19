package com.techreturners.encapsulation.bankaccount.model;

public class DodgyBankAccount {

    private final String accountNumber;
    private int accountBalance;
    private final int rewardAmount = 50;

    public DodgyBankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    public void depositAmount(int amount) {
        accountBalance += amount;
        addReward();
    }

    public void getAccountBalance() {
        System.out.println("Your account balance is " + accountBalance);
    }

    public void debitAmount (int amount) {
        accountBalance -= amount;
    }

    private void addReward() {
        accountBalance += rewardAmount;
    }

}
