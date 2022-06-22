package org.bank.model.classes;
import java.util.Scanner;

public class Conta {
    Scanner scan = new Scanner(System.in);
    private int accountNumber;
    private TypeAccounts type;
    private int agency;
    protected double balance;
    private Cliente cliente;
    private boolean isSpecial;
    private LimitSpecial limitSpecial;
    private LimitSpecial withdraw;



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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }



    public void cashDeposit(double value){
        if(value > 0){
            this.balance += value;
        }else{
            new RuntimeException();
            System.out.println("deposit amount denied");
        }
    }

    void consultBalance(){
        System.out.println("Your balance is: R$: " + getBalance());
    }

    void consultSpecialAccount(){
        if(type == type.CHECKING_ACCOUNT){
            if(isSpecial){
                this.limitSpecial = LimitSpecial.VALUE_LIMIT_SPECIAL;
                System.out.println("your account has a special limit on the amount + " + this.limitSpecial);
            }else{
                System.out.println("the special limit on your account is not authorized.");
            }
        }else{
            System.out.println("your account does not meet the special limit requirements");
        }
    }

    void withdrawspeci(){
        consultSpecialAccount();
        double rate = 0.14;
        System.out.println("you will withdraw from your special limit, suffering a jurps fee");
        System.out.println("has " + rate*100 + " interest");
        //LimitSpecial.VALUE_LIMIT_SPECIAL -= withdraw;
        //double debt = withdraw * rate;
        //toPay = money + taxa;
    }

    public void getMoney(double value){
        consultBalance();
        System.out.println("how much do you want to withdraw? ");
        double money = scan.nextDouble();
        if(this.balance > 0 && this.balance <= value){
            balance -= money;
            System.out.println("successful withdrawal amount");
        }else{
            if(this.balance > value){
                if(isSpecial){
                    //if(value > LimitSpecial()){
                        //System.out.println("Unavailable Amount");
                    //}else{

                    }
                }
            }
        }

    public void transferir(double valor, int accountNumber){

    }
}
