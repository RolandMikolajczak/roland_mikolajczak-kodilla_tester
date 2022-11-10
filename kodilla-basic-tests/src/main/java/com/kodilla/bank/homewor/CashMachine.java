package com.kodilla.bank.homewor;

public class CashMachine {

    private Bank incomes;

    private Bank withdraws;

    public CashMachine(){
        this.incomes = new Bank();
        this.withdraws = new Bank();

    }
    public double getAverage() {
        double sum = this.incomes.getBalance();
        return sum / (incomes + withdraws);
    }
    public double getIncomesAverage() {
        return this.incomes.averageOfIncomes();
    }

    public void addTransaction(int incomes){
        if (incomes>0){
            this.incomes.add(incomes);}
            else{
                this.withdraws.add(incomes);
            }
        }

    }

