package org.bank.model.classes;
import java.util.Scanner;

public class Conta {
    Scanner scan = new Scanner(System.in);
    final double VALUE_LIMIT_SPECIAL = 500;

    private int accountNumber;
    private TypeAccounts type;
    private int agency;
    protected double balance;
    private Cliente cliente;
    private boolean isSpecial;
    private double withdraw;
    double debt;
    double limitValue = VALUE_LIMIT_SPECIAL;


    public Conta() {}

    public Conta(int accountNumber, TypeAccounts type, int agency,
                 double balance, Cliente cliente, boolean isSpecial,
                 double withdraw) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.agency = agency;
        this.balance = balance;
        this.cliente = cliente;
        this.isSpecial = isSpecial;
        this.withdraw = withdraw;
    }

    public double getVALUE_LIMIT_SPECIAL() {
        return VALUE_LIMIT_SPECIAL;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public TypeAccounts getType() {
        return type;
    }

    public void setType(TypeAccounts type) {
        this.type = type;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public double getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(double limitValue) {
        this.limitValue = limitValue;
    }
}
