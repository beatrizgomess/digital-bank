package org.bank.model.repositorie.conta;

import org.bank.model.classes.Conta;
import org.bank.model.classes.TypeAccounts;

import java.util.Scanner;

public class RepositorieAccount extends Conta {
Scanner scan = new Scanner(System.in);
    //Sacar
    //Consultar saldo comum
    //Consultar saldo especial
    //consultar se é uma conta especial
    // depositar
    // fazer transferência

    double cashDeposit(double value){
        this.balance += value;
        System.out.println("Seu deposito é de: R$" + value );
        return value;
    }

    void consultBalance(){
        System.out.println("Seu saldo é de: " + balance);
        consultspecialcount();

    }

    void consultspecialcount() {
        System.out.println("Sua conta é especial? ");
        if (this.getType() == TypeAccounts.CHECKING_ACCOUNT) {
            if (this.isSpecial()) {
                System.out.println("Sim, sua conta é especial. Você tem " + getLimitValue() + " de limite especial");
            } else {
                System.out.println("Não, sua conta não é especial");
            }
            if (this.isSpecial() && getLimitValue() < 0) {
                System.out.println("Seu limite especial está no negativo: " + getLimitValue());
            } else {
                System.out.println("Sua conta não se encaixa nos requisitos para ter limite especial");
            }
        }

        }

        void withdrawSpecial(){}

        void withdraw(double value){
            if(value <= balance){
                balance -= value;
            }else{
                if(value > balance){
                    System.out.println("Deseja sacar do limite Especial?");
                    char op = scan.next().charAt(0);
                    char opUpperCase = Character.toUpperCase(op);
                    char sim = 'S';
                    if(op == sim){
                        withdrawSpecial();
                    }else{

                    }


                }
            }

        }



}
