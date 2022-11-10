package com.kodilla.bank.homewor;

public class Bank {
    private int[] values;
    private int size;

    public Bank() {
        this.values = new int[0];
        this.size = 0;
    }


    public double getBalance() {
        return 0;
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public void addCashMachine(CashMachine machine) {

    }

    public int getNumberOfIncomes() {
        return 0;
    }

    public int getNumberOfWithdraws() {
        return 0;
    }

    public double averageOfIncomes() {
        return 0;
    }

    public double averageOfWithdraws() {
        return 0;
    }
}

